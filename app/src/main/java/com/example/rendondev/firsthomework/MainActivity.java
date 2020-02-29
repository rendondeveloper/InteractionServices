package com.example.rendondev.firsthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rendondev.firsthomework.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    final StringBuilder color  = new StringBuilder();

     //https://www.thecolorapi.com/id?hex=94B1E3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


/*
Fis
    private void colorBackground(){
        final Random randon = new Random();
        color.append(randon.nextInt(10) +""+
                     randon.nextInt(10) +""+
                     "B" +
                     randon.nextInt(10) +""+
                     "E" +
                     randon.nextInt(10));
    }

 */
}
