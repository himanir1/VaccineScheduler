package com.examples.newapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Newactivity extends Activity{
	

	TextView tvView,tvView2,tvView3,tvView4,tvView5,tvView6;
    
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.chidmain);
	    Intent intent = getIntent();
	   // int intValue = intent.getIntExtra("EXTRA_MESSAGE", 0);
	    
	    
	    
	   // String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		   
	     //int myNum = Integer.parseInt(message);
	     
	    tvView = (TextView) findViewById(R.id.checkBox1);
	    tvView2 = (TextView) findViewById(R.id.checkBox2);
	    tvView3 = (TextView) findViewById(R.id.checkBox3);
	    tvView4 = (TextView) findViewById(R.id.checkBox4);
	    
	    tvView.setText("BCG");
	    tvView2.setText("OPV 0");
	    tvView3.setText("HEPATITIS B1");
	    tvView4.setText("HEPATITIS B2");
	    //tvView5.setText("HEPATITIS B3");
	    //tvView6.setText("Measeles");
	    
		 //TextView textView = new TextView(this);
	    //textView.setTextSize(40);
	    //String selectedId = extras.getString("GENDER");  
	    //StringTokenizer st = new StringTokenizer(selectedId, ":");
	    //String g= st.nextToken();
	    //String age= st.nextToken();
	    //int age1 = Integer.parseInt(age);
	   // textView.setText(message);
	   // setContentView(textView);
}
	public void sendMessage(View view) {
		
		//TextView editText = (TextView)findViewById(R.id.textView3);
	   // String message = editText.getText().toString();
	    
	    Intent intent = new Intent(this, Lastactivity.class);
	    intent.putExtra("EXTRA_MESSAGE","Take Vaccine be Healthy");
	    startActivity(intent);
	}
}
