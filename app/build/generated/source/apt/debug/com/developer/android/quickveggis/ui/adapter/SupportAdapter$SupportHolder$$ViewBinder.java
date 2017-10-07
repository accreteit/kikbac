// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SupportAdapter$SupportHolder$$ViewBinder<T extends com.developer.android.quickveggis.ui.adapter.SupportAdapter.SupportHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624341, "field 'imgIcon'");
    target.imgIcon = finder.castView(view, 2131624341, "field 'imgIcon'");
    view = finder.findRequiredView(source, 2131624223, "field 'txtName'");
    target.txtName = finder.castView(view, 2131624223, "field 'txtName'");
    view = finder.findRequiredView(source, 2131624186, "field 'txtDesc'");
    target.txtDesc = finder.castView(view, 2131624186, "field 'txtDesc'");
  }

  @Override public void unbind(T target) {
    target.imgIcon = null;
    target.txtName = null;
    target.txtDesc = null;
  }
}
