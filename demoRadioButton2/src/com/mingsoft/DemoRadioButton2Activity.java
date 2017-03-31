package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DemoRadioButton2Activity extends Activity {
    /** Called when the activity is first created. */
	
	private RadioGroup rg = null;
	/*
	private RadioButton softEngBt = null;
	private RadioButton gameBt = null;
	private RadioButton testBt = null;
    */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final RadioButton softEngBt = (RadioButton)findViewById(R.id.softEng);
        final RadioButton gameBt = (RadioButton)findViewById(R.id.gameDes);
        final RadioButton testBt = (RadioButton)findViewById(R.id.testEng);
        //final RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
        
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId){
				case R.id.softEng:
					showText(softEngBt.getText().toString());
					break;
				case R.id.gameDes:
					showText(gameBt.getText().toString());
					break;
				case R.id.testEng:
					showText(testBt.getText().toString());
					break;
				}
			}
		});
    }
    
    public void showText(String str){
    	Toast toast = Toast.makeText(DemoRadioButton2Activity.this, "ѡ����"+str, Toast.LENGTH_SHORT);
    	toast.show();
    }
}