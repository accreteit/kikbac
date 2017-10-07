// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BankAccountListFragment$BankAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.BankAccountListFragment.BankAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624415, "field 'blockSelection'");
    target.blockSelection = view;
    view = finder.findRequiredView(source, 2131624414, "field 'btnEdit'");
    target.btnEdit = view;
    view = finder.findRequiredView(source, 2131624232, "field 'txtHeader'");
    target.txtHeader = finder.castView(view, 2131624232, "field 'txtHeader'");
    view = finder.findRequiredView(source, 2131624299, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624299, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624416, "field 'txtBankName'");
    target.txtBankName = finder.castView(view, 2131624416, "field 'txtBankName'");
    view = finder.findRequiredView(source, 2131624417, "field 'txtBranch'");
    target.txtBranch = finder.castView(view, 2131624417, "field 'txtBranch'");
    view = finder.findRequiredView(source, 2131624418, "field 'txtAccountNumber'");
    target.txtAccountNumber = finder.castView(view, 2131624418, "field 'txtAccountNumber'");
    view = finder.findRequiredView(source, 2131624419, "field 'txtIfsc'");
    target.txtIfsc = finder.castView(view, 2131624419, "field 'txtIfsc'");
  }

  @Override public void unbind(T target) {
    target.blockSelection = null;
    target.btnEdit = null;
    target.txtHeader = null;
    target.txtTitle = null;
    target.txtBankName = null;
    target.txtBranch = null;
    target.txtAccountNumber = null;
    target.txtIfsc = null;
  }
}
