// Generated code from Butter Knife. Do not modify!
package com.sanxynet.efullnew;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;

import com.sanxynet.efullnew.ui.MainActivity;

import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f080047;

  private View view7f0800ee;

  private View view7f08009f;

  private View view7f0800fa;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.cardPaymentBtn, "field 'cardPayment' and method 'cardPayment'");
    target.cardPayment = Utils.castView(view, R.id.cardPaymentBtn, "field 'cardPayment'", Button.class);
    view7f080047 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cardPayment(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.transactionHistoryBtn, "field 'transactionHistory' and method 'transactionHistory'");
    target.transactionHistory = Utils.castView(view, R.id.transactionHistoryBtn, "field 'transactionHistory'", Button.class);
    view7f0800ee = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.transactionHistory(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.printEODBtn, "field 'printReceipt' and method 'printReceipt'");
    target.printReceipt = Utils.castView(view, R.id.printEODBtn, "field 'printReceipt'", Button.class);
    view7f08009f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.printReceipt(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.userPreferencesBtn, "field 'userPreferences' and method 'userPreferences'");
    target.userPreferences = Utils.castView(view, R.id.userPreferencesBtn, "field 'userPreferences'", Button.class);
    view7f0800fa = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.userPreferences(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cardPayment = null;
    target.transactionHistory = null;
    target.printReceipt = null;
    target.userPreferences = null;

    view7f080047.setOnClickListener(null);
    view7f080047 = null;
    view7f0800ee.setOnClickListener(null);
    view7f0800ee = null;
    view7f08009f.setOnClickListener(null);
    view7f08009f = null;
    view7f0800fa.setOnClickListener(null);
    view7f0800fa = null;
  }
}
