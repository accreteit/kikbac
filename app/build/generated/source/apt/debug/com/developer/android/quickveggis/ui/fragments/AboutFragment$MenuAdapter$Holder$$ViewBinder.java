// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutFragment$MenuAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.AboutFragment.MenuAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624413, "field 'txtValue'");
    target.txtValue = finder.castView(view, 2131624413, "field 'txtValue'");
  }

  @Override public void unbind(T target) {
    target.txtTitle = null;
    target.txtValue = null;
  }
}