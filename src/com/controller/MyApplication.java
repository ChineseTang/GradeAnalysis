package com.controller;

import android.app.Application;
import android.content.Context;
//ָ��ȫ��Application ���󣬲����ڸ���Ŀ���κεط���Ҫʹ��Context,ֻ��Ҫ����һ��MyApplication.getContext()�Ϳ�����
public class MyApplication extends Application {
	private static Context context;
	private static String username;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		context = getApplicationContext();
	}
	//��¼�ɹ�����userName;
	
	public static Context getContext() {
		return context;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		MyApplication.username = username;
	}
}
