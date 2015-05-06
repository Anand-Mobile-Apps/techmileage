package com.techmileage.mobiletasker;

import java.util.Calendar;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {

	private static final int DATE_PICKER_ID = 1111;
	private EditText et;
	private ImageView bt;
	Button tasks,preps;
	private int year;
	private int month;
	private int day;
	DatePickerDialog.OnDateSetListener dateListener;
	DatePickerDialog dialog;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	et = (EditText)findViewById(R.id.et);
	bt = (ImageView)findViewById(R.id.calendar);
	tasks=(Button)findViewById(R.id.taskBtn);
	preps=(Button)findViewById(R.id.prepBtn);
	
	tasks.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent taskIntent = new Intent(MainActivity.this,Tasks.class);
			Bundle b=new Bundle();
			b.putString("et",et.getText().toString());
			taskIntent.putExtras(b);
			startActivity(taskIntent);
		}
	});
	
	
	preps.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i1=new Intent(MainActivity.this,Preprations.class);
			Bundle b=new Bundle();
			b.putString("et",et.getText().toString());
			i1.putExtras(b);
			startActivity(i1);
		}
	});
	final Calendar c = Calendar.getInstance();
	
	year=c.get(Calendar.YEAR);
	month=c.get(Calendar.MONTH);
	day=c.get(Calendar.DAY_OF_MONTH);
	
	et.setText(new StringBuilder().append(day).append("-").append(month+1).append("-").append(year).append(" "));
	
	bt.setOnClickListener(new OnClickListener() {
		
		@SuppressWarnings("deprecation")
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			showDialog(DATE_PICKER_ID);
			
			
		}
	});
}

@SuppressLint("NewApi")
protected Dialog onCreateDialog(int id){
	
	switch (id) {
	case DATE_PICKER_ID:
		
		//dialog=new DatePickerDialog(this, dateListener, year, month, day);
		//dialog.getDatePicker().setMaxDate(new Date().getTime());
		return new DatePickerDialog(this, PickerListener, year, month, day);
		//return dialog;
     }
	return null;
}
private DatePickerDialog.OnDateSetListener PickerListener = new DatePickerDialog.OnDateSetListener() {
	
	@Override
	public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
		year = selectedYear;
		month = selectedMonth;
		day = selectedDay;
		// TODO Auto-generated method stub
		et.setText(new StringBuilder().append(day).append("-").append(month+1).append("-").append(year).append(" "));
		
	}

	
};
}
