package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv5 = (TextView) findViewById(R.id.textView5);
        tv2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //建立一个意图,参数为（当前的Activity类对象，需要开的的Activity类）
                Intent intent = new Intent(MainActivity.this,EquipmentActivity.class);
                //启动意图
                startActivity(intent);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //建立一个意图,参数为（当前的Activity类对象，需要开的的Activity类）
                Intent intent = new Intent(MainActivity.this,SceneActivity.class);
                //启动意图
                startActivity(intent);
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //建立一个意图,参数为（当前的Activity类对象，需要开的的Activity类）
                Intent intent = new Intent(MainActivity.this,MonitorActivity.class);
                //启动意图
                startActivity(intent);
            }
        });
        }

    }
