// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class OrderActivity$$ViewBinder<T extends com.developer.android.quickveggis.ui.activity.OrderActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624105, "field 'tabLayout'");
    target.tabLayout = finder.castView(view, 2131624105, "field 'tabLayout'");
    view = finder.findRequiredView(source, 2131624077, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624077, "field 'toolbar'");
  }

  @Override public void unbind(T target) {
    target.tabLayout = null;
    target.toolbar = null;
  }
}
