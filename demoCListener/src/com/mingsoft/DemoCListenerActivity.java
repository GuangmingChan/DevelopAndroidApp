package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DemoCListenerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView tv1 = (TextView)findViewById(R.id.tv1);
        Button bt1 = (Button)findViewById(R.id.button1);
        
        bt1.setOnClickListener(new BtCListener(tv1));
    }
    
}