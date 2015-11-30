package com.example.projectshuru;



import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
		
public class DatabaseHandler extends SQLiteOpenHelper
{

	
	private static final int DATABASE_VERSION=1;
	private  static final String DATABASE_NAME="DbTest2";
	private  static final String TABLE_NAME="contacts";
	private  static final String ID="id";
	private  static final String NAME="name";
	private  static final String  NUMB="numb";
	
	
	public DatabaseHandler(Context context)
	{
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		
        db.execSQL("CREATE TABLE " + TABLE_NAME + "("+ ID + " TEXT,"
                + NAME + " TEXT," + NUMB + " TEXT)"); 

		for(int i=1;i<=5;i++)
		{
		String sql="insert into "+TABLE_NAME+" values('"+i+"','Name','Contact')";
		
			db.execSQL(sql);
		}
 	}

	@Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { 
        // Drop older table if existed 
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME); 
          // Create tables again 
        onCreate(db);
                
    }
	
	public void insertcontacts(String s1,String s2,String s3)
	{
		SQLiteDatabase db=this.getWritableDatabase();
		
		
		String sql="update "+TABLE_NAME+" set name='"+s1+"',numb='"+s2+"' where id='"+s3+"'";
		
			db.execSQL(sql);
	}
	
		
	
	public String getAllDetails() 
	{ 
	    String s =""; 
	    // Select All Query 
	    String selectQuery = "SELECT  * FROM contacts"; 
	 
	    SQLiteDatabase db = this.getWritableDatabase(); 
	    Cursor cursor = db.rawQuery(selectQuery, null); 
	 
	    // looping through all rows and adding to list 
	   if (cursor.moveToFirst()) { 
	        do { 
	            
	            
	            
	             s=s+(cursor.getString(0)).toString();
	             s=s+","+(cursor.getString(1)).toString();
	             s=s+","+(cursor.getString(2)).toString()+",";
	             
	          
	            
	        } while (cursor.moveToNext()); 
	    } 
	 
	     
	    return s; 
	}


			
	public int getcount() 
	{
		SQLiteDatabase db=this.getWritableDatabase();
		Cursor cursor = db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
		int x= cursor.getCount();
		cursor.close();
		return x;
	}	
		
}

