// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WalletFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.WalletFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624345, "field 'btnPayout'");
    target.btnPayout = view;
    view = finder.findRequiredView(source, 2131624346, "field 'pagerContainer'");
    target.pagerContainer = finder.castView(view, 2131624346, "field 'pagerContainer'");
    view = finder.findRequiredView(source, 2131624205, "field 'indicator'");
    target.indicator = finder.castView(view, 2131624205, "field 'indicator'");
    view = finder.findRequiredView(source, 2131624343, "field 'txtWalletAmount'");
    target.txtWalletAmount = finder.castView(view, 2131624343, "field 'txtWalletAmount'");
    view = finder.findRequiredView(source, 2131624344, "field 'txtPendingAmount'");
    target.txtPendingAmount = finder.castView(view, 2131624344, "field 'txtPendingAmount'");
    view = finder.findRequiredView(source, 2131624347, "field 'btnSubmit'");
    target.btnSubmit = finder.castView(view, 2131624347, "field 'btnSubmit'");
  }

  @Override public void unbind(T target) {
    target.btnPayout = null;
    target.pagerContainer = null;
    target.indicator = null;
    target.txtWalletAmount = null;
    target.txtPendingAmount = null;
    target.btnSubmit = null;
  }
}
