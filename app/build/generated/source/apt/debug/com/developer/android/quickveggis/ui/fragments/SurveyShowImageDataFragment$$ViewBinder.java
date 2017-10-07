// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SurveyShowImageDataFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SurveyShowImageDataFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624133, "field 'blockItems'");
    target.blockItems = finder.castView(view, 2131624133, "field 'blockItems'");
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624135, "field 'imageView'");
    target.imageView = finder.castView(view, 2131624135, "field 'imageView'");
  }

  @Override public void unbind(T target) {
    target.blockItems = null;
    target.btnNext = null;
    target.imageView = null;
  }
}
