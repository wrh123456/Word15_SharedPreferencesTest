package com.example.word15_sharedpreferencestest;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class ShaferTest{
    private static final String key="login";
    private static SharedPreferences sp;
    public static SharedPreferences getSp(Context context){
        if(sp==null){
            sp=context.getSharedPreferences(key,Context.MODE_PRIVATE);
        }
        return sp;
    }
    public boolean getBoolean(String name,Context context){
        SharedPreferences sp=getSp(context);
        boolean b=sp.getBoolean("yes",false);
        return b;
    }
    public void setBoolean(String name,Context context,boolean b){
        SharedPreferences.Editor editor=getSp(context).edit();
        editor.putBoolean("yes",b);
        editor.commit();
    }
}
