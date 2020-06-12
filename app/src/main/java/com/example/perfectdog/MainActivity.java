package com.example.perfectdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.DogbBttonview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendog();
            }
        });
        button1=(Button) findViewById(R.id.catbutton2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencat();
            }
        });
        button2=(Button) findViewById(R.id.takequizbutton3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentakeAquiz();
            }
        });
        button3=(Button) findViewById(R.id.questionbutton4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion();
            }
        });
    }
    public void opendog(){
        Intent intent=new Intent(this,dog.class);
        startActivity(intent);
    }
    public void opencat(){
        Intent intent1 =new Intent(this,cat.class);
        startActivity(intent1);
    }
    public void opentakeAquiz(){
        Intent intent2 =new Intent(this,takeAquiz.class);
        startActivity(intent2);
    }
    public void openQuestion(){
        Intent intent3 =new Intent(this,questions.class);
        startActivity(intent3);
    }
}
