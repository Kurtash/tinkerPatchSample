package com.android.TinkerPatch.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toast.makeText(this,"发生改变",Toast.LENGTH_SHORT).show();
//
//        txt = findViewById(R.id.txt);
//        txt.setText("Hello Bog!!");
    }
}
