// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CartSelectionFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.CartSelectionFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624200, "field 'btnOffline'");
    target.btnOffline = view;
    view = finder.findRequiredView(source, 2131624199, "field 'btnWeDeliver'");
    target.btnWeDeliver = view;
  }

  @Override public void unbind(T target) {
    target.btnOffline = null;
    target.btnWeDeliver = null;
  }
}
