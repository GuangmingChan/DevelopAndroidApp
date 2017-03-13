package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoTextView1Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tvp1=(TextView)findViewById(R.id.tvp);
        tvp1.setText("2014信息科技1班");
    }
}