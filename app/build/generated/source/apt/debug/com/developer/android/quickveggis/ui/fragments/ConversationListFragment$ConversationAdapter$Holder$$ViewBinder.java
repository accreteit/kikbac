// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ConversationListFragment$ConversationAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.ConversationListFragment.ConversationAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624436, "field 'txtMessage'");
    target.txtMessage = finder.castView(view, 2131624436, "field 'txtMessage'");
    view = finder.findRequiredView(source, 2131624437, "field 'txtWho'");
    target.txtWho = finder.castView(view, 2131624437, "field 'txtWho'");
  }

  @Override public void unbind(T target) {
    target.txtMessage = null;
    target.txtWho = null;
  }
}
