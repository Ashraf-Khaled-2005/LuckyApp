package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editTextText);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                
                
                String name=et.getText().toString();
                
                
                if( !name.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, Target_activity.class);
                    intent.putExtra("Name", name);
                    startActivity(intent);
                }else {

                    Toast.makeText(MainActivity.this, "User is empty", Toast.LENGTH_SHORT).show();
                    
                }
            }
        });


    }
}