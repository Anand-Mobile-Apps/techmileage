package com.techmileage.mobiletasker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FaciltyScreen2 extends Activity {

	TextView tev2;
	 
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facility50012);
		
		tev2 = (TextView)findViewById(R.id.facility2);
		
		Intent intent=getIntent();
		String bt2=intent.getStringExtra("bt2");
		tev2.setText(bt2);
	}
	
}
