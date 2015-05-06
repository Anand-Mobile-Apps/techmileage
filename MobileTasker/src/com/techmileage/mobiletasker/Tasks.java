package com.techmileage.mobiletasker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class Tasks extends Activity{

	Button bt1,bt2,bt3,bt4;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.taskscreen);
		
		EditText et=(EditText)findViewById(R.id.et);
		bt1=(Button)findViewById(R.id.bt1);
		bt2=(Button)findViewById(R.id.bt2);
		bt3=(Button)findViewById(R.id.bt3);
		bt4=(Button)findViewById(R.id.bt4);
		
		Bundle b=getIntent().getExtras();
		
		et.setText(b.getCharSequence("et"));
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent i2 = new Intent(Tasks.this,FaciltyScreen.class);
			Bundle b=new Bundle();
			b.putString("bt1",bt1.getText().toString());
			i2.putExtras(b);
			startActivity(i2);
			}
		});
		
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle b = new Bundle();
				Intent i3 = new Intent(Tasks.this,FaciltyScreen2.class);
				b.putString("bt2", bt2.getText().toString());
				i3.putExtras(b);
				startActivity(i3);
			}
		});
		
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle b = new Bundle();
				Intent i4 = new Intent(Tasks.this,FaciltyScreen3.class);
				b.putString("bt3", bt3.getText().toString());
				i4.putExtras(b);
				startActivity(i4);
			}
		});
	}
}
