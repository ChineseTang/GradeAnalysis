package com.controller;

import android.app.Application;
import android.content.Context;
//指定全局Application 对象，不管在该项目的任何地方想要使用Context,只需要调用一下MyApplication.getContext()就可以了
public class MyApplication extends Application {
	private static Context context;
	private static String username;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		context = getApplicationContext();
	}
	//登录成功调用userName;
	
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
