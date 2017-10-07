// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GroupCameraActivity$$ViewBinder<T extends com.developer.android.quickveggis.ui.activity.GroupCameraActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624171, "field 'btnActionLeft'");
    target.btnActionLeft = finder.castView(view, 2131624171, "field 'btnActionLeft'");
    view = finder.findRequiredView(source, 2131624172, "field 'btnActionRight'");
    target.btnActionRight = finder.castView(view, 2131624172, "field 'btnActionRight'");
    view = finder.findRequiredView(source, 2131624173, "field 'btnCapture'");
    target.btnCapture = finder.castView(view, 2131624173, "field 'btnCapture'");
    view = finder.findRequiredView(source, 2131624168, "field 'btnTips'");
    target.btnTips = view;
    view = finder.findRequiredView(source, 2131624135, "field 'image'");
    target.image = finder.castView(view, 2131624135, "field 'image'");
    view = finder.findRequiredView(source, 2131624154, "field 'rv'");
    target.rv = finder.castView(view, 2131624154, "field 'rv'");
  }

  @Override public void unbind(T target) {
    target.btnActionLeft = null;
    target.btnActionRight = null;
    target.btnCapture = null;
    target.btnTips = null;
    target.image = null;
    target.rv = null;
  }
}
