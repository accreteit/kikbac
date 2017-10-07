// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.LoginFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624138, "field 'btnFacebook' and method 'onClickFaceBookLogin'");
    target.btnFacebook = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickFaceBookLogin();
        }
      });
    view = finder.findRequiredView(source, 2131624140, "field 'btnGoogle' and method 'onClickGoogleLogin'");
    target.btnGoogle = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickGoogleLogin();
        }
      });
    view = finder.findRequiredView(source, 2131624141, "field 'btnSignIn'");
    target.btnSignIn = view;
    view = finder.findRequiredView(source, 2131624142, "field 'btnSignUp'");
    target.btnSignUp = view;
    view = finder.findRequiredView(source, 2131624102, "field 'imgBg'");
    target.imgBg = finder.castView(view, 2131624102, "field 'imgBg'");
    view = finder.findRequiredView(source, 2131624137, "field 'imgLogo'");
    target.imgLogo = finder.castView(view, 2131624137, "field 'imgLogo'");
    view = finder.findRequiredView(source, 2131624139, "field 'fbLoginButton'");
    target.fbLoginButton = finder.castView(view, 2131624139, "field 'fbLoginButton'");
  }

  @Override public void unbind(T target) {
    target.btnFacebook = null;
    target.btnGoogle = null;
    target.btnSignIn = null;
    target.btnSignUp = null;
    target.imgBg = null;
    target.imgLogo = null;
    target.fbLoginButton = null;
  }
}
