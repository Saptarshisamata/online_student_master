package com.saptarshisamanta.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.saptarshisamanta.myapplication.databinding.ActivityMainBinding;
import com.saptarshisamanta.myapplication.subject.SubjectActivity;

public class MainActivity extends AppCompatActivity {
    int sem;
    String stream;
    String CSE = "cse";
    String IT = "it";
    String EE = "ee";
    String ECE = "ece";
    String ME = "me";
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stream = CSE;
            }
        });
        activityMainBinding.ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stream = EE;
            }
        });
        activityMainBinding.it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stream = IT;
            }
        });
        activityMainBinding.me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stream = ME;
            }
        });
        activityMainBinding.ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stream = ECE;
            }
        });
        activityMainBinding.first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem = 1;
            }
        });
        activityMainBinding.second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 2;
            }
        });
        activityMainBinding.third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 3;
            }
        });
        activityMainBinding.fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 4;
            }
        });
        activityMainBinding.fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 5;
            }
        });
        activityMainBinding.sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 6;
            }
        });
        activityMainBinding.seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 7;
            }
        });
        activityMainBinding.eighth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem = 8;
            }
        });
    }

    public void choose(View view) {
        Intent intent = new Intent(MainActivity.this, SubjectActivity.class);
        intent.putExtra("stream", stream);
        intent.putExtra("sem", sem);
        startActivity(intent);


    }
}
