package com.test.bmi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.test.bmi.fragments.BodyfatPercentage;
import com.test.bmi.fragments.bmi;
import com.test.bmi.fragments.bmr;

public class ScrMain extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scr_main);
        FragmentManager manager = getSupportFragmentManager();
        if (BMIApp.option == 1) {
            bmi bmi = new bmi();
            manager.beginTransaction().add(R.id.fl_container, bmi).commit();
        } else if (BMIApp.option == 2) {
            bmr bmr = new bmr();
            manager.beginTransaction().add(R.id.fl_container, bmr).commit();
        } else if (BMIApp.option == 3) {
            BodyfatPercentage bodyfatPercentage = new BodyfatPercentage();
            manager.beginTransaction().add(R.id.fl_container, bodyfatPercentage).commit();
        }
    }
}
