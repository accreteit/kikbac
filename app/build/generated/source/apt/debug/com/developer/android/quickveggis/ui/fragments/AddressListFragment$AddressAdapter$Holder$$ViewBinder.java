// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AddressListFragment$AddressAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.AddressListFragment.AddressAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624415, "field 'blockSelection'");
    target.blockSelection = view;
    view = finder.findRequiredView(source, 2131624414, "field 'btnEdit'");
    target.btnEdit = view;
    view = finder.findRequiredView(source, 2131624299, "field 'txtSubitle'");
    target.txtSubitle = finder.castView(view, 2131624299, "field 'txtSubitle'");
    view = finder.findRequiredView(source, 2131624232, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624232, "field 'txtTitle'");
  }

  @Override public void unbind(T target) {
    target.blockSelection = null;
    target.btnEdit = null;
    target.txtSubitle = null;
    target.txtTitle = null;
  }
}
