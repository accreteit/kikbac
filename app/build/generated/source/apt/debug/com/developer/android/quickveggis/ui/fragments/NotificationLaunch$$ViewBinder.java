// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NotificationLaunch$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.NotificationLaunch> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624226, "field 'webView'");
    target.webView = finder.castView(view, 2131624226, "field 'webView'");
    view = finder.findRequiredView(source, 2131624207, "field 'btnDone'");
    target.btnDone = finder.castView(view, 2131624207, "field 'btnDone'");
  }

  @Override public void unbind(T target) {
    target.webView = null;
    target.btnDone = null;
  }
}
