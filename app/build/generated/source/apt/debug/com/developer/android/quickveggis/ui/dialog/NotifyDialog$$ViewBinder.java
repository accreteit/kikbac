// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.dialog;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NotifyDialog$$ViewBinder<T extends com.developer.android.quickveggis.ui.dialog.NotifyDialog> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624133, "field 'blockItems'");
    target.blockItems = finder.castView(view, 2131624133, "field 'blockItems'");
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624134, "field 'chDontShow'");
    target.chDontShow = finder.castView(view, 2131624134, "field 'chDontShow'");
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
  }

  @Override public void unbind(T target) {
    target.blockItems = null;
    target.btnNext = null;
    target.chDontShow = null;
    target.txtTitle = null;
  }
}
