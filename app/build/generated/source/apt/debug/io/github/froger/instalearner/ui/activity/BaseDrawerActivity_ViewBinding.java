// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.activity;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.Override;

public class BaseDrawerActivity_ViewBinding<T extends BaseDrawerActivity> extends BaseActivity_ViewBinding<T> {
  @UiThread
  public BaseDrawerActivity_ViewBinding(T target, View source) {
    super(target, source);

    target.drawerLayout = Utils.findRequiredViewAsType(source, R.id.drawerLayout, "field 'drawerLayout'", DrawerLayout.class);
    target.vNavigation = Utils.findRequiredViewAsType(source, R.id.vNavigation, "field 'vNavigation'", NavigationView.class);

    Resources res = source.getResources();
    target.avatarSize = res.getDimensionPixelSize(R.dimen.global_menu_avatar_size);
    target.profilePhoto = res.getString(R.string.user_profile_photo);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.drawerLayout = null;
    target.vNavigation = null;
  }
}
