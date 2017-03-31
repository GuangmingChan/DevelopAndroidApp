package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class DemoCheckboxActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final CheckBox chPhys = (CheckBox)findViewById(R.id.physical);
        final CheckBox chMusic = (CheckBox)findViewById(R.id.music);
        final CheckBox chPaint = (CheckBox)findViewById(R.id.painting);
        chPhys.setOnCheckedChangeListener(checkListener);
        chMusic.setOnCheckedChangeListener(checkListener);
        chPaint.setOnCheckedChangeListener(checkListener);
        
        Button bt = (Button)findViewById(R.id.btsubmit);
        bt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String str = "";
				if(chPhys.isChecked()){
					str += chPhys.getText().toString()+" ";
				}
				if(chMusic.isChecked()){
					str += chMusic.getText().toString()+" ";
				}
				if(chPaint.isChecked()){
					str += chPaint.getText().toString()+" ";
				}				
				Toast.makeText(DemoCheckboxActivity.this, str, Toast.LENGTH_SHORT).show();
			}
		});
    }
    
    private OnCheckedChangeListener checkListener = new OnCheckedChangeListener() {
    	@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			if(buttonView.isChecked()){
				Log.i("CheckBox","复选框中选中了"+buttonView.getText());
			}
		}
	};
}