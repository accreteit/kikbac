// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SearchFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SearchFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624287, "field 'searchTextView'");
    target.searchTextView = finder.castView(view, 2131624287, "field 'searchTextView'");
    view = finder.findRequiredView(source, 2131624289, "field 'rvSearch'");
    target.rvSearch = finder.castView(view, 2131624289, "field 'rvSearch'");
    view = finder.findRequiredView(source, 2131624288, "field 'rvHistory'");
    target.rvHistory = finder.castView(view, 2131624288, "field 'rvHistory'");
    view = finder.findRequiredView(source, 2131624218, "field 'emptyLayout'");
    target.emptyLayout = finder.castView(view, 2131624218, "field 'emptyLayout'");
    view = finder.findRequiredView(source, 2131624246, "field 'mainLayout'");
    target.mainLayout = finder.castView(view, 2131624246, "field 'mainLayout'");
  }

  @Override public void unbind(T target) {
    target.searchTextView = null;
    target.rvSearch = null;
    target.rvHistory = null;
    target.emptyLayout = null;
    target.mainLayout = null;
  }
}
