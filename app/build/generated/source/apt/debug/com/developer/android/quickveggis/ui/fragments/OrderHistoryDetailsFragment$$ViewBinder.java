// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class OrderHistoryDetailsFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.OrderHistoryDetailsFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624241, "field 'blockAddress'");
    target.blockAddress = view;
    view = finder.findRequiredView(source, 2131624133, "field 'blockItems'");
    target.blockItems = finder.castView(view, 2131624133, "field 'blockItems'");
    view = finder.findRequiredView(source, 2131624239, "field 'blockMethod'");
    target.blockMethod = view;
    view = finder.findRequiredView(source, 2131624243, "field 'blockStatus'");
    target.blockStatus = view;
    view = finder.findRequiredView(source, 2131624235, "field 'btnTrack'");
    target.btnTrack = view;
    view = finder.findRequiredView(source, 2131624194, "field 'txtTotal'");
    target.txtTotal = finder.castView(view, 2131624194, "field 'txtTotal'");
    view = finder.findRequiredView(source, 2131624242, "field 'txtPaymentAddress'");
    target.txtPaymentAddress = finder.castView(view, 2131624242, "field 'txtPaymentAddress'");
    view = finder.findRequiredView(source, 2131624244, "field 'txtPaymentStatus'");
    target.txtPaymentStatus = finder.castView(view, 2131624244, "field 'txtPaymentStatus'");
    view = finder.findRequiredView(source, 2131624237, "field 'txtOrderId'");
    target.txtOrderId = finder.castView(view, 2131624237, "field 'txtOrderId'");
    view = finder.findRequiredView(source, 2131624240, "field 'txtStatus'");
    target.txtStatus = finder.castView(view, 2131624240, "field 'txtStatus'");
    view = finder.findRequiredView(source, 2131624238, "field 'txtDate'");
    target.txtDate = finder.castView(view, 2131624238, "field 'txtDate'");
  }

  @Override public void unbind(T target) {
    target.blockAddress = null;
    target.blockItems = null;
    target.blockMethod = null;
    target.blockStatus = null;
    target.btnTrack = null;
    target.txtTotal = null;
    target.txtPaymentAddress = null;
    target.txtPaymentStatus = null;
    target.txtOrderId = null;
    target.txtStatus = null;
    target.txtDate = null;
  }
}
