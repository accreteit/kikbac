// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GiftCardConfirmFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.GiftCardConfirmFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624135, "field 'image'");
    target.image = finder.castView(view, 2131624135, "field 'image'");
    view = finder.findRequiredView(source, 2131624217, "field 'txtPrice'");
    target.txtPrice = finder.castView(view, 2131624217, "field 'txtPrice'");
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
  }

  @Override public void unbind(T target) {
    target.image = null;
    target.txtPrice = null;
    target.btnNext = null;
  }
}
