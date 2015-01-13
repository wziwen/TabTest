package com.example.uitestacitivity; 
  
import android.app.Activity;  
import android.os.Bundle;  
import android.widget.TabHost;  
  
public class TabHostActivity extends Activity {  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_tabhost);  
        // 获取TabHost对象  
        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);  
        // 如果没有继承TabActivity时，通过该种方法加载启动tabHost  
        tabHost.setup();  
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("第一个标签",  
                getResources().getDrawable(R.drawable.weibo_listab_attention_on)).setContent(  
                R.id.view1));  
  
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("第三个标签")  
                .setContent(R.id.view3));  
  
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("第二个标签")  
                .setContent(R.id.view2));  
    }  
}  