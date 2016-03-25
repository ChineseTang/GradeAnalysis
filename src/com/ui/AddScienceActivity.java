package com.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.controller.InforController;
import com.model.Science;

public class AddScienceActivity extends BaseActivity {
	private EditText chinese;
	private EditText math;
	private EditText english;
	private EditText physical;
	private EditText chemistry;
	private EditText biology;
	private Button submit;
	
	private String schinese;
	private String smath;
	private String senglish;
	private String sphysical;
	private String schemistry;
	private String sbiology;
	
	private double dchinese;
	private double dmath;
	private double denglish;
	private double dphysical;
	private double dchemistry;
	private double dbiology;
	private double dtotal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_add_science);
		
		chinese = (EditText) findViewById(R.id.addChinese);
		math = (EditText) findViewById(R.id.addMath);
		english = (EditText) findViewById(R.id.addEnglish);
		physical = (EditText) findViewById(R.id.addPhysical);
		chemistry = (EditText) findViewById(R.id.addChemistry);
		biology = (EditText) findViewById(R.id.addBiology);
		chinese.setText("0");
		math.setText("0");
		english.setText("0");
		physical.setText("0");
		chemistry.setText("0");
		biology.setText("0");
		submit = (Button) findViewById(R.id.addSGrade);
		
		submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				schinese = chinese.getText().toString();
				smath = math.getText().toString();
				senglish = english.getText().toString();;
				sphysical = physical.getText().toString();
				schemistry = chemistry.getText().toString();
				sbiology = biology.getText().toString();
				
				if(	schinese == null || schinese.equals("") 
						|| smath == null || smath.equals("")
						|| senglish == null || senglish.equals("")
						|| sphysical == null || sphysical.equals("") 
						|| schemistry == null || schemistry.equals("")
						|| sbiology == null || sbiology.equals("")) {
						AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
						dialog.setTitle("添加成绩失败");
						dialog.setMessage("信息不能为空");
						dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface arg0, int arg1) {
								// TODO Auto-generated method stub
								
							}
						});
						dialog.show();
					}else{
						dchinese = Double.parseDouble(schinese);
						dmath = Double.parseDouble(smath);
						denglish = Double.parseDouble(senglish);
						dphysical = Double.parseDouble(sphysical);
						dchemistry = Double.parseDouble(schemistry);
						dbiology = Double.parseDouble(sbiology);
						
						dtotal = dchinese + dmath + denglish + dphysical + dchemistry + dbiology;
						
						//判断成绩范围，不能小于0分，不能大于150分
						if(dchinese<0.0 || dchinese>150.0) {
							AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
							dialog.setTitle("添加成绩失败");
							dialog.setMessage("请将语文成绩输入到合适范围");
							dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									
								}
							});
							dialog.show();
							chinese.requestFocus();
						}else if(dmath<0.0 || dmath>150.0) {
							AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
							dialog.setTitle("添加成绩失败");
							dialog.setMessage("请将数学成绩输入到合适范围");
							dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									
								}
							});
							dialog.show();
							math.requestFocus();
						}else if(denglish<0.0 || denglish>150.0) {
							AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
							dialog.setTitle("添加成绩失败");
							dialog.setMessage("请将英语成绩输入到合适范围");
							dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									
								}
							});
							dialog.show();
							english.requestFocus();
						}else if(dphysical<0.0 || dphysical>150.0) {
							AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
							dialog.setTitle("添加成绩失败");
							dialog.setMessage("请将物理成绩输入到合适范围");
							dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									
								}
							});
							dialog.show();
							physical.requestFocus();
						}else if(dchemistry<0.0 || dchemistry>150.0) {
							AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
							dialog.setTitle("添加成绩失败");
							dialog.setMessage("请将化学成绩输入到合适范围");
							dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									
								}
							});
							dialog.show();
							chemistry.requestFocus();
						}else if(dbiology<0.0 || dbiology>100.0) {
							AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
							dialog.setTitle("添加成绩失败");
							dialog.setMessage("请将生物成绩输入到合适范围");
							dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									
								}
							});
							dialog.show();
							biology.requestFocus();
						}else if(dchinese==0 && dmath==0 && denglish==0 && dphysical==0 && dchemistry==0 && dbiology==0) {
							AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
							dialog.setTitle("添加成绩失败");
							dialog.setMessage("请输入有效成绩");
							dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									
								}
							});
							dialog.show();
							chinese.requestFocus();
						}else{
						
							DateFormat format= new SimpleDateFormat("yyyy.MM.dd");  
						
							Science sci = new Science();
							sci.setsChinese(dchinese);
							sci.setsMath(dmath);
							sci.setsEnglish(denglish);
							sci.setsPhysics(dphysical);
							sci.setsChemistry(dchemistry);
							sci.setsBiology(dbiology);
							sci.setsTotal(dtotal);
							sci.setsTime(format.format(new Date()));
							sci.setsSearchTime(new Date().getTime());
						
							boolean rs = new InforController().addScience(sci);
							if(rs) {
								AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
								dialog.setTitle("添加成绩成功");
								dialog.setMessage("本次成绩添加成功");
								dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									
								}
							});
								dialog.show();
								chinese.setText("0");
								math.setText("0");
								english.setText("0");
								physical.setText("0");
								chemistry.setText("0");
								biology.setText("0");
							}else{
								AlertDialog.Builder dialog = new AlertDialog.Builder(AddScienceActivity.this);
								dialog.setTitle("添加成绩失败");
								dialog.setMessage("本次成绩添加失败");
								dialog.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface arg0, int arg1) {
									
								}
							});
							dialog.show();
						}
					}
					}
			}
		});
	}
}
