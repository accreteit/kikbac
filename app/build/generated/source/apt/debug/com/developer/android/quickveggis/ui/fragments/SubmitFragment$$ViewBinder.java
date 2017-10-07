// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SubmitFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SubmitFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624295, "field 'btnCancel'");
    target.btnCancel = finder.castView(view, 2131624295, "field 'btnCancel'");
    view = finder.findRequiredView(source, 2131624292, "field 'circleProgressBar'");
    target.circleProgressBar = finder.castView(view, 2131624292, "field 'circleProgressBar'");
    view = finder.findRequiredView(source, 2131624293, "field 'txtPercent'");
    target.txtPercent = finder.castView(view, 2131624293, "field 'txtPercent'");
    view = finder.findRequiredView(source, 2131624294, "field 'txtProgress'");
    target.txtProgress = finder.castView(view, 2131624294, "field 'txtProgress'");
  }

  @Override public void unbind(T target) {
    target.btnCancel = null;
    target.circleProgressBar = null;
    target.txtPercent = null;
    target.txtProgress = null;
  }
}
