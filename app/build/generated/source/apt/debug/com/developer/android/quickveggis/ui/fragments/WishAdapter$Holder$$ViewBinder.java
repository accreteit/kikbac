// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WishAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.WishAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624456, "field 'btnRemove'");
    target.btnRemove = view;
    view = finder.findRequiredView(source, 2131624341, "field 'imgIcon'");
    target.imgIcon = finder.castView(view, 2131624341, "field 'imgIcon'");
    view = finder.findRequiredView(source, 2131624447, "field 'topLine'");
    target.topLine = view;
    view = finder.findRequiredView(source, 2131624217, "field 'txtPrice'");
    target.txtPrice = finder.castView(view, 2131624217, "field 'txtPrice'");
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624248, "field 'txtVarietyAndSize'");
    target.txtVarietyAndSize = finder.castView(view, 2131624248, "field 'txtVarietyAndSize'");
  }

  @Override public void unbind(T target) {
    target.btnRemove = null;
    target.imgIcon = null;
    target.topLine = null;
    target.txtPrice = null;
    target.txtTitle = null;
    target.txtVarietyAndSize = null;
  }
}
