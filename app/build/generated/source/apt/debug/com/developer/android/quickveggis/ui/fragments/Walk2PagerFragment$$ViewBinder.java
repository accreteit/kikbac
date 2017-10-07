// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Walk2PagerFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.Walk2PagerFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624102, "field 'bg'");
    target.bg = finder.castView(view, 2131624102, "field 'bg'");
    view = finder.findRequiredView(source, 2131624342, "field 'btnSkip'");
    target.btnSkip = view;
    view = finder.findRequiredView(source, 2131624205, "field 'indicator'");
    target.indicator = finder.castView(view, 2131624205, "field 'indicator'");
    view = finder.findRequiredView(source, 2131624103, "field 'btnNext'");
    target.btnNext = view;
    view = finder.findRequiredView(source, 2131624236, "field 'vp'");
    target.vp = finder.castView(view, 2131624236, "field 'vp'");
  }

  @Override public void unbind(T target) {
    target.bg = null;
    target.btnSkip = null;
    target.indicator = null;
    target.btnNext = null;
    target.vp = null;
  }
}
