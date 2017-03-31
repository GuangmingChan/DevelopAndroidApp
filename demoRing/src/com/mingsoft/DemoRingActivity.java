package com.mingsoft;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DemoRingActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      
        final RadioGroup radGrp = (RadioGroup)findViewById(R.id.radgrp);  
        /* 
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				RadioButton bt = (RadioButton)findViewById(checkedId);
				showText("��ǰ����ʱ��Ϊ"+bt.getText().toString());
			}
		});
        
        CheckBox chbx1=(CheckBox)findViewById(R.id.chebox1);
        CheckBox chbx2=(CheckBox)findViewById(R.id.chebox2);
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked){
					showText("����ģʽΪ"+buttonView.getText().toString());
				}
			}
		};
        chbx1.setOnCheckedChangeListener(listener);
        chbx1.setOnCheckedChangeListener(listener);
      */
        
        
        
        final CheckBox chbx1=(CheckBox)findViewById(R.id.chebox1);
        final CheckBox chbx2=(CheckBox)findViewById(R.id.chebox2);
        
        Button bt=(Button)findViewById(R.id.btok);
        bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String strch = "";
				for(int i = 0; i < radGrp.getChildCount(); ++ i){
					RadioButton radbt = (RadioButton)radGrp.getChildAt(i);
					if(radbt.isChecked()){
						//showText("��ǰ����ʱ��Ϊ"+radbt.getText().toString());
						strch = "��ǰ����ʱ��Ϊ"+radbt.getText().toString();
						break;
					}
				}
				String strch2 = "";
				if(chbx1.isChecked()){
					strch2 += chbx1.getText().toString()+" ";
				}
				if(chbx2.isChecked()){
					strch2 += chbx2.getText().toString()+" ";
				}
				if(chbx1.isChecked() | chbx2.isChecked()){
					strch = strch.concat("������ģʽΪ"+strch2);
				}
				showText(strch);
				
			}
		});
    }
    
    public void showText(String str){
    	Toast.makeText(DemoRingActivity.this, "��ѡ����"+str, Toast.LENGTH_SHORT).show();
    }
}