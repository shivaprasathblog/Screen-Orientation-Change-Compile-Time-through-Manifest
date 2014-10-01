package com.example.orientationchangecompiletime;

import android.app.Activity;
import android.os.Bundle;

public class Activity2 extends Activity 
{
@Override
protected void onCreate(Bundle savedInstanceState)
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.screen2);
	//To change the screen orientation to landscape mode through manifest
	/** <activity android:name=".Activity2"
		 	       android:screenOrientation="landscape">
		 </activity>**/
}
}
