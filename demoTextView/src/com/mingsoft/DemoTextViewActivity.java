package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoTextViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText("2014��Ϣ�Ƽ�");
    }
}