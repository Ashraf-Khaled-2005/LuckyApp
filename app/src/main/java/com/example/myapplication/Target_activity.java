package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Target_activity extends AppCompatActivity {
    TextView tv;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        tv=findViewById(R.id.textView_target);
        btn=findViewById(R.id.button2);
        Random random=new Random();
      int number=  random.nextInt(100);
        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        tv.setText("Lucky number for " + Name + " is " + number);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Lucky number for " + Name + " is " + number);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}