// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.activity;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import io.github.froger.instalearner.ui.view.SendCommentButton;
import java.lang.Override;

public class CommentsActivity_ViewBinding<T extends CommentsActivity> extends BaseDrawerActivity_ViewBinding<T> {
  @UiThread
  public CommentsActivity_ViewBinding(T target, View source) {
    super(target, source);

    target.contentRoot = Utils.findRequiredViewAsType(source, R.id.contentRoot, "field 'contentRoot'", LinearLayout.class);
    target.rvComments = Utils.findRequiredViewAsType(source, R.id.rvComments, "field 'rvComments'", RecyclerView.class);
    target.llAddComment = Utils.findRequiredViewAsType(source, R.id.llAddComment, "field 'llAddComment'", LinearLayout.class);
    target.etComment = Utils.findRequiredViewAsType(source, R.id.etComment, "field 'etComment'", EditText.class);
    target.btnSendComment = Utils.findRequiredViewAsType(source, R.id.btnSendComment, "field 'btnSendComment'", SendCommentButton.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.contentRoot = null;
    target.rvComments = null;
    target.llAddComment = null;
    target.etComment = null;
    target.btnSendComment = null;
  }
}
