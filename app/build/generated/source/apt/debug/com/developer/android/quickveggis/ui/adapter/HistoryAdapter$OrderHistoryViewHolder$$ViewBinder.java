// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HistoryAdapter$OrderHistoryViewHolder$$ViewBinder<T extends com.developer.android.quickveggis.ui.adapter.HistoryAdapter.OrderHistoryViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624240, "field 'txtStatus'");
    target.txtStatus = finder.castView(view, 2131624240, "field 'txtStatus'");
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624238, "field 'txtDate'");
    target.txtDate = finder.castView(view, 2131624238, "field 'txtDate'");
    view = finder.findRequiredView(source, 2131624438, "field 'cvHistoryItem'");
    target.cvHistoryItem = finder.castView(view, 2131624438, "field 'cvHistoryItem'");
  }

  @Override public void unbind(T target) {
    target.txtStatus = null;
    target.txtTitle = null;
    target.txtDate = null;
    target.cvHistoryItem = null;
  }
}
