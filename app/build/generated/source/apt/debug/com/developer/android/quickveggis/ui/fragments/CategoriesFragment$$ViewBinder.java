// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CategoriesFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.CategoriesFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624154, "field 'rv'");
    target.rv = finder.castView(view, 2131624154, "field 'rv'");
    view = finder.findRequiredView(source, 2131624204, "field 'mPager'");
    target.mPager = finder.castView(view, 2131624204, "field 'mPager'");
    view = finder.findRequiredView(source, 2131624201, "field 'searchLayout'");
    target.searchLayout = finder.castView(view, 2131624201, "field 'searchLayout'");
    view = finder.findRequiredView(source, 2131624205, "field 'indicator'");
    target.indicator = finder.castView(view, 2131624205, "field 'indicator'");
    view = finder.findRequiredView(source, 2131624203, "field 'firstName'");
    target.firstName = finder.castView(view, 2131624203, "field 'firstName'");
    view = finder.findRequiredView(source, 2131624202, "field 'helloLayout'");
    target.helloLayout = finder.castView(view, 2131624202, "field 'helloLayout'");
  }

  @Override public void unbind(T target) {
    target.rv = null;
    target.mPager = null;
    target.searchLayout = null;
    target.indicator = null;
    target.firstName = null;
    target.helloLayout = null;
  }
}
