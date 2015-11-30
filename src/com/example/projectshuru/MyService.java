package com.example.projectshuru;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.telephony.SmsManager;
import android.widget.Toast;

public class MyService extends Service {

private Timer timer=new Timer();
@Override
public IBinder onBind(Intent arg0) {
	// TODO Auto-generated method stub
	return null;
}



public int onStartCommand(Intent intent, int flags,int startId)
{
	Toast.makeText(this,"service started" ,Toast.LENGTH_LONG).show();
	doSomethingRepeatedly();
	return START_STICKY;
	}
	
	
	

private void doSomethingRepeatedly() {
	
		
	/*	timer.scheduleAtFixedRate(new TimerTask(){
			public void run(){
				MyLocationListener list=new MyLocationListener(getBaseContext());
				double d1=list.lat;
				double d2=list.longi;
				SmsManager smgr=SmsManager.getDefault();
				smgr.sendTextMessage("5556", null, ""+d1+" "+d2, null, null);
				
		}},0,10000);
	
	*/
	
}



public void onDestroy(){
	
super.onDestroy();}





}