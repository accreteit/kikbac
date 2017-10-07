// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SplashFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SplashFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624102, "field 'imgBg'");
    target.imgBg = finder.castView(view, 2131624102, "field 'imgBg'");
    view = finder.findRequiredView(source, 2131624137, "field 'imgLogo'");
    target.imgLogo = finder.castView(view, 2131624137, "field 'imgLogo'");
  }

  @Override public void unbind(T target) {
    target.imgBg = null;
    target.imgLogo = null;
  }
}
