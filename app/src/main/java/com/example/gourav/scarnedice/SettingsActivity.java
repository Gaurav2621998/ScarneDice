package com.example.gourav.scarnedice;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

import java.util.prefs.PreferenceChangeListener;

public class SettingsActivity extends AppCompatPreferenceActivity {

    Intent intent;
    int count=0;

    SharedPreferences sp;
    private PreferenceChangeListener preferenceChangeListener=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screen);

        sp= PreferenceManager.getDefaultSharedPreferences(this);
        preferenceChangeListener=new PreferenceChangeListener();
        sp.registerOnSharedPreferenceChangeListener(preferenceChangeListener);
        ApplySettings();


    }

    private class PreferenceChangeListener implements
            SharedPreferences.OnSharedPreferenceChangeListener {
        @Override
        public void onSharedPreferenceChanged(SharedPreferences prefs,
                                              String key) {
          //  Toast.makeText(SettingsActivity.this, "hello", Toast.LENGTH_SHORT).show();
            ApplySettings();
        }
    }

    public void ApplySettings()
    {
        count++;
        String dice=sp.getString("Dice","Single Player");
        String player=sp.getString("Players","Single Player");

        //Toast.makeText(this, Integer.toString(count), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, dice, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, player, Toast.LENGTH_SHORT).show();

        if(dice.equals("Single Dice"))
        {
            //Toast.makeText(this, dice + "1", Toast.LENGTH_SHORT).show();
            if(player.equals("Single Player"))
            {
                intent=new Intent(this,Splayeasy.class);
                //Toast.makeText(this, "last s s", Toast.LENGTH_SHORT).show();
            }
            else
            {
                intent=new Intent(this,Mplayeasy.class);
              //  Toast.makeText(this, "last s d", Toast.LENGTH_SHORT).show();

            }
        }
        else
        {
            //Toast.makeText(this, dice + "2", Toast.LENGTH_SHORT).show();

            if(player.equals("Single Player"))
            {
                intent=new Intent(this,Splaymed.class);
                //Toast.makeText(this, "last d s", Toast.LENGTH_SHORT).show();

            }
            else
            {
                intent=new Intent(this,Mplaymed.class);
               // Toast.makeText(this, "last d d", Toast.LENGTH_SHORT).show();

            }
        }

    }





    @Override
    public void onBackPressed() {
        startActivity(intent);
    }
}
