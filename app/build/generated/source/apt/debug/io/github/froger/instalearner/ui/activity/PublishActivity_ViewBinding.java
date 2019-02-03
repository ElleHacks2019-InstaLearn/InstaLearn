// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;
import butterknife.internal.Utils;
import io.github.froger.instalearner.R;
import java.lang.Override;

public class PublishActivity_ViewBinding<T extends PublishActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131230898;

  private View view2131230897;

  @UiThread
  public PublishActivity_ViewBinding(final T target, View source) {
    super(target, source);

    View view;
    view = Utils.findRequiredView(source, R.id.tbFollowers, "field 'tbFollowers' and method 'onFollowersCheckedChange'");
    target.tbFollowers = Utils.castView(view, R.id.tbFollowers, "field 'tbFollowers'", ToggleButton.class);
    view2131230898 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onFollowersCheckedChange(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.tbDirect, "field 'tbDirect' and method 'onDirectCheckedChange'");
    target.tbDirect = Utils.castView(view, R.id.tbDirect, "field 'tbDirect'", ToggleButton.class);
    view2131230897 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onDirectCheckedChange(p1);
      }
    });
    target.ivPhoto = Utils.findRequiredViewAsType(source, R.id.ivPhoto, "field 'ivPhoto'", ImageView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.tbFollowers = null;
    target.tbDirect = null;
    target.ivPhoto = null;

    ((CompoundButton) view2131230898).setOnCheckedChangeListener(null);
    view2131230898 = null;
    ((CompoundButton) view2131230897).setOnCheckedChangeListener(null);
    view2131230897 = null;
  }
}
