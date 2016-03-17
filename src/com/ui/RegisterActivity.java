package com.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import com.controller.InforController;
import com.controller.MyApplication;

public class RegisterActivity extends BaseActivity {
	private Button regbtn;
	private EditText reUsername;//用户名唯一性
	private EditText rePwd;//密码
	private EditText rrePwd;//重新输入的密码
	private RadioGroup rg;//单选按钮，选择文科还是理科
	private RadioButton rba;//文科
	private RadioButton rbs;//理科
	
	private String username;
	private String pwd;
	private String rpwd;
	private String type;//文科还是理科
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置无头部
		setContentView(R.layout.activity_register);
		
		regbtn = (Button) findViewById(R.id.registerbtn);
		reUsername = (EditText) findViewById(R.id.reUsername);
		rePwd = (EditText) findViewById(R.id.rePwd);
		rrePwd = (EditText) findViewById(R.id.rrePwd);
		rg = (RadioGroup) findViewById(R.id.subject);
		rba = (RadioButton) findViewById(R.id.rart);
		rbs = (RadioButton) findViewById(R.id.rscience);
		//获取是文科还是理科
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkId) {
				if(checkId == rba.getId()) {
					type = rba.getText().toString();
				}else if(checkId == rbs.getId()) {
					type = rbs.getText().toString();
				}
			}
		});
		//点击注册按钮，如果成功，则弹出注册成功，然后跳转到登录界面，如果失败，则说明原因，然后返回注册界面
		regbtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//1 获得注册信息中的值
				username = reUsername.getText().toString();
				pwd = rePwd.getText().toString();
				rpwd = rrePwd.getText().toString();
				
				if(username == null || pwd == null || rpwd == null) {
					Toast.makeText(MyApplication.getContext(), "信息不能为空", Toast.LENGTH_LONG);
				}else if(!pwd.equals(rpwd)) {
					Toast.makeText(MyApplication.getContext(), "密码应该相同", Toast.LENGTH_LONG);
				}else {
					//信息无错误，插入数据库，传输username,pwd
				    boolean rs = new InforController().insertUser(username,pwd,type);
				    if(rs) {
				    	//如果插入成功，跳转到登录界面
				    	System.out.println("insert successsfully");
				    	Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
				    	startActivity(intent);
				    	
				    }else {
				    	Toast.makeText(MyApplication.getContext(), "注册失败", Toast.LENGTH_LONG);
				    }
				}
			}
		});
	}
}
