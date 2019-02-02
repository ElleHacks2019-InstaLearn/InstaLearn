// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseActivity_ViewBinding<T extends BaseActivity> implements Unbinder {
  protected T target;

  @UiThread
  public BaseActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.toolbar = Utils.findOptionalViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.ivLogo = Utils.findOptionalViewAsType(source, R.id.ivLogo, "field 'ivLogo'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.toolbar = null;
    target.ivLogo = null;

    this.target = null;
  }
}
