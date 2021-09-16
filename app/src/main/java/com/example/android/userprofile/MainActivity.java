package com.example.android.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(R.string.name);
        name.setTextSize(50.0f);
        name.setTextColor(Color.GREEN);
        name.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText(R.string.birthday);
        birthday.setTextSize(36.0f);
        birthday.setTextColor(Color.BLUE);
        birthday.setTypeface(Typeface.SERIF, Typeface.ITALIC);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText(R.string.country);
        country.setTextSize(36.0f);
        country.setTextColor(Color.BLUE);
        country.setTypeface(Typeface.SERIF, Typeface.ITALIC);

        ImageView userPicture = (ImageView) findViewById(R.id.user_picture);
        userPicture.setImageResource(R.drawable.user_picture);
        userPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
