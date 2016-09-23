package com.a0588.deer.myapplication;

import android.hardware.usb.UsbConfiguration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Android_Work_2 extends AppCompatActivity implements View.OnClickListener {

    public String str = "";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private UsbConfiguration view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android__work_2);
        // Toast T1=Toast.makeText(this,"Hello",Toast.LENGTH_LONG);
        // T1.setGravity(0,0,-180);
        // T1.show();
        Button bt1 = (Button) findViewById(R.id.button_1);
        bt1.setOnClickListener(this);
        Button bt2 = (Button) findViewById(R.id.button_2);
        bt2.setOnClickListener(this);
        Button bt3 = (Button) findViewById(R.id.button_3);
        bt3.setOnClickListener(this);
        Button bt4 = (Button) findViewById(R.id.button_4);
        bt4.setOnClickListener(this);
        Button bt5 = (Button) findViewById(R.id.button_5);
        bt5.setOnClickListener(this);
        Button bt6 = (Button) findViewById(R.id.button_6);
        bt6.setOnClickListener(this);
        Button bt7 = (Button) findViewById(R.id.button_7);
        bt7.setOnClickListener(this);
        Button bt8 = (Button) findViewById(R.id.button_8);
        bt8.setOnClickListener(this);
        Button bt9 = (Button) findViewById(R.id.button_9);
        bt9.setOnClickListener(this);
        Button bt0 = (Button) findViewById(R.id.button_0);
        bt0.setOnClickListener(this);
        Button btc = (Button) findViewById(R.id.buttonclear);
        btc.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v) {

        TextView TextV = (TextView) findViewById(R.id.digit_text_view);
        //Toast T=Toast.makeText(this,"ป้อนรหัสผ่าน 6 ตัวอักษร",Toast.LENGTH_SHORT);
        //T.setGravity(0,0,-180);

        int id;
        id = v.getId();
        if (this.str.length() != 6) {
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
        if (id == R.id.buttonclear) {
            this.str = "";
            TextV.setText(this.str);
        }


    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Android_Work_2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.a0588.deer.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Android_Work_2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.a0588.deer.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
