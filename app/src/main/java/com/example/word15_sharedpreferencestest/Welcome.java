package com.example.word15_sharedpreferencestest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private  ShaferTest shaferTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        textView=(TextView)findViewById(R.id.textview1);
        shaferTest=new ShaferTest();
        button=(Button)findViewById(R.id.yes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shaferTest.setBoolean("yes",Welcome.this,true);
                Intent intent=new Intent(Welcome.this,Main.class);
                startActivity(intent);
            }
        });

    }
}
