package com.example.administrator.adnroidparsedata;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
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
                //intent.putExtra("data","Data from 1st activity");
                Bundle bundle = new Bundle();
                bundle.putString("name","Jason");
                bundle.putInt("age",19);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
