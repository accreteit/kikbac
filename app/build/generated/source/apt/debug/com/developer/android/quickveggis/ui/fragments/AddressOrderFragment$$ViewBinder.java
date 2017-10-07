// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AddressOrderFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.AddressOrderFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624160, "field 'edAddress1'");
    target.edAddress1 = finder.castView(view, 2131624160, "field 'edAddress1'");
    view = finder.findRequiredView(source, 2131624161, "field 'edAddress2'");
    target.edAddress2 = finder.castView(view, 2131624161, "field 'edAddress2'");
    view = finder.findRequiredView(source, 2131624163, "field 'edMobile'");
    target.edMobile = finder.castView(view, 2131624163, "field 'edMobile'");
    view = finder.findRequiredView(source, 2131624162, "field 'edPhoneCode'");
    target.edPhoneCode = finder.castView(view, 2131624162, "field 'edPhoneCode'");
  }

  @Override public void unbind(T target) {
    target.btnNext = null;
    target.edAddress1 = null;
    target.edAddress2 = null;
    target.edMobile = null;
    target.edPhoneCode = null;
  }
}
