package com.example.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final JniUtil jniUtil = new JniUtil();
        TextView textView = (TextView) findViewById(R.id.tv);
        int a = 1;
        int b = 2;
        int num = jniUtil.add(a, b);
        String end = num + "";
        textView.setText(end);
    }
}
