// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserProfileAdapter$PhotoViewHolder_ViewBinding<T extends UserProfileAdapter.PhotoViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public UserProfileAdapter$PhotoViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.flRoot = Utils.findRequiredViewAsType(source, R.id.flRoot, "field 'flRoot'", FrameLayout.class);
    target.ivPhoto = Utils.findRequiredViewAsType(source, R.id.ivPhoto, "field 'ivPhoto'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.flRoot = null;
    target.ivPhoto = null;

    this.target = null;
  }
}
