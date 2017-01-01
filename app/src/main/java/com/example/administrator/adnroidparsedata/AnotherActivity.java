package com.example.administrator.adnroidparsedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
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
        User user = intent.getParcelableExtra("User");
        textView = (TextView) findViewById(R.id.dataGetTextView);
        textView.setText(String.format("Name is %s, Age is %d",user.getName(),user.getPassword()));
    }


}
