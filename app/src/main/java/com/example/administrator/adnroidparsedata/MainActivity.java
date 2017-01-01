package com.example.administrator.adnroidparsedata;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //next = (Button) findViewById(R.id.parseButton);

        findViewById(R.id.parseButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("User", new User("Bob",19));
                startActivity(intent);
            }
        });

    }
}
