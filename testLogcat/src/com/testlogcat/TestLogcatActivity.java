package com.testlogcat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TestLogcatActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //��ȡUI�������
        findViews();
        //ΪUI��������¼�����
        setListeners();
    }
    
    private TextView testMessage;
    private Button testButton;
    private void findViews(){
    	testMessage = (TextView)findViewById(R.id.testMessage);
    	testButton = (Button)findViewById(R.id.testbutton);  	
    }
    private void setListeners(){
    	testButton.setOnClickListener(new OnClickListener(){
    		public void onClick(View v){
    			testMessage.setText("Changed OK!");
    		}
    	});
    }
}