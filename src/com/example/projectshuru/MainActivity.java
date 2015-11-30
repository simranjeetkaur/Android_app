package com.example.projectshuru;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.telephony.SmsManager;
import java.io.InputStreamReader;
import java.util.List;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
	double la = 0;
	double lo = 0;
	LocationManager lmgr;
	LocationListener loclis;
	MediaPlayer mPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lmgr = (LocationManager) getSystemService(LOCATION_SERVICE);

	}

	public void startSound(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getBaseContext(), "hello", Toast.LENGTH_LONG).show();
		 mPlayer = MediaPlayer.create(this, R.raw.abc01);

		mPlayer.start();
		mPlayer.setLooping(true);

	}

	@SuppressLint("NewApi")
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuItem mnu = menu.add(0, 0, 0, "Instant msg");
		MenuItem mnu1=menu.add(1,1,0,"GPS disable");
		
		mnu.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

	
	/*  public void stopSound(View v){ if(mPlayer.isPlaying())
	  {
		 mPlayer.release();}
	 }*/
	 
	  
	 

	public void onsetClick(View v) {
		Intent i = new Intent("com.example.projectshuru.SettingsActivity");
		startActivityForResult(i, 1);
	}

	public boolean onMenuItemSelected(int featureId, MenuItem item) {
	switch(featureId){
	case 0:String dataloaded = "";
		String nameread = "";
		SmsManager mgr;
		String locationAdd="";
		mgr = SmsManager.getDefault();
		MyLocationListener lis = new MyLocationListener(this);
		lo = lis.sendLat();
		la = lis.longi;
		Geocoder geocoder=new Geocoder(this);
		try{
			List<Address> address=geocoder.getFromLocation(la, lo, 1);
			if(address!=null){
				for(int i=0;i<address.size();i++){
					Address add=address.get(0);
					locationAdd+=add.getAddressLine(i);
					locationAdd+="Country"+add.getCountryName();
				}
			}
			
		}catch(Exception e){}

		try {

			FileInputStream fis = openFileInput("9Data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			for (int i = isr.read(); i != -1; i = isr.read()) {
				dataloaded = "";
				if ((char) i == '+') {
					Toast.makeText(getBaseContext(), "det", Toast.LENGTH_LONG)
							.show();
					for (int j = 1; j <= 4; j++) {
						i = isr.read();
						dataloaded += (char) i;
						Toast.makeText(getBaseContext(), "" + dataloaded,
								Toast.LENGTH_SHORT).show();

					}

					mgr.sendTextMessage(dataloaded, null, "I am at"+locationAdd, null, null);
					Toast.makeText(getBaseContext(), locationAdd, Toast.LENGTH_LONG).show();

				} else {
					nameread += (char) i;

				}

			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		
	case 1: stopService(new Intent(getBaseContext(), MyService.class));
	Toast.makeText(getBaseContext(), "service stopped", Toast.LENGTH_LONG)
	.show();
	}
		return super.onMenuItemSelected(featureId, item);
	}

	protected void onActivityResult(int requestcode, int resultcode, Intent data) {
		if (requestcode == 1) {
			if (resultcode == RESULT_OK) {
				Toast.makeText(getBaseContext(), "back", Toast.LENGTH_LONG)
						.show();
			}
		}
		
	}

	public void startService(View v) {
		
		startService(new Intent(getBaseContext(), MyService.class));
		Toast.makeText(getBaseContext(), "service started", Toast.LENGTH_LONG)
				.show();
	}

public void clickHelp(View v){
	Intent openHelp=new Intent("com.example.projectshuru.HelpActivity");
	startActivityForResult(openHelp,6);
}
	
	public void clickShare(View v){
		Intent fbopen=new Intent(android.content.Intent.ACTION_VIEW);
		fbopen.setData(Uri.parse("https://www.facebook.com"));
		startActivity(fbopen);
	}

}

class MyLocationListener implements LocationListener {
	Context c;
	double lat, longi;

	public MyLocationListener(Context context) {
		c = context;
	}

	@Override
	public void onLocationChanged(Location location) {
		if (location != null) {
			Toast.makeText(
					c,
					"location is" + location.getLatitude() + " "
							+ location.getLongitude(), Toast.LENGTH_LONG)
					.show();
			lat = location.getLatitude();
			longi = location.getLongitude();
		}

	}

	@Override
	public void onProviderDisabled(String provider) {

		Toast.makeText(c, "is disabled", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onProviderEnabled(String provider) {

		Toast.makeText(c, "is enabled", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		switch (status) {
		case LocationProvider.AVAILABLE:
			Toast.makeText(c, "Status is" + provider + "is available",
					Toast.LENGTH_SHORT).show();

		case LocationProvider.OUT_OF_SERVICE:
			Toast.makeText(c, "Status is" + provider + "is out of service",
					Toast.LENGTH_LONG).show();

		case LocationProvider.TEMPORARILY_UNAVAILABLE:
			Toast.makeText(c, "is disabled", Toast.LENGTH_LONG).show();
		}

	}

	public double sendLat() {
		return lat;
	}

	public double sendLongi() {
		return longi;
	}

}
