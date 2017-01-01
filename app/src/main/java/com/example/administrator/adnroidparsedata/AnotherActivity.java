package com.example.administrator.adnroidparsedata;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        textView = (TextView) findViewById(R.id.dataGetTextView);
        //textView.setText(intent.getStringExtra("data"));
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");
        textView.setText(String.format("Name is %s, Age is %d",name,age));
    }


}
