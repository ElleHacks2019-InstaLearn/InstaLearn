// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CommentsAdapter$CommentViewHolder_ViewBinding<T extends CommentsAdapter.CommentViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public CommentsAdapter$CommentViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ivUserAvatar = Utils.findRequiredViewAsType(source, R.id.ivUserAvatar, "field 'ivUserAvatar'", ImageView.class);
    target.tvComment = Utils.findRequiredViewAsType(source, R.id.tvComment, "field 'tvComment'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivUserAvatar = null;
    target.tvComment = null;

    this.target = null;
  }
}
