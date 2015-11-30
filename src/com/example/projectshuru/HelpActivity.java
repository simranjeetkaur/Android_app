package com.example.projectshuru;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class HelpActivity extends Activity {
	String mydata="Help...!!";
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		tv=(TextView) findViewById(R.id.textView1);
		
		try{
			InputStream fin=this.getResources().openRawResource(R.raw.help);
			InputStreamReader insr= new InputStreamReader(fin);
			for(int i=insr.read();i!=-1;i=insr.read()){
				mydata+=(char)i;
			}
			tv.setText(mydata);
			
			
			
		}catch(Exception e){
			
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.help, menu);
		return true;
	}
	
	

}
