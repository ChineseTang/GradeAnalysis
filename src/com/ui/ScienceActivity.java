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
		searchChinesebtn.setOnClickListener(this);
		searchMathbtn.setOnClickListener(this);
		searchEnglishbtn.setOnClickListener(this);
		searchPhysicalbtn.setOnClickListener(this);
		searchChemistrybtn.setOnClickListener(this);
		searchBiologybtn.setOnClickListener(this);
		searchTotalbtn.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.addgrade:
			//如果点击添加科目成绩按钮，那么跳转到一个新的界面
			Intent intent = new Intent(ScienceActivity.this,AddScienceActivity.class);
			startActivity(intent);
			break;
		case R.id.searchChinese:
			Intent intent2 = new Intent(ScienceActivity.this,ShowActivity.class);
			intent2.putExtra("subject", 8);
			startActivity(intent2);
			break;
		case R.id.searchMath:
			Intent intent3 = new Intent(ScienceActivity.this,ShowActivity.class);
			intent3.putExtra("subject",9);
			startActivity(intent3);
			break;
		case R.id.searchEnglish:
			Intent intent4 = new Intent(ScienceActivity.this,ShowActivity.class);
			intent4.putExtra("subject",10);
			startActivity(intent4);
			break;
		case R.id.searchPhysical:
			Intent intent5 = new Intent(ScienceActivity.this,ShowActivity.class);
			intent5.putExtra("subject",11);
			startActivity(intent5);
			break;
		case R.id.searchChemistry:
			Intent intent6 = new Intent(ScienceActivity.this,ShowActivity.class);
			intent6.putExtra("subject",12);
			startActivity(intent6);
			break;
		case R.id.searchBiology:
			Intent intent7 = new Intent(ScienceActivity.this,ShowActivity.class);
			intent7.putExtra("subject",13);
			startActivity(intent7);
			break;
		case R.id.searchTotal:
			Intent intent8 = new Intent(ScienceActivity.this,ShowActivity.class);
			intent8.putExtra("subject",14);
			startActivity(intent8);
			break;
		default:
			break;
		}
	}
}
