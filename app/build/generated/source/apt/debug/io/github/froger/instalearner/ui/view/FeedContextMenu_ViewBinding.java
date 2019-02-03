// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeedContextMenu_ViewBinding<T extends FeedContextMenu> implements Unbinder {
  protected T target;

  private View view2131230758;

  private View view2131230760;

  private View view2131230754;

  private View view2131230752;

  @UiThread
  public FeedContextMenu_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnReport, "method 'onReportClick'");
    view2131230758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onReportClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnSharePhoto, "method 'onSharePhotoClick'");
    view2131230760 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSharePhotoClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnCopyShareUrl, "method 'onCopyShareUrlClick'");
    view2131230754 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCopyShareUrlClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnCancel, "method 'onCancelClick'");
    view2131230752 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCancelClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (this.target == null) throw new IllegalStateException("Bindings already cleared.");

    view2131230758.setOnClickListener(null);
    view2131230758 = null;
    view2131230760.setOnClickListener(null);
    view2131230760 = null;
    view2131230754.setOnClickListener(null);
    view2131230754 = null;
    view2131230752.setOnClickListener(null);
    view2131230752 = null;

    this.target = null;
  }
}
