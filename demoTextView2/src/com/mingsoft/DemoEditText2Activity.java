package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoEditText2Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv1=(TextView)findViewById(R.id.tv);
        tv1.setText("2014��Ϣ�Ƽ�");
    }
}