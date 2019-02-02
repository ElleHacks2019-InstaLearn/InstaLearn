// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoadingFeedItemView_ViewBinding<T extends LoadingFeedItemView> implements Unbinder {
  protected T target;

  @UiThread
  public LoadingFeedItemView_ViewBinding(T target, View source) {
    this.target = target;

    target.vSendingProgress = Utils.findRequiredViewAsType(source, R.id.vSendingProgress, "field 'vSendingProgress'", SendingProgressView.class);
    target.vProgressBg = Utils.findRequiredView(source, R.id.vProgressBg, "field 'vProgressBg'");
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.vSendingProgress = null;
    target.vProgressBg = null;

    this.target = null;
  }
}
