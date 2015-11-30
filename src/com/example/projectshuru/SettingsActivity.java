package com.example.projectshuru;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}

	

	public void clickContact(View v){
		Intent setText=new Intent("com.example.projectshuru.SettextActivity" );
		startActivityForResult(setText,2);
	}
	public void clickMyself(View v){
		Intent myself=new Intent("com.example.projectshuru.MyselfActivity");
		startActivityForResult(myself,3);
	}
	public void clickEmergencyContact(View v){
		
	}

}
