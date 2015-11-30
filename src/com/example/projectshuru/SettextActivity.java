package com.example.projectshuru;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SettextActivity extends Activity {
	
	DatabaseHandler db = new DatabaseHandler(this);
	
	TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settext);
		tv1=(TextView) findViewById(R.id.textView1);//name
		tv2=(TextView) findViewById(R.id.textView2);//num
		tv3=(TextView) findViewById(R.id.textView3);
		tv4=(TextView) findViewById(R.id.textView4);
		tv5=(TextView) findViewById(R.id.textView5);
		tv6=(TextView) findViewById(R.id.textView6);
		tv7=(TextView) findViewById(R.id.textView7);
		tv8=(TextView) findViewById(R.id.textView8);
		tv9=(TextView) findViewById(R.id.textView9);
		tv10=(TextView) findViewById(R.id.textView10);
		

		
		
		
		
		/*	String dataloaded="";
		String nameread="";
		int count=0;
		try {

			FileInputStream fis = openFileInput("9Data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			int i=isr.read();
			while(i!=-1){
				dataloaded="";
				nameread="";
				while((char)i!='+'){
					nameread+=(char)i;
					i=isr.read();
				
			}
				if((char)i=='+'){
					for(int j=0;j<4;j++){
					i=isr.read();
					dataloaded+=(char)i;}
					
					count++;
					i=isr.read();
				}
				
				switch(count){
				case 1 : tv1.setText(nameread);
							tv2.setText(dataloaded);
							break;
							
				case 2:  tv3.setText(nameread);
				tv4.setText(dataloaded);
							break;
				case 3:  tv5.setText(nameread);
				tv6.setText(dataloaded);
						break;
				
				case 4:  tv7.setText(nameread);
				tv8.setText(dataloaded);
						break;
				case 5 :  tv9.setText(nameread);
				tv10.setText(dataloaded);
						break;
				}
				
				
			}
		
		
		 }catch (FileNotFoundException e) {}
		catch (IOException e) {}
		
		
	}
	

	
	public void onActivityResult(int requestCode,int resultCode,Intent data){
		int count=0;
	if(requestCode==4){
		if(resultCode==RESULT_OK){
	
		String dataloaded = "";
		
		String nameread = "";
		try {

			FileInputStream fis = openFileInput("9Data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			int i=isr.read();
			while(i!=-1){
				dataloaded="";
				nameread="";
				while((char)i!='+'){
					nameread+=(char)i;
					i=isr.read();
				
			}
				if((char)i=='+'){
					for(int j=0;j<4;j++){
					i=isr.read();
					dataloaded+=(char)i;}
					
					count++;
					i=isr.read();
				}
				
				switch(count){
				case 1 : tv1.setText(nameread);
							tv2.setText(dataloaded);
							break;
							
				case 2:  tv3.setText(nameread);
				tv4.setText(dataloaded);
							break;
				case 3:  tv5.setText(nameread);
				tv6.setText(dataloaded);
						break;
				
				case 4:  tv7.setText(nameread);
				tv8.setText(dataloaded);
						break;
				case 5 :  tv9.setText(nameread);
				tv10.setText(dataloaded);
						break;
				}
				
				
			}
		
		
		 }catch (FileNotFoundException e) {}
		catch (IOException e) {}
		
		}}
		
	}*/
	
		
		String str=db.getAllDetails();
		Toast.makeText(this,str,Toast.LENGTH_LONG).show();
		
		 String[] temp={"id","name","num","id","name","num","id","name","num","id","name","num","id","name","num"}; 
	 if(!str.equals(null))
		   {
		   
		   
		   
		   String delimiter = ",";
		   
		   temp = str.split(delimiter);
		 
		   tv1.setText(temp[1].toString());
		   tv2.setText(temp[2].toString());
			
		tv3.setText(temp[4].toString());
		tv4.setText(temp[5].toString());
 
		tv5.setText(temp[7].toString());
		tv6.setText(temp[8].toString());

		tv7.setText(temp[10].toString());
		tv8.setText(temp[11].toString());
 
		tv9.setText(temp[13].toString());
		tv10.setText(temp[14].toString());
		
		   }
		
		
	}
	
	public void onClickSetText(View v){
	Intent con=new Intent("com.example.projectshuru.ContactsActivity");
	startActivityForResult(con,4);
	}


}

