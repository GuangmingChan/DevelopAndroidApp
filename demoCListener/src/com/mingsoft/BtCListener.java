package com.mingsoft;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class BtCListener implements OnClickListener {
	
	private TextView tview;
	public BtCListener(TextView tview){
		this.tview = tview;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		tview.setText("hello");
	}

}
