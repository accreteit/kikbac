// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NotifyFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.NotifyFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624228, "field 'checkBoxSound'");
    target.checkBoxSound = finder.castView(view, 2131624228, "field 'checkBoxSound'");
    view = finder.findRequiredView(source, 2131624229, "field 'checkBoxVibrate'");
    target.checkBoxVibrate = finder.castView(view, 2131624229, "field 'checkBoxVibrate'");
    view = finder.findRequiredView(source, 2131624230, "field 'checkBoxLight'");
    target.checkBoxLight = finder.castView(view, 2131624230, "field 'checkBoxLight'");
  }

  @Override public void unbind(T target) {
    target.checkBoxSound = null;
    target.checkBoxVibrate = null;
    target.checkBoxLight = null;
  }
}
