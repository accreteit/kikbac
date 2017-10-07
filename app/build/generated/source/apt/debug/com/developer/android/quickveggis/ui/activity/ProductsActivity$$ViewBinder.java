// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProductsActivity$$ViewBinder<T extends com.developer.android.quickveggis.ui.activity.ProductsActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624081, "field 'drawerLayout'");
    target.drawerLayout = finder.castView(view, 2131624081, "field 'drawerLayout'");
    view = finder.findRequiredView(source, 2131624077, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624077, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624088, "field 'txtFilter'");
    target.txtFilter = finder.castView(view, 2131624088, "field 'txtFilter'");
    view = finder.findRequiredView(source, 2131624086, "field 'categoryMenuLayout'");
    target.categoryMenuLayout = finder.castView(view, 2131624086, "field 'categoryMenuLayout'");
    view = finder.findRequiredView(source, 2131624087, "field 'categoryText'");
    target.categoryText = finder.castView(view, 2131624087, "field 'categoryText'");
    view = finder.findRequiredView(source, 2131624090, "field 'categoryRV'");
    target.categoryRV = finder.castView(view, 2131624090, "field 'categoryRV'");
    view = finder.findRequiredView(source, 2131624089, "field 'dimmer'");
    target.dimmer = finder.castView(view, 2131624089, "field 'dimmer'");
  }

  @Override public void unbind(T target) {
    target.drawerLayout = null;
    target.toolbar = null;
    target.txtFilter = null;
    target.categoryMenuLayout = null;
    target.categoryText = null;
    target.categoryRV = null;
    target.dimmer = null;
  }
}
