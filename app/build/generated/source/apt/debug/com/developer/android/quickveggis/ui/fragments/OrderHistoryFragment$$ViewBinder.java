// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class OrderHistoryFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.OrderHistoryFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624105, "field 'tabLayout'");
    target.tabLayout = finder.castView(view, 2131624105, "field 'tabLayout'");
    view = finder.findRequiredView(source, 2131624236, "field 'vp'");
    target.vp = finder.castView(view, 2131624236, "field 'vp'");
  }

  @Override public void unbind(T target) {
    target.tabLayout = null;
    target.vp = null;
  }
}
