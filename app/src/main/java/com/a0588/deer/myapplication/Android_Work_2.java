package com.a0588.deer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Android_Work_2 extends AppCompatActivity implements View.OnClickListener {

    public String str = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android__work_2);
        // Toast T1=Toast.makeText(this,"Hello",Toast.LENGTH_LONG);
        // T1.setGravity(0,0,-180);
        // T1.show();
        Button bt1 = (Button) findViewById(R.id.button_1);
        bt1.setOnClickListener(this);
        Button bt2=(Button) findViewById(R.id.button_2);
        bt2.setOnClickListener(this);
        Button bt3=(Button) findViewById(R.id.button_3);
        bt3.setOnClickListener(this);
        Button bt4=(Button) findViewById(R.id.button_4);
        bt4.setOnClickListener(this);
        Button bt5=(Button) findViewById(R.id.button_5);
        bt5.setOnClickListener(this);
        Button bt6=(Button) findViewById(R.id.button_6);
        bt6.setOnClickListener(this);
        Button bt7=(Button) findViewById(R.id.button_7);
        bt7.setOnClickListener(this);
        Button bt8=(Button) findViewById(R.id.button_8);
        bt8.setOnClickListener(this);
        Button bt9=(Button) findViewById(R.id.button_9);
        bt9.setOnClickListener(this);
        Button bt0=(Button) findViewById(R.id.button_0);
        bt0.setOnClickListener(this);
        Button btc=(Button) findViewById(R.id.button_clear);
        btc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TextView TextV=(TextView)findViewById(R.id.digit_text_view);
        //Toast T=Toast.makeText(this,"ป้อนรหัสผ่าน 6 ตัวอักษร",Toast.LENGTH_SHORT);
        //T.setGravity(0,0,-180);
        int id= view.getId();
        if(this.str.length()!=6) {
            if (id == R.id.button_1) {
                this.str += "1";
                TextV.setText(this.str);

            } else if (id == R.id.button_2) {
                this.str += "2";
                TextV.setText(this.str);

            } else if (id == R.id.button_3) {
                this.str += "3";
                TextV.setText(this.str);

            } else if (id == R.id.button_4) {
                this.str += "4";
                TextV.setText(this.str);

            } else if (id == R.id.button_5) {
                this.str += "5";
                TextV.setText(this.str);

            } else if (id == R.id.button_6) {
                this.str += "6";
                TextV.setText(this.str);

            } else if (id == R.id.button_7) {
                this.str += "7";
                TextV.setText(this.str);

            } else if (id == R.id.button_8) {
                this.str += "8";
                TextV.setText(this.str);

            } else if (id == R.id.button_9) {
                this.str += "9";
                TextV.setText(this.str);

            } else if (id == R.id.button_0) {
                this.str += "0";
                TextV.setText(this.str);

            }
        }
        if (id == R.id.button_clear) {
            this.str="";
            TextV.setText(this.str);
        }


    }
}
