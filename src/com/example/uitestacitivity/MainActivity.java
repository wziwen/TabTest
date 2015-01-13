package com.example.uitestacitivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TabWidget;

public class MainActivity extends Activity implements OnClickListener{

	TabWidget mTabWidget;
	ViewPager mViewPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.btn_tabhost).setOnClickListener(this);
		findViewById(R.id.btn_viewpager).setOnClickListener(this);
		findViewById(R.id.btn_fragmenttabhost).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.btn_tabhost:
			intent = new Intent(this, TabHostActivity.class);
			startActivity(intent);
			break;
		case R.id.btn_viewpager:
			intent = new Intent(this, ViewPagerActivity.class);
			startActivity(intent);
			break;

		case R.id.btn_fragmenttabhost:
			intent = new Intent(this, FragmentTabHostActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
	
	
	
}
