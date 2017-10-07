// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HistoryListFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.HistoryListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624154, "field 'rv'");
    target.rv = finder.castView(view, 2131624154, "field 'rv'");
    view = finder.findRequiredView(source, 2131624218, "field 'emptyLayout'");
    target.emptyLayout = finder.castView(view, 2131624218, "field 'emptyLayout'");
    view = finder.findRequiredView(source, 2131624219, "field 'redeemHistorySymbolLayout'");
    target.redeemHistorySymbolLayout = finder.castView(view, 2131624219, "field 'redeemHistorySymbolLayout'");
  }

  @Override public void unbind(T target) {
    target.rv = null;
    target.emptyLayout = null;
    target.redeemHistorySymbolLayout = null;
  }
}
