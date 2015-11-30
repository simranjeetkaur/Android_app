package com.example.projectshuru;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



import android.text.TextWatcher;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContactsActivity extends Activity {
	EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10;
	
	
	DatabaseHandler db = new DatabaseHandler(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts);
		ed1=(EditText) findViewById(R.id.editText1);
		ed2=(EditText) findViewById(R.id.editText2);
		ed3=(EditText) findViewById(R.id.editText3);
		ed4=(EditText) findViewById(R.id.editText4);
		ed5=(EditText) findViewById(R.id.editText5);
		ed6=(EditText) findViewById(R.id.editText6);
		ed7=(EditText) findViewById(R.id.editText7);
		ed8=(EditText) findViewById(R.id.editText8);
		ed9=(EditText) findViewById(R.id.editText9);
		ed10=(EditText) findViewById(R.id.editText10);
		//String dataloaded="";
		//String nameread="";
	
	
		
		String str=db.getAllDetails();
		Toast.makeText(this,str,Toast.LENGTH_LONG).show();

		  // ed1.setText(str.toString());
		 String[] temp={"id","name","num","id","name","num","id","name","num","id","name","num","id","name","num"}; 
	 if(!str.equals(null))
		   {
		   
		   
		   
		   String delimiter = ",";
		   
		   temp = str.split(delimiter);
		 
		  ed1.setText(temp[1].toString());
		   ed2.setText(temp[2].toString());
			
		ed3.setText(temp[4].toString());
		ed4.setText(temp[5].toString());
 
		ed5.setText(temp[7].toString());
		ed6.setText(temp[8].toString());

		ed7.setText(temp[10].toString());
		ed8.setText(temp[11].toString());
 
		ed9.setText(temp[13].toString());
		ed10.setText(temp[14].toString());
		
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
		    
				
				//------
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
		                    Is_Valid_Person_Name(ed3);
		            }
		    });
		    // =====
				
				
				//------
				ed5.addTextChangedListener(new TextWatcher() {

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
		                    Is_Valid_Person_Name(ed5);
		            }
		    });
		    // =====
				
				//------
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
		                    Is_Valid_Person_Name(ed7);
		            }
		    });
		    // =====
				//------
				ed9.addTextChangedListener(new TextWatcher() {

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
		                    Is_Valid_Person_Name(ed9);
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
                Is_Valid_Phone(ed2);
        }
});

	
	//------

	
	
	
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
	                Is_Valid_Phone(ed4);
	        }
	});

		
		//------
	
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
	                Is_Valid_Phone(ed6);
	        }
	});

		
		//------
		
	
		
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
	                Is_Valid_Phone(ed8);
	        }
	});

		
		//------
		
		
		
		ed10.addTextChangedListener(new TextWatcher() {

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
	                Is_Valid_Phone(ed10);
	        }
	});

		
		//------
	
	}
	
	
				
	 public void Is_Valid_Person_Name(EditText edt) throws NumberFormatException {
			
		 String valid_name;
		 if (edt.getText().toString().length() == 0) {
				edt.setError("Name should not be blank");
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
			}
			else {
				valid_pno = edt.getText().toString();
			}

		}
	
	
	//=======
	
	
public void onSave(View v){
	
	String num=ed2.getText().toString();
	
	String str=ed1.getText().toString();
	String num2=ed4.getText().toString();
	String str2=ed3.getText().toString();
	String num3=ed6.getText().toString();
	String str3=ed5.getText().toString();
	String num4=ed8.getText().toString();
	String str4=ed7.getText().toString();
	String num5=ed10.getText().toString();
	String str5=ed9.getText().toString();
	
	db.insertcontacts(str, num,"1");

	db.insertcontacts(str2, num2,"2");
	db.insertcontacts(str3, num3,"3");
	db.insertcontacts(str4, num4,"4");
	db.insertcontacts(str5, num5,"5");
	
	Toast.makeText(this,"Records Updated",Toast.LENGTH_LONG).show();
	
	
	
}



public void Back(View v){
	Intent con=new Intent("com.example.projectshuru.SettextActivity");
	startActivityForResult(con,4);
	
}
}
