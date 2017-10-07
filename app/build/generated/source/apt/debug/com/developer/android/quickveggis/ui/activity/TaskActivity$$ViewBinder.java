// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TaskActivity$$ViewBinder<T extends com.developer.android.quickveggis.ui.activity.TaskActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624091, "field 'btnClose'");
    target.btnClose = view;
    view = finder.findRequiredView(source, 2131624093, "field 'taskImage'");
    target.taskImage = finder.castView(view, 2131624093, "field 'taskImage'");
  }

  @Override public void unbind(T target) {
    target.btnClose = null;
    target.taskImage = null;
  }
}
