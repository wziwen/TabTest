package com.example.uitestacitivity; 
  
import com.example.fragments.FragmentBlue;
import com.example.fragments.FragmentGreen;
import com.example.fragments.FragmentRed;

import android.os.Bundle;  
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
  
public class FragmentTabHostActivity extends FragmentActivity {  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_fragmenttabhost);  
        
        // 获取TabHost对象  
        FragmentTabHost mTabHost = (FragmentTabHost)findViewById(R.id.fragmenttabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.tabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("red").setIndicator("Red"),
                FragmentRed.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("blue").setIndicator("Blue"),
        		FragmentBlue.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("green").setIndicator("Green"),
        		FragmentGreen.class, null);
    }  
}  