package com.ui;

import com.controller.InforController;
import com.controller.MyApplication;
import com.db.GradeAnalysisOpenHelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
	private String username;
	private String pwd;
	private EditText eusername;
	private EditText epwd;
	private Button login;
	private Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        GradeAnalysisOpenHelper.setContext(this.getApplicationContext());
        eusername = (EditText) findViewById(R.id.eUsername);
        epwd = (EditText) findViewById(R.id.ePwd);
        login = (Button) findViewById(R.id.login);
        reg = (Button) findViewById(R.id.register);
        //ע�ᰴť������
        reg.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
				startActivity(intent);
			}
		});
        //��¼��ť������
        login.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				username = eusername.getText().toString();
				pwd = epwd.getText().toString();
				if(username == null || username.equals(" ") || pwd == null || pwd.equals(" ")) {
					Toast.makeText(MyApplication.getContext(), "��¼��Ϣ��������������", Toast.LENGTH_LONG);
				}else {
					boolean rs = new InforController().login(username, pwd);
					if(rs) {
						System.out.println("login success");
						MyApplication.setUsername(username);
						//�����¼�ɹ�������ת��WelcomeActivity
						Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
						startActivity(intent);
					}else {
						Toast.makeText(MyApplication.getContext(), "��¼ʧ��", Toast.LENGTH_LONG);
					}
				}
			}
		});
    }
}
