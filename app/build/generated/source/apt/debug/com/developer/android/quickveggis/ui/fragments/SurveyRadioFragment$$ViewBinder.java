// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SurveyRadioFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SurveyRadioFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624232, "field 'txtHeader'");
    target.txtHeader = finder.castView(view, 2131624232, "field 'txtHeader'");
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624208, "field 'radioAnswers'");
    target.radioAnswers = finder.castView(view, 2131624208, "field 'radioAnswers'");
    view = finder.findRequiredView(source, 2131624297, "field 'txtQuestion'");
    target.txtQuestion = finder.castView(view, 2131624297, "field 'txtQuestion'");
    view = finder.findRequiredView(source, 2131624303, "field 'txtError'");
    target.txtError = finder.castView(view, 2131624303, "field 'txtError'");
  }

  @Override public void unbind(T target) {
    target.txtHeader = null;
    target.btnNext = null;
    target.radioAnswers = null;
    target.txtQuestion = null;
    target.txtError = null;
  }
}
