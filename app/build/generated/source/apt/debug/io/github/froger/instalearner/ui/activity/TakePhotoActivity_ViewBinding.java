// Generated code from Butter Knife. Do not modify!
package io.github.froger.instalearner.ui.activity;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.commonsware.cwac.camera.CameraView;
import io.github.froger.instalearner.R;
import io.github.froger.instalearner.ui.view.RevealBackgroundView;
import java.lang.Override;

public class TakePhotoActivity_ViewBinding<T extends TakePhotoActivity> extends BaseActivity_ViewBinding<T> {
  private View view2131230762;

  private View view2131230750;

  @UiThread
  public TakePhotoActivity_ViewBinding(final T target, View source) {
    super(target, source);

    View view;
    target.vRevealBackground = Utils.findRequiredViewAsType(source, R.id.vRevealBackground, "field 'vRevealBackground'", RevealBackgroundView.class);
    target.vTakePhotoRoot = Utils.findRequiredView(source, R.id.vPhotoRoot, "field 'vTakePhotoRoot'");
    target.vShutter = Utils.findRequiredView(source, R.id.vShutter, "field 'vShutter'");
    target.ivTakenPhoto = Utils.findRequiredViewAsType(source, R.id.ivTakenPhoto, "field 'ivTakenPhoto'", ImageView.class);
    target.vUpperPanel = Utils.findRequiredViewAsType(source, R.id.vUpperPanel, "field 'vUpperPanel'", ViewSwitcher.class);
    target.vLowerPanel = Utils.findRequiredViewAsType(source, R.id.vLowerPanel, "field 'vLowerPanel'", ViewSwitcher.class);
    target.cameraView = Utils.findRequiredViewAsType(source, R.id.cameraView, "field 'cameraView'", CameraView.class);
    target.rvFilters = Utils.findRequiredViewAsType(source, R.id.rvFilters, "field 'rvFilters'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.btnTakePhoto, "field 'btnTakePhoto' and method 'onTakePhotoClick'");
    target.btnTakePhoto = Utils.castView(view, R.id.btnTakePhoto, "field 'btnTakePhoto'", Button.class);
    view2131230762 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTakePhotoClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnAccept, "method 'onAcceptClick'");
    view2131230750 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAcceptClick();
      }
    });
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.vRevealBackground = null;
    target.vTakePhotoRoot = null;
    target.vShutter = null;
    target.ivTakenPhoto = null;
    target.vUpperPanel = null;
    target.vLowerPanel = null;
    target.cameraView = null;
    target.rvFilters = null;
    target.btnTakePhoto = null;

    view2131230762.setOnClickListener(null);
    view2131230762 = null;
    view2131230750.setOnClickListener(null);
    view2131230750 = null;
  }
}
