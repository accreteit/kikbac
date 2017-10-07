// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TimeRangeFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.TimeRangeFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624305, "field 'imgMoring'");
    target.imgMoring = finder.castView(view, 2131624305, "field 'imgMoring'");
    view = finder.findRequiredView(source, 2131624306, "field 'imgNoon'");
    target.imgNoon = finder.castView(view, 2131624306, "field 'imgNoon'");
    view = finder.findRequiredView(source, 2131624307, "field 'imgEven'");
    target.imgEven = finder.castView(view, 2131624307, "field 'imgEven'");
  }

  @Override public void unbind(T target) {
    target.imgMoring = null;
    target.imgNoon = null;
    target.imgEven = null;
  }
}
