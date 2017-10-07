// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FilterFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.FilterFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624207, "field 'btnDone'");
    target.btnDone = view;
    view = finder.findRequiredView(source, 2131624208, "field 'sortOption1'");
    target.sortOption1 = finder.castView(view, 2131624208, "field 'sortOption1'");
    view = finder.findRequiredView(source, 2131624213, "field 'sortOption2'");
    target.sortOption2 = finder.castView(view, 2131624213, "field 'sortOption2'");
    view = finder.findRequiredView(source, 2131624214, "field 'searchBrand'");
    target.searchBrand = finder.castView(view, 2131624214, "field 'searchBrand'");
    view = finder.findRequiredView(source, 2131624215, "field 'listbrand'");
    target.listbrand = finder.castView(view, 2131624215, "field 'listbrand'");
    view = finder.findRequiredView(source, 2131624216, "field 'btnReset'");
    target.btnReset = view;
    view = finder.findRequiredView(source, 2131624154, "field 'rv'");
    target.rv = finder.castView(view, 2131624154, "field 'rv'");
  }

  @Override public void unbind(T target) {
    target.btnDone = null;
    target.sortOption1 = null;
    target.sortOption2 = null;
    target.searchBrand = null;
    target.listbrand = null;
    target.btnReset = null;
    target.rv = null;
  }
}
