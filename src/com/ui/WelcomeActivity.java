package com.ui;

import com.controller.MyApplication;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class WelcomeActivity extends BaseActivity {
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_welcome);
		tv = (TextView) findViewById(R.id.susername);
		tv.setText("»¶Ó­" + MyApplication.getUsername() + "Í¬Ñ§");
	}
}
