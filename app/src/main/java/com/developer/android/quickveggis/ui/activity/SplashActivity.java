package com.developer.android.quickveggis.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.developer.android.quickveggis.R;
import com.developer.android.quickveggis.api.ServiceAPI;
import com.developer.android.quickveggis.api.response.ResponseCallback;
import com.developer.android.quickveggis.config.Config;
import com.developer.android.quickveggis.controller.CustomerController;
import com.developer.android.quickveggis.controller.SessionController;
import com.developer.android.quickveggis.model.Session;
import com.developer.android.quickveggis.ui.fragments.SplashFragment;
import com.developer.android.quickveggis.ui.utils.FragmentUtils;

import static com.developer.android.quickveggis.App.launched;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        launched = false;

//        try {
//            PackageInfo info = getPackageManager().getPackageInfo(
//                    "com.developer.android.myquickveggis",
//                    PackageManager.GET_SIGNATURES);
//            for (Signature signature : info.signatures) {
//                MessageDigest md = MessageDigest.getInstance("SHA");
//                md.update(signature.toByteArray());
//                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
//            }
//        } catch (PackageManager.NameNotFoundException e) {
//
//        } catch (NoSuchAlgorithmException e) {
//
//        }

        FragmentUtils.changeFragment(this, R.id.content, SplashFragment.newInstance(), false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivityOnCondition();
            }
        }, Config.SPLASH_DELAY_TIME);
    }

    private void startActivityOnCondition(){

        if (SessionController.getInstance().isLoggedInSession()){
            checkTutorial();
            Log.d("session", SessionController.getInstance().getLoggedInSession());
        }else {
            ServiceAPI.newInstance().getSession(new ResponseCallback<Session>() {
                @Override
                public void onSuccess(Session data) {
                    SessionController.getInstance().saveLoginSession(data.getSession());
                    checkTutorial();
                }

                @Override
                public void onFailure(String error) {
                    Toast.makeText(SplashActivity.this, error, Toast.LENGTH_SHORT).show();
                    restartThisActivity();
                }
            });
        }

//            ServiceAPI.newInstance().getSession(new ResponseCallback<Session>() {
//                @Override
//                public void onSuccess(Session data) {
//                    SessionController.getInstance().saveLoginSession(data.getSession());
//                    checkTutorial();
//                }
//
//                @Override
//                public void onFailure(String error) {
//                    Toast.makeText(SplashActivity.this, error, Toast.LENGTH_SHORT).show();
//                    restartThisActivity();
//                }
//            });

    }

    private void checkTutorial(){
        if (SessionController.getInstance().isExistShownFirstTutorial())
        {
            if (CustomerController.getInstance().isCustomerLoggedIn()) {
                startMainActivity();
//                ServiceAPI.newInstance().login(SessionController.getInstance().getLoginUserInfo().getEmail(), SessionController.getInstance().getLoginUserInfo().getPassword(),
//                        new ResponseCallback<Customer>() {
//                            @Override
//                            public void onSuccess(Customer data) {
//                                CustomerController.getInstance().saveLoginCustomer(data);
//                                startMainActivity();
//                            }
//
//                            @Override
//                            public void onFailure(String error) {
//                                Toast.makeText(getApplicationContext(), "Login Failed. Please login", Toast.LENGTH_SHORT).show();
//                                startLoginActivity();
//                            }
//                        });
            }
            else {
                startLoginActivity();
            }
        }
        else {
            startWalk1Activity();
            SessionController.getInstance().setFirstTutorial(true);
        }
    }

    private void startLoginActivity(){
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    private void startWalk1Activity(){
        startActivity(new Intent(this, Walk1Activity.class));
        finish();
    }

    void restartThisActivity(){
        startActivity(new Intent(this, SplashActivity.class));
        finish();
    }

    void startMainActivity(){
        startActivity(MainActivity.getStartIntent(this));
        finish();
    }
}
