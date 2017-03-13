package com.mingsoft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DemoButtonActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       Button bt = (Button)findViewById(R.id.btLogin);
       bt.setOnClickListener(new OnClickListener(){
    	   @Override
    	   public void onClick(View v){
    		   Intent intent = new Intent();
    		   intent.setClass(DemoButtonActivity.this, InquiryActivity.class);
    		   startActivity(intent);
    		   DemoButtonActivity.this.finish();
    	   }
       });

    }
}