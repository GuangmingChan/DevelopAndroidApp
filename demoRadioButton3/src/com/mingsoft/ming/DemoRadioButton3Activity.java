package com.mingsoft.ming;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DemoRadioButton3Activity extends Activity {
    /** Called when the activity is first created. */
	private RadioGroup radg = null;
    private RadioButton softEng = null;
    private RadioButton gamePlan=null;
    private RadioButton testEng=null;
    private RadioButton techSupport=null;
    private RadioButton operate=null;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        radg = (RadioGroup)findViewById(R.id.radgrp);
		softEng = (RadioButton) findViewById(R.id.softEng);
		gamePlan = (RadioButton) findViewById(R.id.gamePlan);
		testEng = (RadioButton) findViewById(R.id.testEng);
		techSupport = (RadioButton) findViewById(R.id.techSupport);
		operate = (RadioButton) findViewById(R.id.operation);

		radg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId){
				case R.id.softEng:
					showText(softEng.getText().toString());
					break;
				case R.id.gamePlan:
					showText(gamePlan.getText().toString());
					break;
				case R.id.testEng:
					showText(testEng.getText().toString());
					break;
				case R.id.techSupport:
					showText(techSupport.getText().toString());
					break;
				case R.id.operation:
					showText(operate.getText().toString());
					break;
				}
			}
		});    
		
	}
	public void showText(String str){
		Toast toast = Toast.makeText(this, "ƒ„—°÷–¡À"+str, Toast.LENGTH_SHORT);
		toast.show();
	}
}