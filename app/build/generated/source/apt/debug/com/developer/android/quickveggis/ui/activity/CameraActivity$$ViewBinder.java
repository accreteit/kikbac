// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CameraActivity$$ViewBinder<T extends com.developer.android.quickveggis.ui.activity.CameraActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131624174, "field 'deviceFlatAlertLayout'");
    target.deviceFlatAlertLayout = finder.castView(view, 2131624174, "field 'deviceFlatAlertLayout'");
    view = finder.findRequiredView(source, 2131624175, "field 'tabFocusLayout'");
    target.tabFocusLayout = finder.castView(view, 2131624175, "field 'tabFocusLayout'");
    view = finder.findRequiredView(source, 2131624176, "field 'longReceiptHint'");
    target.longReceiptHint = finder.castView(view, 2131624176, "field 'longReceiptHint'");
    view = finder.findRequiredView(source, 2131624177, "field 'flashLayout'");
    target.flashLayout = finder.castView(view, 2131624177, "field 'flashLayout'");
    view = finder.findRequiredView(source, 2131624179, "field 'flashOff'");
    target.flashOff = finder.castView(view, 2131624179, "field 'flashOff'");
    view = finder.findRequiredView(source, 2131624178, "field 'flashOn'");
    target.flashOn = finder.castView(view, 2131624178, "field 'flashOn'");
  }

  @Override public void unbind(T target) {
    target.btnActionLeft = null;
    target.btnActionRight = null;
    target.btnCapture = null;
    target.btnTips = null;
    target.image = null;
    target.rv = null;
    target.deviceFlatAlertLayout = null;
    target.tabFocusLayout = null;
    target.longReceiptHint = null;
    target.flashLayout = null;
    target.flashOff = null;
    target.flashOn = null;
  }
}
