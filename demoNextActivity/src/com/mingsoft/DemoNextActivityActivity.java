package com.mingsoft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DemoNextActivityActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button bt1=(Button)findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView tv1=(TextView)findViewById(R.id.textView1);
		        Intent intent = new Intent();
		        intent.setClass(DemoNextActivityActivity.this, NextActivity.class);
		        startActivity(intent);
			}
		});
       
    }
}