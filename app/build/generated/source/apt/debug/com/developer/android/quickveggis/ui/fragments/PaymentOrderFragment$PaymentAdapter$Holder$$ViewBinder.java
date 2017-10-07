// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PaymentOrderFragment$PaymentAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.PaymentOrderFragment.PaymentAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624415, "field 'blockSelection'");
    target.blockSelection = view;
    view = finder.findRequiredView(source, 2131624135, "field 'image'");
    target.image = finder.castView(view, 2131624135, "field 'image'");
    view = finder.findRequiredView(source, 2131624445, "field 'imgCards'");
    target.imgCards = finder.castView(view, 2131624445, "field 'imgCards'");
    view = finder.findRequiredView(source, 2131624340, "field 'txtSubitle'");
    target.txtSubitle = finder.castView(view, 2131624340, "field 'txtSubitle'");
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
  }

  @Override public void unbind(T target) {
    target.blockSelection = null;
    target.image = null;
    target.imgCards = null;
    target.txtSubitle = null;
    target.txtTitle = null;
  }
}
