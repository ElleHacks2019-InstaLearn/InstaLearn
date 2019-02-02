// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.activity;

import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> extends BaseDrawerActivity_ViewBinding<T> {
  private View view2131230755;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    super(target, source);

    View view;
    target.rvFeed = Utils.findRequiredViewAsType(source, R.id.rvFeed, "field 'rvFeed'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.btnCreate, "field 'fabCreate' and method 'onTakePhotoClick'");
    target.fabCreate = Utils.castView(view, R.id.btnCreate, "field 'fabCreate'", FloatingActionButton.class);
    view2131230755 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTakePhotoClick();
      }
    });
    target.clContent = Utils.findRequiredViewAsType(source, R.id.content, "field 'clContent'", CoordinatorLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.rvFeed = null;
    target.fabCreate = null;
    target.clContent = null;

    view2131230755.setOnClickListener(null);
    view2131230755 = null;
  }
}
