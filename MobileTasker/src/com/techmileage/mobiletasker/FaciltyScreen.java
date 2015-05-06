package com.techmileage.mobiletasker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FaciltyScreen extends Activity{

	TextView tev1;
	

	public void onCreate(Bundle bundle){
		
		super.onCreate(bundle);
		setContentView(R.layout.facity50011);
		
		tev1 = (TextView)findViewById(R.id.facility1);
		
		Intent intent=getIntent();
		String bt1=intent.getStringExtra("bt1");
		tev1.setText(bt1);
	}
	
}
