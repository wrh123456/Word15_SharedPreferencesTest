package com.example.word15_sharedpreferencestest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.save_data);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
                editor.putString("name","Tom");
                editor.putInt("age",20);
                editor.putBoolean("married",false);
                editor.apply();
            }
        });
        button2=findViewById(R.id.restore_data);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences editor=getSharedPreferences("data",MODE_PRIVATE);
                String name=editor.getString("name","");
                int age=editor.getInt("age",0);
                boolean married=editor.getBoolean("married",false);
                Log.d("MainActivity", "onClick: name is"+name);
                Log.d("MainActivity", "onClick: age is"+age);
                Log.d("MainActivity", "onClick: married is"+married);
            }
        });


    }
}
