// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WishlistFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.WishlistFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624154, "field 'rv'");
    target.rv = finder.castView(view, 2131624154, "field 'rv'");
    view = finder.findRequiredView(source, 2131624278, "field 'wishListLoadingPage'");
    target.wishListLoadingPage = finder.castView(view, 2131624278, "field 'wishListLoadingPage'");
    view = finder.findRequiredView(source, 2131624280, "field 'noProudctsLayout'");
    target.noProudctsLayout = finder.castView(view, 2131624280, "field 'noProudctsLayout'");
  }

  @Override public void unbind(T target) {
    target.rv = null;
    target.wishListLoadingPage = null;
    target.noProudctsLayout = null;
  }
}
