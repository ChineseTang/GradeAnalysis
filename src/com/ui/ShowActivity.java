package com.ui;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.controller.InforController;
import com.controller.MyApplication;
import com.model.Art;
import com.model.Science;

public class ShowActivity extends BaseActivity {
	private ArrayList<Double> yList;
	ArrayList<String> xRawDatas = new ArrayList<String>();
	private LineGraphicView tu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 设置无头部
		setContentView(R.layout.activity_show);
		tu = (LineGraphicView) findViewById(R.id.line_graphic);
		Intent intent = getIntent();
		yList = new ArrayList<Double>();
		int subject = intent.getIntExtra("subject", 0);
		switch (subject) {
		case 1:
			// 如果是1那么查询文科语文成绩
			ArrayList<Art> al1 = new ArrayList<Art>();
			al1 = new InforController().searchArtChinese(MyApplication.getUser().getuId());
			for (Art art : al1) {
				yList.add(art.getaChinese());
				xRawDatas.add(art.getaTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 2:
			// 如果是2那么查询文科数学成绩
			ArrayList<Art> al2 = new ArrayList<Art>();
			al2 = new InforController().searchArtMath(MyApplication.getUser().getuId());
			for (Art art : al2) {
				yList.add(art.getaMath());
				xRawDatas.add(art.getaTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 3:
			// 如果是3那么查询文科英语成绩
			ArrayList<Art> al3 = new ArrayList<Art>();
			al3 = new InforController().searchArtEnglish(MyApplication.getUser().getuId());
			for (Art art : al3) {
				yList.add(art.getaEnglish());
				xRawDatas.add(art.getaTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 4:
			// 如果是4那么查询文科政治成绩
			ArrayList<Art> al4 = new ArrayList<Art>();
			al4 = new InforController().searchArtPolitics(MyApplication.getUser().getuId());
			for (Art art : al4) {
				yList.add(art.getaPolitics());
				xRawDatas.add(art.getaTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 5:
			// 如果是5那么查询文科历史成绩
			ArrayList<Art> al5 = new ArrayList<Art>();
			al5 = new InforController().searchArtHistory(MyApplication.getUser().getuId());
			for (Art art : al5) {
				yList.add(art.getaHistory());
				xRawDatas.add(art.getaTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 6:
			// 如果是6那么查询文科地理成绩
			ArrayList<Art> al6 = new ArrayList<Art>();
			al6 = new InforController().searchArtGeology(MyApplication.getUser().getuId());
			for (Art art : al6) {
				yList.add(art.getaGeology());
				xRawDatas.add(art.getaTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 7:
			// 如果是7那么查询文科总成绩
			ArrayList<Art> al7 = new ArrayList<Art>();
			al7 = new InforController().searchArtTotal(MyApplication.getUser().getuId());
			for (Art art : al7) {
				yList.add(art.getaGeology());
				xRawDatas.add(art.getaTime());
			}
			tu.setData(yList, xRawDatas, 750, 150);
			break;
		case 8:
			// 如果是8那么查询理科语文成绩
			ArrayList<Science> al8 = new ArrayList<Science>();
			al8 = new InforController().searchScienceChinese(MyApplication.getUser().getuId());
			for (Science sci : al8) {
				yList.add(sci.getsChinese());
				xRawDatas.add(sci.getsTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 9:// 如果是9那么查询理科数学成绩
			ArrayList<Science> al9 = new ArrayList<Science>();
			al9 = new InforController().searchScienceMath(MyApplication.getUser().getuId());
			for (Science sci : al9) {
				yList.add(sci.getsMath());
				xRawDatas.add(sci.getsTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 10:// 如果是10那么查询理科外语成绩
			ArrayList<Science> al10 = new ArrayList<Science>();
			al10 = new InforController().searchScienceEnglish(MyApplication.getUser().getuId());
			for (Science sci : al10) {
				yList.add(sci.getsEnglish());
				xRawDatas.add(sci.getsTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 11:// 如果是11那么查询理科物理成绩
			ArrayList<Science> al11 = new ArrayList<Science>();
			al11 = new InforController().searchSciencePhysical(MyApplication.getUser().getuId());
			for (Science sci : al11) {
				yList.add(sci.getsPhysics());
				xRawDatas.add(sci.getsTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 12:// 如果是12那么查询理科化学成绩
			ArrayList<Science> al12 = new ArrayList<Science>();
			al12 = new InforController().searchScienceChemistry(MyApplication.getUser().getuId());
			for (Science sci : al12) {
				yList.add(sci.getsChemistry());
				xRawDatas.add(sci.getsTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 13:// 如果是13那么查询理科生物成绩
			ArrayList<Science> al13 = new ArrayList<Science>();
			al13 = new InforController().searchScienceBiology(MyApplication.getUser().getuId());
			for (Science sci : al13) {
				yList.add(sci.getsBiology());
				xRawDatas.add(sci.getsTime());
			}
			tu.setData(yList, xRawDatas, 100, 20);
			break;
		case 14:// 如果是14那么查询理科总成绩
			ArrayList<Science> al14 = new ArrayList<Science>();
			al14 = new InforController().searchScienceTotal(MyApplication.getUser().getuId());
			for (Science sci : al14) {
				yList.add(sci.getsTotal());
				xRawDatas.add(sci.getsTime());
			}
			tu.setData(yList, xRawDatas, 750, 150);
			break;
		default:
			break;
		}

	}

	public void show() {
		
		  yList = new ArrayList<Double>(); yList.add(550.0); yList.add(555.0);
		  yList.add(585.0); yList.add(590.0); yList.add(592.0); yList.add(693.0);
		  yList.add(695.0);
		  
		  xRawDatas = new ArrayList<String>(); xRawDatas.add("05-19");
		  xRawDatas.add("05-20"); xRawDatas.add("05-21");
		 xRawDatas.add("05-22"); xRawDatas.add("05-23");
		  xRawDatas.add("05-24"); xRawDatas.add("05-25");
		  xRawDatas.add("05-26");
		 
		tu.setData(yList, xRawDatas, 750, 150);
	}
}
