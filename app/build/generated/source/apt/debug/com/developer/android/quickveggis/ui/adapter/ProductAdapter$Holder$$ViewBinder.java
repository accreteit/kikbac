// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProductAdapter$Holder$$ViewBinder<T extends com.developer.android.quickveggis.ui.adapter.ProductAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624341, "field 'imgIcon'");
    target.imgIcon = finder.castView(view, 2131624341, "field 'imgIcon'");
    view = finder.findRequiredView(source, 2131624447, "field 'topLine'");
    target.topLine = view;
    view = finder.findRequiredView(source, 2131624217, "field 'txtPrice'");
    target.txtPrice = finder.castView(view, 2131624217, "field 'txtPrice'");
    view = finder.findRequiredView(source, 2131624092, "field 'txtTitle'");
    target.txtTitle = finder.castView(view, 2131624092, "field 'txtTitle'");
    view = finder.findRequiredView(source, 2131624248, "field 'txtValietyAndSize'");
    target.txtValietyAndSize = finder.castView(view, 2131624248, "field 'txtValietyAndSize'");
    view = finder.findRequiredView(source, 2131624449, "field 'quantity'");
    target.quantity = finder.castView(view, 2131624449, "field 'quantity'");
    view = finder.findRequiredView(source, 2131624448, "field 'quantityLayout'");
    target.quantityLayout = finder.castView(view, 2131624448, "field 'quantityLayout'");
    view = finder.findRequiredView(source, 2131624450, "field 'newBadge'");
    target.newBadge = finder.castView(view, 2131624450, "field 'newBadge'");
  }

  @Override public void unbind(T target) {
    target.imgIcon = null;
    target.topLine = null;
    target.txtPrice = null;
    target.txtTitle = null;
    target.txtValietyAndSize = null;
    target.quantity = null;
    target.quantityLayout = null;
    target.newBadge = null;
  }
}
