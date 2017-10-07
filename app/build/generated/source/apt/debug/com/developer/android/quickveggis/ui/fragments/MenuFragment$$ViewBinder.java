// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MenuFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.MenuFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624220, "field 'blockUser'");
    target.blockUser = view;
    view = finder.findRequiredView(source, 2131624221, "field 'imgAvatar'");
    target.imgAvatar = finder.castView(view, 2131624221, "field 'imgAvatar'");
    view = finder.findRequiredView(source, 2131624154, "field 'rv'");
    target.rv = finder.castView(view, 2131624154, "field 'rv'");
    view = finder.findRequiredView(source, 2131624223, "field 'txtName'");
    target.txtName = finder.castView(view, 2131624223, "field 'txtName'");
    view = finder.findRequiredView(source, 2131624222, "field 'txtFirstCharacterName'");
    target.txtFirstCharacterName = finder.castView(view, 2131624222, "field 'txtFirstCharacterName'");
  }

  @Override public void unbind(T target) {
    target.blockUser = null;
    target.imgAvatar = null;
    target.rv = null;
    target.txtName = null;
    target.txtFirstCharacterName = null;
  }
}
