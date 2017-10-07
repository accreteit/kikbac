// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NoBankFoundFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.NoBankFoundFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624225, "field 'btnAddAccount'");
    target.btnAddAccount = view;
    view = finder.findRequiredView(source, 2131624135, "field 'image'");
    target.image = finder.castView(view, 2131624135, "field 'image'");
  }

  @Override public void unbind(T target) {
    target.btnAddAccount = null;
    target.image = null;
  }
}
