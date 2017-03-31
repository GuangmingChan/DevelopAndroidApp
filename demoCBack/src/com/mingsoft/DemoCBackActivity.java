package com.mingsoft;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;

public class DemoCBackActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event){
    	switch(keyCode){
    	case KeyEvent.KEYCODE_DPAD_UP:
    		showText("按下向上键");
    		break;
    	case KeyEvent.KEYCODE_DPAD_DOWN:
    		showText("按下向下键");
    		break;
    	
    	}
    	return false;
    }
    
    public boolean onKeyUp(int keyCode, KeyEvent event){
    	switch(keyCode){
    	case KeyEvent.KEYCODE_DPAD_UP:
    		showText("释放向上键");
    		break;
    	case KeyEvent.KEYCODE_DPAD_DOWN:
    		showText("释放向下键");
    		break;
    	}
    	return false;
    }
    
    public boolean onTouchEvent(MotionEvent event){
    	int action = event.getAction();
    	int posX=(int)event.getX();
    	int posY=(int)event.getY();
    	switch(action){
    	case MotionEvent.ACTION_DOWN:
    		showText("坐标"+posX+","+posY);
    		break;
    		
    	}
    	return false;
    }
    
    public void showText(String str){
    	Toast.makeText(DemoCBackActivity.this, str, Toast.LENGTH_SHORT).show();
    }
}