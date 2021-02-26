package com.senior.nghbrhood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ChangePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        //hiding status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Locking the orientation to Portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //hide the title bar
        getSupportActionBar().hide();
    }

    public void onClick(View v){
        Intent intent = null;
        switch(v.getId()){
            case R.id.cancelTv3:
                intent = new Intent(this, MainPage.class);
                break;
            case R.id.loginBtn3:
                intent = new Intent(this, MainActivity.class);
                Toast.makeText(this, "Your password is successfully changed.", Toast.LENGTH_SHORT).show();
                break;
        }
        if (null!=intent) startActivity(intent);
    }
}