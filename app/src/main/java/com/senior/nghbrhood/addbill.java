package com.senior.nghbrhood;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class addbill extends AppCompatActivity {

    private EditText dater;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbill);

        //hiding status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Locking the orientation to Portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //hide the title bar
        getSupportActionBar().hide();

        dater = findViewById(R.id.datePt);

        dater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(addbill.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int day, int month, int year) {
                        String holder = year + "-" + (month + 1) + "-" + day;
                        dater.setText(holder);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelTv4:
                Intent intent2 = new Intent(getApplicationContext(), MainPage.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}