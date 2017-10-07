// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SignInFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SignInFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624146, "field 'txtCreateAccount' and method 'gotoSignUpScreen'");
    target.txtCreateAccount = view;
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.gotoSignUpScreen();
        }
      });
    view = finder.findRequiredView(source, 2131624145, "field 'btnSignIn' and method 'signin'");
    target.btnSignIn = finder.castView(view, 2131624145, "field 'btnSignIn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.signin();
        }
      });
    view = finder.findRequiredView(source, 2131624143, "field 'txt_email'");
    target.txt_email = finder.castView(view, 2131624143, "field 'txt_email'");
    view = finder.findRequiredView(source, 2131624144, "field 'txt_password'");
    target.txt_password = finder.castView(view, 2131624144, "field 'txt_password'");
  }

  @Override public void unbind(T target) {
    target.txtCreateAccount = null;
    target.btnSignIn = null;
    target.txt_email = null;
    target.txt_password = null;
  }
}
