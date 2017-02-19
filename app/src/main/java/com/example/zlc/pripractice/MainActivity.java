package com.example.zlc.pripractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){

        try {
            FileOutputStream fos = openFileOutput("private.txt",MODE_PRIVATE);
            fos.write("private".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void click2(View v){

        try {
            FileOutputStream fos = openFileOutput("append.txt",MODE_APPEND);
            fos.write("append".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void click3(View v){

        try {
            FileOutputStream fos = openFileOutput("read.txt",MODE_WORLD_READABLE);
            fos.write("read".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void click4(View v){

        try {
            FileOutputStream fos = openFileOutput("write.txt",MODE_WORLD_WRITEABLE);
            fos.write("write".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
