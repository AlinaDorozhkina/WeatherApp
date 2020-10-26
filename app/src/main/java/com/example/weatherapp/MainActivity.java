package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView weatherDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherDescription=findViewById(R.id.textViewResult);
    }

    public void showMoscowWeather (View v){
        String description = getResources().getString(R.string.moscow_weather);
        weatherDescription.setText(description);

    }
    public void showRomaWeather (View v){
        String description = getResources().getString(R.string.roma_weather);
        weatherDescription.setText(description);

    }
    public void showTokyoWeather (View v){
        String description = getResources().getString(R.string.tokyo_weather);
        weatherDescription.setText(description);

    }
    public void showLosAngelesWeather (View v){
        String description = getResources().getString(R.string.los_angeles_weather);
        weatherDescription.setText(description);

    }
}