package com.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.controller.MyApplication;

public class WelcomeActivity extends BaseActivity implements OnClickListener{
	private TextView tv;
	private Button addgradebtn;
	private Button searchChinesebtn;
	private Button searchMathbtn;
	private Button searchEnglishbtn;
	private Button searchPoliticsbtn;
	private Button searchHistorybtn;
	private Button searchGeologybtn;
	private Button searchTotalbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_welcome);
		
		tv = (TextView) findViewById(R.id.susername);
		addgradebtn = (Button) findViewById(R.id.addgrade);
		searchChinesebtn = (Button) findViewById(R.id.searchChinese);
		searchMathbtn = (Button) findViewById(R.id.searchMath);
		searchEnglishbtn = (Button) findViewById(R.id.searchEnglish);
		searchPoliticsbtn = (Button) findViewById(R.id.searchPolitics);
		searchHistorybtn = (Button) findViewById(R.id.searchHistory);
		searchGeologybtn = (Button) findViewById(R.id.searchGeology);
		searchTotalbtn = (Button) findViewById(R.id.searchTotal);
		
		tv.setText("欢迎  " + MyApplication.getUser().getuName() + " 同学" + ":" + MyApplication.getUser().getuType());
		addgradebtn.setOnClickListener(this);
		searchChinesebtn.setOnClickListener(this);
		searchMathbtn.setOnClickListener(this);
		searchEnglishbtn.setOnClickListener(this);
		searchPoliticsbtn.setOnClickListener(this);
		searchHistorybtn.setOnClickListener(this);
		searchGeologybtn.setOnClickListener(this);
		searchTotalbtn.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.addgrade:
			//如果点击添加科目成绩按钮，那么跳转到一个新的界面
			Intent intent = new Intent(WelcomeActivity.this,AddGradeActivity.class);
			startActivity(intent);
			break;
		case R.id.searchChinese:
			Intent intent2 = new Intent(WelcomeActivity.this,ShowActivity.class);
			intent2.putExtra("subject", 1);
			startActivity(intent2);
			break;
		case R.id.searchMath:
			Intent intent3 = new Intent(WelcomeActivity.this,ShowActivity.class);
			intent3.putExtra("subject",2);
			startActivity(intent3);
			break;
		case R.id.searchEnglish:
			Intent intent4 = new Intent(WelcomeActivity.this,ShowActivity.class);
			intent4.putExtra("subject",3);
			startActivity(intent4);
			break;
		case R.id.searchPolitics:
			Intent intent5 = new Intent(WelcomeActivity.this,ShowActivity.class);
			intent5.putExtra("subject",4);
			startActivity(intent5);
			break;
		case R.id.searchHistory:
			Intent intent6 = new Intent(WelcomeActivity.this,ShowActivity.class);
			intent6.putExtra("subject",5);
			startActivity(intent6);
			break;
		case R.id.searchGeology:
			Intent intent7 = new Intent(WelcomeActivity.this,ShowActivity.class);
			intent7.putExtra("subject",6);
			startActivity(intent7);
			break;
		case R.id.searchTotal:
			Intent intent8 = new Intent(WelcomeActivity.this,ShowActivity.class);
			intent8.putExtra("subject",7);
			startActivity(intent8);
			break;
			
		default:
			break;
		}
	}
}
