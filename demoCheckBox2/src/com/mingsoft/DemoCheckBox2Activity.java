package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class DemoCheckBox2Activity extends Activity {
	/** Called when the activity is first created. */
	//private CheckBox sport = null;
	//private CheckBox music = null;
	//private CheckBox painting = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final CheckBox sport = (CheckBox)findViewById(R.id.sport);
        final CheckBox music = (CheckBox)findViewById(R.id.music);
        final CheckBox painting = (CheckBox)findViewById(R.id.painting);
        
        OnCheckedChangeListener checkListener = new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

			}
		};
		
		sport.setOnCheckedChangeListener(checkListener);
		music.setOnCheckedChangeListener(checkListener);
		painting.setOnCheckedChangeListener(checkListener);
        
		Button bt = (Button)findViewById(R.id.submit);    
		bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = "";
				if(sport.isChecked()){
					str += sport.getText().toString() + " ";
				}
				if(music.isChecked()){
					str += music.getText().toString() + " ";
				}
				if(painting.isChecked()){
					str += painting.getText().toString() + " ";
				}
				Toast.makeText(DemoCheckBox2Activity.this, "��ѡ����"+str, Toast.LENGTH_SHORT).show();
			}
		});
    }
}