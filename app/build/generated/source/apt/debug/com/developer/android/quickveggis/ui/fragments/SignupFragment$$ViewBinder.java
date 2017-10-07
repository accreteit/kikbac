// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SignupFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SignupFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624147, "field 'txt_firstname'");
    target.txt_firstname = finder.castView(view, 2131624147, "field 'txt_firstname'");
    view = finder.findRequiredView(source, 2131624148, "field 'txt_lastname'");
    target.txt_lastname = finder.castView(view, 2131624148, "field 'txt_lastname'");
    view = finder.findRequiredView(source, 2131624143, "field 'txt_email'");
    target.txt_email = finder.castView(view, 2131624143, "field 'txt_email'");
    view = finder.findRequiredView(source, 2131624149, "field 'txt_username'");
    target.txt_username = finder.castView(view, 2131624149, "field 'txt_username'");
    view = finder.findRequiredView(source, 2131624150, "field 'txt_password'");
    target.txt_password = finder.castView(view, 2131624150, "field 'txt_password'");
    view = finder.findRequiredView(source, 2131624151, "field 'txtAgree' and method 'onClickAgree'");
    target.txtAgree = finder.castView(view, 2131624151, "field 'txtAgree'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickAgree();
        }
      });
    view = finder.findRequiredView(source, 2131624152, "method 'onLayoutClickAgree'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onLayoutClickAgree();
        }
      });
    view = finder.findRequiredView(source, 2131624153, "method 'signup'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.signup();
        }
      });
  }

  @Override public void unbind(T target) {
    target.txt_firstname = null;
    target.txt_lastname = null;
    target.txt_email = null;
    target.txt_username = null;
    target.txt_password = null;
    target.txtAgree = null;
  }
}
