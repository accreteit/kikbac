// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SurveyEditFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SurveyEditFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624297, "field 'txtQuestion'");
    target.txtQuestion = finder.castView(view, 2131624297, "field 'txtQuestion'");
    view = finder.findRequiredView(source, 2131624302, "field 'txtAnswer'");
    target.txtAnswer = finder.castView(view, 2131624302, "field 'txtAnswer'");
  }

  @Override public void unbind(T target) {
    target.btnNext = null;
    target.txtQuestion = null;
    target.txtAnswer = null;
  }
}
