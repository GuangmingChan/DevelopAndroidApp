package com.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DemoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        int a = 20;
        int b = 0;
        int c = 0;
        try{
        	c = a/b;
        }catch(Exception ex){
        	Log.e("MainActivity","��������",ex);
        }
    }
}