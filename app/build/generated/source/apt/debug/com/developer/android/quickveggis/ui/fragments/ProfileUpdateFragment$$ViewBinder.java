// Generated code from Butter Knife. Do not modify!
package com.developer.android.quickveggis.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ProfileUpdateFragment$$ViewBinder<T extends com.developer.android.quickveggis.ui.fragments.ProfileUpdateFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624180, "field 'header'");
    target.header = finder.castView(view, 2131624180, "field 'header'");
    view = finder.findRequiredView(source, 2131624309, "field 'edtZipCode'");
    target.edtZipCode = finder.castView(view, 2131624309, "field 'edtZipCode'");
    view = finder.findRequiredView(source, 2131624310, "field 'edtReferalCode'");
    target.edtReferalCode = finder.castView(view, 2131624310, "field 'edtReferalCode'");
    view = finder.findRequiredView(source, 2131624311, "field 'radioMale'");
    target.radioMale = finder.castView(view, 2131624311, "field 'radioMale'");
    view = finder.findRequiredView(source, 2131624312, "field 'radioFemale'");
    target.radioFemale = finder.castView(view, 2131624312, "field 'radioFemale'");
    view = finder.findRequiredView(source, 2131624313, "field 'edtBirthday' and method 'onClickBithday'");
    target.edtBirthday = finder.castView(view, 2131624313, "field 'edtBirthday'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBithday();
        }
      });
    view = finder.findRequiredView(source, 2131624314, "field 'rgFamily'");
    target.rgFamily = finder.castView(view, 2131624314, "field 'rgFamily'");
    view = finder.findRequiredView(source, 2131624319, "field 'cbApplyCookHome'");
    target.cbApplyCookHome = finder.castView(view, 2131624319, "field 'cbApplyCookHome'");
    view = finder.findRequiredView(source, 2131624320, "field 'cbApplyBabyProduct'");
    target.cbApplyBabyProduct = finder.castView(view, 2131624320, "field 'cbApplyBabyProduct'");
    view = finder.findRequiredView(source, 2131624321, "field 'cbApplyKidProduct'");
    target.cbApplyKidProduct = finder.castView(view, 2131624321, "field 'cbApplyKidProduct'");
    view = finder.findRequiredView(source, 2131624322, "field 'cbApplyPetOwner'");
    target.cbApplyPetOwner = finder.castView(view, 2131624322, "field 'cbApplyPetOwner'");
    view = finder.findRequiredView(source, 2131624323, "field 'cbApplyNone'");
    target.cbApplyNone = finder.castView(view, 2131624323, "field 'cbApplyNone'");
    view = finder.findRequiredView(source, 2131624324, "field 'cbStylePremiumFan'");
    target.cbStylePremiumFan = finder.castView(view, 2131624324, "field 'cbStylePremiumFan'");
    view = finder.findRequiredView(source, 2131624325, "field 'cbStyleHealthItem'");
    target.cbStyleHealthItem = finder.castView(view, 2131624325, "field 'cbStyleHealthItem'");
    view = finder.findRequiredView(source, 2131624326, "field 'cbStyleBiggestSaving'");
    target.cbStyleBiggestSaving = finder.castView(view, 2131624326, "field 'cbStyleBiggestSaving'");
    view = finder.findRequiredView(source, 2131624327, "field 'cbStyleNewProudcts'");
    target.cbStyleNewProudcts = finder.castView(view, 2131624327, "field 'cbStyleNewProudcts'");
    view = finder.findRequiredView(source, 2131624328, "field 'cbPreferenceVegetarian'");
    target.cbPreferenceVegetarian = finder.castView(view, 2131624328, "field 'cbPreferenceVegetarian'");
    view = finder.findRequiredView(source, 2131624329, "field 'cbPreferenceVagan'");
    target.cbPreferenceVagan = finder.castView(view, 2131624329, "field 'cbPreferenceVagan'");
    view = finder.findRequiredView(source, 2131624330, "field 'cbPreferenceGlutenFree'");
    target.cbPreferenceGlutenFree = finder.castView(view, 2131624330, "field 'cbPreferenceGlutenFree'");
    view = finder.findRequiredView(source, 2131624331, "field 'cbPreferenceMilk'");
    target.cbPreferenceMilk = finder.castView(view, 2131624331, "field 'cbPreferenceMilk'");
    view = finder.findRequiredView(source, 2131624332, "field 'cbPreferencePeanut'");
    target.cbPreferencePeanut = finder.castView(view, 2131624332, "field 'cbPreferencePeanut'");
    view = finder.findRequiredView(source, 2131624333, "field 'cbPreferenceNone'");
    target.cbPreferenceNone = finder.castView(view, 2131624333, "field 'cbPreferenceNone'");
    view = finder.findRequiredView(source, 2131624334, "field 'rgEth'");
    target.rgEth = finder.castView(view, 2131624334, "field 'rgEth'");
    view = finder.findRequiredView(source, 2131624104, "field 'btnSave' and method 'onClickSave'");
    target.btnSave = finder.castView(view, 2131624104, "field 'btnSave'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickSave();
        }
      });
  }

  @Override public void unbind(T target) {
    target.header = null;
    target.edtZipCode = null;
    target.edtReferalCode = null;
    target.radioMale = null;
    target.radioFemale = null;
    target.edtBirthday = null;
    target.rgFamily = null;
    target.cbApplyCookHome = null;
    target.cbApplyBabyProduct = null;
    target.cbApplyKidProduct = null;
    target.cbApplyPetOwner = null;
    target.cbApplyNone = null;
    target.cbStylePremiumFan = null;
    target.cbStyleHealthItem = null;
    target.cbStyleBiggestSaving = null;
    target.cbStyleNewProudcts = null;
    target.cbPreferenceVegetarian = null;
    target.cbPreferenceVagan = null;
    target.cbPreferenceGlutenFree = null;
    target.cbPreferenceMilk = null;
    target.cbPreferencePeanut = null;
    target.cbPreferenceNone = null;
    target.rgEth = null;
    target.btnSave = null;
  }
}
