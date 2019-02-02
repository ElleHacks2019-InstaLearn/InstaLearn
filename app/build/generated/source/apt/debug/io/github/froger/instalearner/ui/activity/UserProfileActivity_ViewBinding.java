// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.activity;

import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import io.github.froger.instalearner.ui.view.RevealBackgroundView;
import java.lang.Override;

public class UserProfileActivity_ViewBinding<T extends UserProfileActivity> extends BaseDrawerActivity_ViewBinding<T> {
  @UiThread
  public UserProfileActivity_ViewBinding(T target, View source) {
    super(target, source);

    target.vRevealBackground = Utils.findRequiredViewAsType(source, R.id.vRevealBackground, "field 'vRevealBackground'", RevealBackgroundView.class);
    target.rvUserProfile = Utils.findRequiredViewAsType(source, R.id.rvUserProfile, "field 'rvUserProfile'", RecyclerView.class);
    target.tlUserProfileTabs = Utils.findRequiredViewAsType(source, R.id.tlUserProfileTabs, "field 'tlUserProfileTabs'", TabLayout.class);
    target.ivUserProfilePhoto = Utils.findRequiredViewAsType(source, R.id.ivUserProfilePhoto, "field 'ivUserProfilePhoto'", ImageView.class);
    target.vUserDetails = Utils.findRequiredView(source, R.id.vUserDetails, "field 'vUserDetails'");
    target.btnFollow = Utils.findRequiredViewAsType(source, R.id.btnFollow, "field 'btnFollow'", Button.class);
    target.vUserStats = Utils.findRequiredView(source, R.id.vUserStats, "field 'vUserStats'");
    target.vUserProfileRoot = Utils.findRequiredView(source, R.id.vUserProfileRoot, "field 'vUserProfileRoot'");
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.vRevealBackground = null;
    target.rvUserProfile = null;
    target.tlUserProfileTabs = null;
    target.ivUserProfilePhoto = null;
    target.vUserDetails = null;
    target.btnFollow = null;
    target.vUserStats = null;
    target.vUserProfileRoot = null;
  }
}
