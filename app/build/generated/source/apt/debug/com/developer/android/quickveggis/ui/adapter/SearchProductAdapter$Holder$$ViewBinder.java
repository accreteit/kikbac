// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SearchProductAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.adapter.SearchProductAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624341, "field 'imgIcon'");
    target.imgIcon = finder.castView(view, 2131624341, "field 'imgIcon'");
    view = finder.findRequiredView(source, 2131624453, "field 'txtSize'");
    target.txtSize = finder.castView(view, 2131624453, "field 'txtSize'");
    view = finder.findRequiredView(source, 2131624452, "field 'txtCategory'");
    target.txtCategory = finder.castView(view, 2131624452, "field 'txtCategory'");
    view = finder.findRequiredView(source, 2131624223, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624223, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624217, "field 'txtPrice'");
    target.txtPrice = finder.castView(view, 2131624217, "field 'txtPrice'");
  }

  @Override public void unbind(T target) {
    target.imgIcon = null;
    target.txtSize = null;
    target.txtCategory = null;
    target.txtTitle = null;
    target.txtPrice = null;
  }
}
