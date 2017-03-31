package com.mingsoft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class DemoLoginActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final EditText etAcount = (EditText)findViewById(R.id.acount);
        final EditText etPassword = (EditText)findViewById(R.id.etPass);

        ImageButton btLogin = (ImageButton)findViewById(R.id.btlogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		        String strAcount = etAcount.getText().toString();
		        String strPassword = etPassword.getText().toString();
				if(strAcount.equals("zhangsan") && strPassword.equals("123456")){
					Intent intent = new Intent();
					intent.setClass(DemoLoginActivity.this, GameActivity.class);
					startActivity(intent);
				}
								
			}
		});
        
    }
    
    public void myClick(View v){
    	DemoLoginActivity.this.finish();
    }
}