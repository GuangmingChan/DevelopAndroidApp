package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class DemoEditTextActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        EditText et = (EditText)findViewById(R.id.edpwd);
        String pwd = et.getText().toString();

    }
}