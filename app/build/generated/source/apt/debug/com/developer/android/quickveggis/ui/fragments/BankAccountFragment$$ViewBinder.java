// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BankAccountFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.BankAccountFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624104, "field 'btnSave'");
    target.btnSave = view;
    view = finder.findRequiredView(source, 2131624156, "field 'edit_userName'");
    target.edit_userName = finder.castView(view, 2131624156, "field 'edit_userName'");
    view = finder.findRequiredView(source, 2131624157, "field 'edit_bankName'");
    target.edit_bankName = finder.castView(view, 2131624157, "field 'edit_bankName'");
    view = finder.findRequiredView(source, 2131624158, "field 'edit_accountNumber'");
    target.edit_accountNumber = finder.castView(view, 2131624158, "field 'edit_accountNumber'");
    view = finder.findRequiredView(source, 2131624159, "field 'edit_ifsc'");
    target.edit_ifsc = finder.castView(view, 2131624159, "field 'edit_ifsc'");
  }

  @Override public void unbind(T target) {
    target.btnSave = null;
    target.edit_userName = null;
    target.edit_bankName = null;
    target.edit_accountNumber = null;
    target.edit_ifsc = null;
  }
}
