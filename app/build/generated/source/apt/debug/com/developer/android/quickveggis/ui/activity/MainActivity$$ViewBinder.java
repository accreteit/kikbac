// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.developer.android.quickveggis.ui.activity.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624082, "field 'appBarLayout'");
    target.appBarLayout = finder.castView(view, 2131624082, "field 'appBarLayout'");
    view = finder.findRequiredView(source, 2131624081, "field 'mDrawerLayout'");
    target.mDrawerLayout = finder.castView(view, 2131624081, "field 'mDrawerLayout'");
    view = finder.findRequiredView(source, 2131624077, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624077, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624083, "field 'txtOffline'");
    target.txtOffline = finder.castView(view, 2131624083, "field 'txtOffline'");
  }

  @Override public void unbind(T target) {
    target.appBarLayout = null;
    target.mDrawerLayout = null;
    target.toolbar = null;
    target.txtOffline = null;
  }
}
