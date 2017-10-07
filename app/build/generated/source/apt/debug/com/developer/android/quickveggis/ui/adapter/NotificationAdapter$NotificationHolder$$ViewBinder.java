// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NotificationAdapter$NotificationHolder$$ViewBinder<T extends com.developer.android.quickveggis.ui.adapter.NotificationAdapter.NotificationHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624441, "field 'redDot'");
    target.redDot = finder.castView(view, 2131624441, "field 'redDot'");
    view = finder.findRequiredView(source, 2131624442, "field 'imgIcon'");
    target.imgIcon = finder.castView(view, 2131624442, "field 'imgIcon'");
    view = finder.findRequiredView(source, 2131624186, "field 'txtDesc'");
    target.txtDesc = finder.castView(view, 2131624186, "field 'txtDesc'");
    view = finder.findRequiredView(source, 2131624443, "field 'txtTime'");
    target.txtTime = finder.castView(view, 2131624443, "field 'txtTime'");
    view = finder.findRequiredView(source, 2131624444, "field 'imgIndicator'");
    target.imgIndicator = finder.castView(view, 2131624444, "field 'imgIndicator'");
  }

  @Override public void unbind(T target) {
    target.redDot = null;
    target.imgIcon = null;
    target.txtDesc = null;
    target.txtTime = null;
    target.imgIndicator = null;
  }
}
