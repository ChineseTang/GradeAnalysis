package com.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class GradeAnalysisOpenHelper extends SQLiteOpenHelper {
	
	/**
	 * sUser table
	 * @param context
	 * @param name
	 * @param factory
	 * @param version1
	 */
	public static final String CREATE_SUSER = "create table sUser (uId integer primary key auto_increment,uName varchar(64) not null,uPwd varchar(65) not null,uType varchar(16) not null)";
	
	/**
	 * Art table
	 * @param context
	 * @param name
	 * @param factory
	 * @param version1
	 */
	
	public static final String CREATE_ART = "create table Art (aid integer primary key auto_increment,usid integer,aChinese double,aMath double,aEnglish double,aPolitics double,aHistory double,aGeology double,aTotal double,aTime varchar(64))";
	
	/**
	 * Science table
	 * @param context
	 * @param name
	 * @param factory
	 * @param version1
	 */
	
	public static final String CREATE_SCIENCE = "create table Science (sid integer primary key auto_increment,usid integer,sChinese double,sMath double,sEnglish double,sPhysics double,sChemistry double,sBiology double,sTotal double,sTime varchar(64))";
	public GradeAnalysisOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_SUSER);//create tables
		db.execSQL(CREATE_ART);
		db.execSQL(CREATE_SCIENCE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
