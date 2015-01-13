package com.example.uitestacitivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabWidget;

public class ViewPagerActivity extends Activity {

	TabWidget mTabWidget;
	ViewPager mViewPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewpager);
		
		mTabWidget = (TabWidget) findViewById(R.id.tabWidget);
		mViewPager = (ViewPager) findViewById(R.id.viewPager);
		
		initTabWidget();
	}
	
	private void initTabWidget() {
		mTabWidget.addView(getLayoutInflater().inflate(R.layout.layout_red, null));
		mTabWidget.addView(getLayoutInflater().inflate(R.layout.layout_blue, null));
		mTabWidget.addView(getLayoutInflater().inflate(R.layout.layout_green, null));
	}

	private void initViewPager() {
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
}
