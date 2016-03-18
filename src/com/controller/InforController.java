package com.controller;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.db.GradeAnalysisOpenHelper;
import com.model.Art;
import com.model.Science;
import com.model.Suser;

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
		Log.w("debug", "register success");
		String sql = "insert into Suser(uName,uPwd,uType)" + "values('" + userName + "','" + pwd + "','" + type + "')";
		db.execSQL(sql);
		db.close();
		return true;
	}
	/**
	 * 登录信息，登录成功返回信息Suser，否则返回null
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public Suser login(String userName,String pwd) {
		GradeAnalysisOpenHelper ga = new GradeAnalysisOpenHelper();
		SQLiteDatabase db = ga.getConnection();
		String sql = "select * from Suser where uName=? and uPwd=?";
		Cursor cursor = db.rawQuery(sql, new String[]{userName,pwd});
		if(cursor.moveToFirst() == true) {
			int uId = cursor.getInt(cursor.getColumnIndex("uId"));
			String uName = cursor.getString(cursor.getColumnIndex("uName"));
			String uType = cursor.getString(cursor.getColumnIndex("uType"));
			Suser user = new Suser();
			user.setuId(uId);
			user.setuName(uName);
			user.setuType(uType);
			cursor.close();
			db.close();
			return user;
		}
		return null;
	}
	public boolean addArt(Art art) {
		GradeAnalysisOpenHelper ga = new GradeAnalysisOpenHelper();
		SQLiteDatabase db = ga.getConnection();
		String sql = "insert into Art(usid,aChinese,aMath,aEnglish,aPolitics,aHistory,aGeology,aTotal,aTime,aSearchTime) values('" + 
		MyApplication.getUser().getuId() + "','" + art.getaChinese() + "','" + art.getaMath() + "','"  +art.getaEnglish() + "','" 
		+ art.getaPolitics() + "','" + art.getaHistory() + "','" + art.getaGeology() + "','" + art.getaTotal() + "','"  + 
		art.getaTime() + "','"  + art.getaSearchTime() + "')";
		try{
			db.execSQL(sql);
			Log.w("debug", sql);
			db.close();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean addScience(Science sci) {
		GradeAnalysisOpenHelper ga = new GradeAnalysisOpenHelper();
		SQLiteDatabase db = ga.getConnection();
		String sql = "insert into Science(sid,sChinese,sMath,sEnglish,sPhysics,sChemistry,sBiology,sTotal,sTime,sSearchTime) values('" + 
		MyApplication.getUser().getuId() + "','" + sci.getsChinese() + "','" + sci.getsMath() + "','"  +sci.getsEnglish() + "','" 
		+ sci.getsPhysics() + "','" + sci.getsChemistry() + "','" + sci.getsBiology() + "','" + sci.getsTotal() + "','"  + 
		sci.getsTotal() + "','"  + sci.getsSearchTime() + "')";
		try{
			db.execSQL(sql);
			Log.w("debug", sql);
			db.close();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
