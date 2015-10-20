package com.telephone.squery.listviewlayouts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.telephone.squery.listviewlayouts.adapter.TestAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView) findViewById(R.id.list);
        ArrayList mDatas = new ArrayList();
        for (int i = 0; i < 20; i++) {
            mDatas.add("Java....."+i);
        }
        listView.setAdapter(new TestAdapter(this, mDatas));

    }
}
