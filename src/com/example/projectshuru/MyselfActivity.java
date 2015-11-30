package com.example.projectshuru;

import java.io.File;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MyselfActivity extends Activity {
	EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
	DateVidator obj=new DateVidator();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_myself);
		ed1=(EditText) findViewById(R.id.editText1);
		ed2=(EditText) findViewById(R.id.editText2);
		ed3=(EditText) findViewById(R.id.editText3);
		ed4=(EditText) findViewById(R.id.editText4);
		ed5=(EditText) findViewById(R.id.editText5);
		ed6=(EditText) findViewById(R.id.editText6);
		ed7=(EditText) findViewById(R.id.editText7);
		ed8=(EditText) findViewById(R.id.editText8);
		String dataloaded="";
		int i;
		try{
		FileInputStream fis = openFileInput("12Data.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		for(int j=0;j<8;j++){
			dataloaded="";
		 i=isr.read();
		while((char)i!=',' && i!=-1){
			dataloaded+=(char)i;
			i=isr.read();
		}
		
		switch(j){
		case 0: ed1.setText(dataloaded);
				break;
		case 1: ed2.setText(dataloaded);
		break;
		case 2:ed3.setText(dataloaded);
		break;
		
		case 3: ed4.setText(dataloaded);
		break;
		
		case 4: ed5.setText(dataloaded);
		break;
		
		case 5:ed6.setText(dataloaded);
		break;
		case 6:ed7.setText(dataloaded);
		break;
		case 7:ed8.setText(dataloaded);
		break;
		
		}}
		
		
		
		
		
		
		
		}
		
		catch(Exception e){
			
		}

	//------
		ed1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                            int count) {
                    // TODO Auto-generated method stub

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                            int after) {
                    // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                    // TODO Auto-generated method stub
                    Is_Valid_Person_Name(ed1);
            }
    });
    // =====
		
		

				ed2.addTextChangedListener(new TextWatcher() {

		            @Override
		            public void onTextChanged(CharSequence s, int start, int before,
		                            int count) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void beforeTextChanged(CharSequence s, int start, int count,
		                            int after) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void afterTextChanged(Editable s) {
		                    // TODO Auto-generated method stub
		                    Is_Valid_Bloodgrp(ed2);
		            }
		    });
		    // =====
		
				ed3.addTextChangedListener(new TextWatcher() {

		            @Override
		            public void onTextChanged(CharSequence s, int start, int before,
		                            int count) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void beforeTextChanged(CharSequence s, int start, int count,
		                            int after) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void afterTextChanged(Editable s) {
		                    // TODO Auto-generated method stub
		                    Is_Valid_Phone(ed3);
		            }
		    });
		    // =====
				
                
				
				ed4.addTextChangedListener(new TextWatcher() {

		            @Override
		            public void onTextChanged(CharSequence s, int start, int before,
		                            int count) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void beforeTextChanged(CharSequence s, int start, int count,
		                            int after) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void afterTextChanged(Editable s) {
		                    // TODO Auto-generated method stub
		                    Is_Valid_Addr(ed4);
		            }
		    });
		    // =====
				
				
 // =====
				
                
				
				ed7.addTextChangedListener(new TextWatcher() {

		            @Override
		            public void onTextChanged(CharSequence s, int start, int before,
		                            int count) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void beforeTextChanged(CharSequence s, int start, int count,
		                            int after) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void afterTextChanged(Editable s) {
		                    // TODO Auto-generated method stub
		                    Is_Valid_Dr(ed7);
		            }
		    });	
				
				
			//======
				
				ed8.addTextChangedListener(new TextWatcher() {

		            @Override
		            public void onTextChanged(CharSequence s, int start, int before,
		                            int count) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void beforeTextChanged(CharSequence s, int start, int count,
		                            int after) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void afterTextChanged(Editable s) {
		                    // TODO Auto-generated method stub
		                    Is_Valid_Allr(ed8);
		            }
		    });	
				
				
				
//======
				
				ed6.addTextChangedListener(new TextWatcher() {

		            @Override
		            public void onTextChanged(CharSequence s, int start, int before,
		                            int count) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void beforeTextChanged(CharSequence s, int start, int count,
		                            int after) {
		                    // TODO Auto-generated method stub

		            }

		            @Override
		            public void afterTextChanged(Editable s) {
		                    // TODO Auto-generated method stub
		                    Is_Valid_Ail(ed6);
		            }
		    });	
				
				
				
				
				
				
				
				
				
				
	}
	//========
	String valid_name;
	 public void Is_Valid_Person_Name(EditText edt) throws NumberFormatException {
			if (edt.getText().toString().length() == 0) {
				edt.setError("Name should not be blank");
				valid_name = null;
			} else if (!edt.getText().toString().matches("[a-zA-Z ]+")) {
				edt.setError("Accept Alphabets Only.");
				valid_name = null;
			} else {
				valid_name = edt.getText().toString();
			}

		}
	
	
	//=======
	 
	 
	 String valid_pno;
	 public void Is_Valid_Phone(EditText edt) throws NumberFormatException {
			if (edt.getText().toString().length() == 0) {
				edt.setError("Phone No. should not be blank");
				valid_pno = null;
			}
			if ((edt.getText().toString().length() < 10) && (edt.getText().toString().length() > 11) ) {
				edt.setError("Invalid Number");
				valid_pno = null;
			}else if (!edt.getText().toString().matches("[0-9 ]+")) {
				edt.setError("Accept Numbers Only.");
				valid_pno = null;
			}
			else {
				valid_pno = edt.getText().toString();
			}

		}
	
	
	//=======
	 
	 
	 
	 String valid_addr;
	 public void Is_Valid_Addr(EditText edt) throws NumberFormatException {
			if (edt.getText().toString().length() <= 0) {
				edt.setError("Address should not be blank");
				valid_addr = null;
			}
			
			else {
				valid_addr = edt.getText().toString();
			}

		}
	
	
	//=======

	 
	 
	 
	 
	 
		//========
		String valid_bloodgrp;
		 public void Is_Valid_Bloodgrp(EditText edt) throws NumberFormatException {
				if (edt.getText().toString().length() <= 0) {
					edt.setError("Blood Group should not be blank");
					valid_bloodgrp = null;
				} else if (!edt.getText().toString().matches("[a-zA-Z+ ]+")) {
					edt.setError("Accept Alphabets Only.");
					valid_bloodgrp = null;
				} else {
					valid_bloodgrp = edt.getText().toString();
				}

			}
		
		
		//=======
	 
	 
		//========
			String valid_dr;
			 public void Is_Valid_Dr(EditText edt) throws NumberFormatException {
					if (edt.getText().toString().length() <= 0) {
						edt.setError("Dr details should not be blank");
						valid_dr = null;
					} else if (!edt.getText().toString().matches("[a-zA-Z ]+")) {
						edt.setError("Accept Alphabets Only.");
						valid_dr = null;
					} else {
						valid_dr = edt.getText().toString();
					}

				}

				//========
				String valid_ailment;
				 public void Is_Valid_Ail(EditText edt) throws NumberFormatException {
						if (edt.getText().toString().length() <= 0) {
							edt.setError("Ailments should not be blank");
							valid_ailment = null;
						} else if (!edt.getText().toString().matches("[a-zA-Z ]+")) {
							edt.setError("Accept Alphabets Only.");
							valid_ailment = null;
						} else {
							valid_ailment = edt.getText().toString();
						}

					}

				 
				//========
					String valid_allr;
					 public void Is_Valid_Allr(EditText edt) throws NumberFormatException {
							if (edt.getText().toString().length() <= 0) {
								edt.setError("Allergy should not be blank");
								valid_allr = null;
							} else if (!edt.getText().toString().matches("[a-zA-Z ]+")) {
								edt.setError("Accept Alphabets Only.");
								valid_allr = null;
							} else {
								valid_allr = edt.getText().toString();
							}

						}

				 
				 
				 
		
	
	public void clickUpdate(View v){
		String str2=ed2.getText().toString();
		
		String str1=ed1.getText().toString();
		String str4=ed4.getText().toString();
		String str3=ed3.getText().toString();
		String str6=ed6.getText().toString();
		String str5=ed5.getText().toString();
		String str8=ed8.getText().toString();
		String str7=ed7.getText().toString();
		boolean b=obj.validate(str5);
	
		if (str1.toString().length() <= 0) {
			ed1.setError("Name should not be blank");		
		}
		
			if (str2.toString().length() <= 0) {
				ed2.setError("Blood Group should not be blank");		
			
		
			}
		
			if (str3.toString().length() <= 0) {
				ed3.setError("Phone No. should not be blank");		
			
		
			}
			if (str4.toString().length() <= 0) {
				ed4.setError("Address should not be blank");		
			
		
			}
		
			
			
			
			if (str6.toString().length() <= 0) {
				ed6.setError("Ailment should not be blank");		
			
		
			}
		
			if (str7.toString().length() <= 0) {
				ed7.setError("Dr. details Should not be blank");		
			
		
			}
			if (str8.toString().length() <= 0) {
				ed8.setError("Should not be blank");		
			}
			
			if (str5.toString().length() <= 0) {
				ed8.setError("Should not be blank");		
			}
			
			if (b==false) {
				ed5.setError("Invalid Date");		
			}
			
			
			
		Toast.makeText(getBaseContext(), str1, Toast.LENGTH_LONG).show();
		try{
		//FileOutputStream fos=openFileOutput("12Data.txt",MODE_WORLD_WRITEABLE);
				//OutputStreamWriter osw=new OutputStreamWriter(fos);
		File fos=getFileStreamPath("12Data.txt");
		FileWriter osw=new FileWriter(fos,false);
		
		osw.write(str1);
		osw.write(",");
		osw.write(str2);
		osw.write(",");
		osw.write(str3);
		osw.write(",");
		osw.write(str4);
		osw.write(",");
		osw.write(str5);
		osw.write(",");
		osw.write(str6);
		osw.write(",");
		osw.write(str7);
		osw.write(",");
		osw.write(str8);
		
		
		osw.flush();
		osw.close();
		
		}
		
		catch(Exception e){
			
		}
	}



}
