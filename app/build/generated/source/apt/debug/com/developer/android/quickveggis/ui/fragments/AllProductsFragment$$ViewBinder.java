// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AllProductsFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.AllProductsFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624277, "field 'backToTop'");
    target.backToTop = finder.castView(view, 2131624277, "field 'backToTop'");
    view = finder.findRequiredView(source, 2131624041, "field 'scrollView'");
    target.scrollView = finder.castView(view, 2131624041, "field 'scrollView'");
    view = finder.findRequiredView(source, 2131624276, "field 'bottomLayout'");
    target.bottomLayout = finder.castView(view, 2131624276, "field 'bottomLayout'");
    view = finder.findRequiredView(source, 2131624279, "field 'productsLoadingPage'");
    target.productsLoadingPage = finder.castView(view, 2131624279, "field 'productsLoadingPage'");
    view = finder.findRequiredView(source, 2131624280, "field 'noProudctsLayout'");
    target.noProudctsLayout = finder.castView(view, 2131624280, "field 'noProudctsLayout'");
    view = finder.findRequiredView(source, 2131624246, "field 'mainLayout'");
    target.mainLayout = finder.castView(view, 2131624246, "field 'mainLayout'");
    view = finder.findRequiredView(source, 2131624195, "field 'tutorialLayout'");
    target.tutorialLayout = finder.castView(view, 2131624195, "field 'tutorialLayout'");
  }

  @Override public void unbind(T target) {
    target.backToTop = null;
    target.scrollView = null;
    target.bottomLayout = null;
    target.productsLoadingPage = null;
    target.noProudctsLayout = null;
    target.mainLayout = null;
    target.tutorialLayout = null;
  }
}
