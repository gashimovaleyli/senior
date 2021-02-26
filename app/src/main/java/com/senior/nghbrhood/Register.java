package com.senior.nghbrhood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //hiding status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Locking the orientation to Portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //hide the title bar
        getSupportActionBar().hide();

        Spinner spin = (Spinner) findViewById(R.id.typeSpinner);

        spin.setSelection(0);


    }

    public void onClick(View v){
        Intent intent = null;
        switch(v.getId()){
            case R.id.cancelTv2:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.registerBtn2:
                intent = new Intent(this, MainActivity.class);
                Toast.makeText(this, "You successfully registered!", Toast.LENGTH_SHORT).show();
                break;
        }
        if (null!=intent) startActivity(intent);
    }
}