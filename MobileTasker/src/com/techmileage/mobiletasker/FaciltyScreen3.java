package com.techmileage.mobiletasker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FaciltyScreen3 extends Activity{

	TextView tev3;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facilityxyz);
		
		tev3 = (TextView)findViewById(R.id.facility3);
		
		Intent intent = getIntent();
		String bt3 = intent.getStringExtra("bt3");
		tev3.setText(bt3);
	}
}
