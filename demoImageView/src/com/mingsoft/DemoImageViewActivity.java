package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DemoImageViewActivity extends Activity {
    /** Called when the activity is first created. */
	private Button bt = null;
	private ImageView imgv = null;
	private int imgid = R.drawable.sunshine;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        imgv = (ImageView)findViewById(R.id.imgvchage);        
        bt = (Button)findViewById(R.id.btchange);
        bt.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(imgid == R.drawable.sunshine){
					imgid = R.drawable.sunshine2;
				}
				else{
					imgid = R.drawable.sunshine;
				}
				imgv.setImageResource(imgid);
			}
        });
    }
}