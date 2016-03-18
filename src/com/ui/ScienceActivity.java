package com.ui;

import com.controller.MyApplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ScienceActivity extends BaseActivity implements OnClickListener{
	private TextView tv;
	private Button addgradebtn;
	private Button searchChinesebtn;
	private Button searchMathbtn;
	private Button searchEnglishbtn;
	private Button searchPhysicalbtn;
	private Button searchChemistrybtn;
	private Button searchBiologybtn;
	private Button searchTotalbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_science);
		tv = (TextView) findViewById(R.id.susername);
		addgradebtn = (Button) findViewById(R.id.addgrade);
		searchChinesebtn = (Button) findViewById(R.id.searchChinese);
		searchMathbtn = (Button) findViewById(R.id.searchMath);
		searchEnglishbtn = (Button) findViewById(R.id.searchEnglish);
		searchPhysicalbtn = (Button) findViewById(R.id.searchPhysical);
		searchChemistrybtn = (Button) findViewById(R.id.searchChemistry);
		searchBiologybtn = (Button) findViewById(R.id.searchBiology);
		searchTotalbtn = (Button) findViewById(R.id.searchTotal);
		
		tv.setText("欢迎  " + MyApplication.getUser().getuName() + " 同学" + ":" + MyApplication.getUser().getuType());
		addgradebtn.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.addgrade:
			//如果点击添加科目成绩按钮，那么跳转到一个新的界面
			Intent intent = new Intent(ScienceActivity.this,AddScienceActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}
