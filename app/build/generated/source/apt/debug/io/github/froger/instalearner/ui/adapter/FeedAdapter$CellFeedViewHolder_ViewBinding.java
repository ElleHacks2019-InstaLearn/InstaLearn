// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeedAdapter$CellFeedViewHolder_ViewBinding<T extends FeedAdapter.CellFeedViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public FeedAdapter$CellFeedViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ivFeedCenter = Utils.findRequiredViewAsType(source, R.id.ivFeedCenter, "field 'ivFeedCenter'", ImageView.class);
    target.ivFeedBottom = Utils.findRequiredViewAsType(source, R.id.ivFeedBottom, "field 'ivFeedBottom'", ImageView.class);
    target.btnComments = Utils.findRequiredViewAsType(source, R.id.btnComments, "field 'btnComments'", ImageButton.class);
    target.btnLike = Utils.findRequiredViewAsType(source, R.id.btnLike, "field 'btnLike'", ImageButton.class);
    target.btnMore = Utils.findRequiredViewAsType(source, R.id.btnMore, "field 'btnMore'", ImageButton.class);
    target.vBgLike = Utils.findRequiredView(source, R.id.vBgLike, "field 'vBgLike'");
    target.ivLike = Utils.findRequiredViewAsType(source, R.id.ivLike, "field 'ivLike'", ImageView.class);
    target.tsLikesCounter = Utils.findRequiredViewAsType(source, R.id.tsLikesCounter, "field 'tsLikesCounter'", TextSwitcher.class);
    target.ivUserProfile = Utils.findRequiredViewAsType(source, R.id.ivUserProfile, "field 'ivUserProfile'", ImageView.class);
    target.vImageRoot = Utils.findRequiredViewAsType(source, R.id.vImageRoot, "field 'vImageRoot'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivFeedCenter = null;
    target.ivFeedBottom = null;
    target.btnComments = null;
    target.btnLike = null;
    target.btnMore = null;
    target.vBgLike = null;
    target.ivLike = null;
    target.tsLikesCounter = null;
    target.ivUserProfile = null;
    target.vImageRoot = null;

    this.target = null;
  }
}
