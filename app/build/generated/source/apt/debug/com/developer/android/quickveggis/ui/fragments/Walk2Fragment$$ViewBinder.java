// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Walk2Fragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.Walk2Fragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624135, "field 'image'");
    target.image = finder.castView(view, 2131624135, "field 'image'");
    view = finder.findRequiredView(source, 2131624341, "field 'imgIcon'");
    target.imgIcon = finder.castView(view, 2131624341, "field 'imgIcon'");
    view = finder.findRequiredView(source, 2131624340, "field 'txtSubtitle'");
    target.txtSubtitle = finder.castView(view, 2131624340, "field 'txtSubtitle'");
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
  }

  @Override public void unbind(T target) {
    target.image = null;
    target.imgIcon = null;
    target.txtSubtitle = null;
    target.txtTitle = null;
  }
}
