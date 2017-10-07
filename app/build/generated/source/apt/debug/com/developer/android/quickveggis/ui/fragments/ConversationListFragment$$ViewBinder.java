// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ConversationListFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.ConversationListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624164, "field 'fab'");
    target.fab = view;
    view = finder.findRequiredView(source, 2131624154, "field 'rv'");
    target.rv = finder.castView(view, 2131624154, "field 'rv'");
  }

  @Override public void unbind(T target) {
    target.fab = null;
    target.rv = null;
  }
}
