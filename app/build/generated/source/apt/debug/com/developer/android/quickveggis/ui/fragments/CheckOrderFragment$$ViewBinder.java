// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CheckOrderFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.CheckOrderFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624231, "field 'blockReceipt'");
    target.blockReceipt = view;
    view = finder.findRequiredView(source, 2131624233, "field 'imgReceipt'");
    target.imgReceipt = finder.castView(view, 2131624233, "field 'imgReceipt'");
    view = finder.findRequiredView(source, 2131624234, "field 'imgTop'");
    target.imgTop = finder.castView(view, 2131624234, "field 'imgTop'");
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624235, "field 'btnTrack'");
    target.btnTrack = view;
  }

  @Override public void unbind(T target) {
    target.blockReceipt = null;
    target.imgReceipt = null;
    target.imgTop = null;
    target.btnNext = null;
    target.btnTrack = null;
  }
}
