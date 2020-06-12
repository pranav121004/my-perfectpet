package com.example.perfectdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class questions extends AppCompatActivity {
    Button open;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        open=(Button) findViewById(R.id.button2);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquestionparttwo();
            }
        });
    }
    public void openquestionparttwo(){
        Intent intentque =new Intent(this,questionparttwo.class);
        startActivity(intentque);
    }
}
