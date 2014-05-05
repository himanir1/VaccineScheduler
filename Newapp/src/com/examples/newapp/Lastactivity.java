package com.examples.newapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Lastactivity extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.newxml);
	    Intent intent = getIntent();
	    Button button = (Button) findViewById(R.id.button12);

	    
	}

}
