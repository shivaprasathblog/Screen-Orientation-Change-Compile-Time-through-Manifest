package com.example.orientationchangecompiletime;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
//Defining the button	
Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Refer the button from xml with their id 
		b=(Button)findViewById(R.id.button1);
		//using onclick listener
		b.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub//To navigate to activity 2
				Intent i=new Intent(MainActivity.this,Activity2.class);
				startActivity(i);
			}
		});
		
	}

}
