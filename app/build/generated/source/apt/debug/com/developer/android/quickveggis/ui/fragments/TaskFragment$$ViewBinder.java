// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TaskFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.TaskFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624135, "field 'img_task'");
    target.img_task = finder.castView(view, 2131624135, "field 'img_task'");
    view = finder.findRequiredView(source, 2131624232, "field 'txtHeader'");
    target.txtHeader = finder.castView(view, 2131624232, "field 'txtHeader'");
    view = finder.findRequiredView(source, 2131624186, "field 'txtDescription'");
    target.txtDescription = finder.castView(view, 2131624186, "field 'txtDescription'");
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
  }

  @Override public void unbind(T target) {
    target.btnNext = null;
    target.img_task = null;
    target.txtHeader = null;
    target.txtDescription = null;
    target.txtTitle = null;
  }
}
