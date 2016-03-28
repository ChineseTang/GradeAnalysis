package com.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.controller.ActivityCollector;

public class TitleLayout extends LinearLayout {
	public TitleLayout(Context context,AttributeSet attrs) {
		super(context,attrs);
		LayoutInflater.from(context).inflate(R.layout.titletop, this);
		Button titleBack = (Button) findViewById(R.id.titleback);
		Button logout = (Button) findViewById(R.id.logout);
		titleBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				((Activity) getContext()).finish();
			}
		});
		logout.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				ActivityCollector.finishAll();
				System.exit(0);  
			}
		});
	}
}
