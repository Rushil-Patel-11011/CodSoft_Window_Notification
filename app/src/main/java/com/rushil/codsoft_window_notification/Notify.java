package com.rushil.codsoft_window_notification;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Notify extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notify);
        textView=findViewById(R.id.title);
        String data = getIntent().getStringExtra("data");
        textView.setText(data);
    }
}
