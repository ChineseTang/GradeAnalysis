package com.controller;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.db.GradeAnalysisOpenHelper;

public class InforController {
	/**
	 * 注册信息，如果成功返回true，否则返回false
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public boolean insertUser(String userName,String pwd,String type) {
		GradeAnalysisOpenHelper ga = new GradeAnalysisOpenHelper();
		SQLiteDatabase db = ga.getConnection();
		String sql = "insert into Suser(uName,uPwd,uType)" + "values('" + userName + "','" + pwd + "','" + type + "')";
		db.execSQL(sql);
		db.close();
		return true;
	}
	/**
	 * 登录信息
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public boolean login(String userName,String pwd) {
		GradeAnalysisOpenHelper ga = new GradeAnalysisOpenHelper();
		SQLiteDatabase db = ga.getConnection();
		String sql = "select * from Suser where uName=? and uPwd=?";
		Cursor cursor = db.rawQuery(sql, new String[]{userName,pwd});
		if(cursor.moveToFirst() == true) {
			cursor.close();
			return true;
		}
		
		return false;
	}
}
