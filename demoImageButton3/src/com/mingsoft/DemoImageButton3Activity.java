package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class DemoImageButton3Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageButton imgbt = (ImageButton)findViewById(R.id.imgbt2);
        imgbt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast toast = Toast.makeText(DemoImageButton3Activity.this, "单击第二个imageButton", Toast.LENGTH_LONG);
		    	toast.show();			
			}
		});
    }
    
    public void myClick(View v){
    	Toast toast = Toast.makeText(DemoImageButton3Activity.this, "单击第一个imageButton", Toast.LENGTH_LONG);
    	toast.show();
    }
}