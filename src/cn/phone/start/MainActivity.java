package cn.phone.start;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       
    }
    //�������˼�ʱִ�У�onBackPressed�ĸ����е�����finish������ע�͵�super�����Ϳ����÷��ؼ�ʧЧ
    @Override
    public void onBackPressed() {
    	// TODO Auto-generated method stub
    	//super.onBackPressed();
    }
    

}
