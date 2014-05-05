package com.examples.newapp;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	RadioButton r1;
	RadioButton r2;
		private Button btnStart;
		static final int DATE_START_DIALOG_ID = 0;
		private int startYear=1970;
		private int startMonth=6;
		private int startDay=15;
		private AgeCalculation age = null;
		private TextView currentDate;
		private TextView birthDate;
		private TextView result;
		private int age1;

		@Override
		public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		age=new AgeCalculation();
		currentDate=(TextView) findViewById(R.id.textView1);
		currentDate.setText( age.getCurrentDate());
		birthDate=(TextView) findViewById(R.id.textView2);
		result=(TextView) findViewById(R.id.textView3);
		btnStart=(Button) findViewById(R.id.button1);
		btnStart.setOnClickListener(this);
		 r1=(RadioButton) findViewById(R.id.radioButton1);	
         r2=(RadioButton) findViewById(R.id.radioButton2);
		}

		@Override
		protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_START_DIALOG_ID:
		return new DatePickerDialog(this,
		mDateSetListener,
		startYear, startMonth, startDay);
		}
		return null;
		}

		private DatePickerDialog.OnDateSetListener mDateSetListener 
		= new DatePickerDialog.OnDateSetListener() {
		public void onDateSet(DatePicker view, int selectedYear,
		int selectedMonth, int selectedDay) {
		startYear=selectedYear;
		startMonth=selectedMonth;
		startDay=selectedDay;
		age.setDateOfBirth(startYear, startMonth, startDay);
		birthDate.setText(""+startDay+":"+(startMonth+1)+":"+startYear); 
		calculateAge();
		}
		};
		@SuppressWarnings("deprecation")
		public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
		showDialog(DATE_START_DIALOG_ID);
		break;

		default:
		break;
		}
		}
		private void calculateAge()
		{ 
		 age1=age.calcualteYear();
		age.calcualteMonth();
		age.calcualteDay();
		Toast.makeText(getBaseContext(), age.getResult() , Toast.LENGTH_SHORT).show();
		result.setText(age.getResult());
		}
		


		public void sendMessage(View view) {
			int a1=age.calcualteYear();
			//TextView editText = (TextView)findViewById(R.id.textView3);
		   // String message = editText.getText().toString();
		    
		    Intent intent = new Intent(this, Newactivity.class);
		    intent.putExtra("EXTRA_MESSAGE",a1);
		    
		    
		    startActivity(intent);
		}
		}
