package com.example.administrator.adnroidparsedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AnotherActivity extends Activity {
    private TextView textView;
    private Button goBack;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("User");
        textView = (TextView) findViewById(R.id.dataGetTextView);
        textView.setText(String.format("Name is %s, Age is %d",user.getName(),user.getPassword()));

        editText = (EditText) findViewById(R.id.editText);

        goBack = (Button) findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backData = new Intent();
                backData.putExtra("backData",editText.getText().toString());
                setResult(1,backData);
                finish();
            }
        });
    }


}
