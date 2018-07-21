package com.example.word15_sharedpreferencestest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private ShaferTest shaferTest=new ShaferTest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.save_data);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
//                editor.putString("name","Tom");
//                editor.putInt("age",20);
//                editor.putBoolean("married",false);
//                editor.apply();
//            }
//        });
//        button2=findViewById(R.id.restore_data);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences editor=getSharedPreferences("data",MODE_PRIVATE);
//                String name=editor.getString("name","");
//                int age=editor.getInt("age",0);
//                boolean married=editor.getBoolean("married",false);
//                Log.d("MainActivity", "onClick: name is"+name);
//                Log.d("MainActivity", "onClick: age is"+age);
//                Log.d("MainActivity", "onClick: married is"+married);
//            }
//        });
        button3=(Button)findViewById(R.id.button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean b=shaferTest.getBoolean("yes",MainActivity.this);
                if(b){
                    Intent intent2=new Intent(MainActivity.this,Main.class);
                    startActivity(intent2);
                }
                else{
                    Intent intent3=new Intent(MainActivity.this,Welcome.class);
                    startActivity(intent3);
                }

            }
        });


    }
}
