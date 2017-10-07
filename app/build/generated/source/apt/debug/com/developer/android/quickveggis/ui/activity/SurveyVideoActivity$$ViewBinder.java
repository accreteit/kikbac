// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SurveyVideoActivity$$ViewBinder<T extends com.developer.android.quickveggis.ui.activity.SurveyVideoActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624091, "field 'btnClose'");
    target.btnClose = view;
    view = finder.findRequiredView(source, 2131624100, "field 'btnUnlock'");
    target.btnUnlock = finder.castView(view, 2131624100, "field 'btnUnlock'");
    view = finder.findRequiredView(source, 2131624094, "field 'txtHeader'");
    target.txtHeader = finder.castView(view, 2131624094, "field 'txtHeader'");
    view = finder.findRequiredView(source, 2131624095, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624095, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624099, "field 'txtDescription'");
    target.txtDescription = finder.castView(view, 2131624099, "field 'txtDescription'");
    view = finder.findRequiredView(source, 2131624097, "field 'playerView'");
    target.playerView = finder.castView(view, 2131624097, "field 'playerView'");
    view = finder.findRequiredView(source, 2131624098, "field 'btnPlayVideo'");
    target.btnPlayVideo = finder.castView(view, 2131624098, "field 'btnPlayVideo'");
    view = finder.findRequiredView(source, 2131624093, "field 'taskImage'");
    target.taskImage = finder.castView(view, 2131624093, "field 'taskImage'");
  }

  @Override public void unbind(T target) {
    target.btnClose = null;
    target.btnUnlock = null;
    target.txtHeader = null;
    target.txtTitle = null;
    target.txtDescription = null;
    target.playerView = null;
    target.btnPlayVideo = null;
    target.taskImage = null;
  }
}
