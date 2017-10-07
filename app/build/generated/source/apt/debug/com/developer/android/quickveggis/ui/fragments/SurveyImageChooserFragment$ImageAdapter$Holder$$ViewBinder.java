// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SurveyImageChooserFragment$ImageAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.SurveyImageChooserFragment.ImageAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624415, "field 'blockSelection'");
    target.blockSelection = view;
    view = finder.findRequiredView(source, 2131624455, "field 'txtImageTitle'");
    target.txtImageTitle = finder.castView(view, 2131624455, "field 'txtImageTitle'");
    view = finder.findRequiredView(source, 2131624135, "field 'image'");
    target.image = finder.castView(view, 2131624135, "field 'image'");
  }

  @Override public void unbind(T target) {
    target.blockSelection = null;
    target.txtImageTitle = null;
    target.image = null;
  }
}
