package com.techmileage.mobiletasker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Preprations extends Activity{

	TextView txtPrep;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preprationsscreen);
		Bundle b=getIntent().getExtras();
		
		EditText et=(EditText)findViewById(R.id.et);
		
		txtPrep=(TextView)findViewById(R.id.prepScreen);
		
		et.setText(b.getCharSequence("et"));
	}
}
