package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class DemoImageButtonActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageButton imbt = (ImageButton)findViewById(R.id.imbt2);
        imbt.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Toast toast = Toast.makeText(DemoImageButtonActivity.this, "��������imagebutton2", Toast.LENGTH_SHORT);
            	toast.show();
        	}
        });
    }
    
    public void myClick(View v){
    	Toast toast = Toast.makeText(DemoImageButtonActivity.this, "��������imagebutton1", Toast.LENGTH_SHORT);
    	toast.show();
    }
    
}