package com.precourse.hellodavid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.txtCol).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                //Sets Random RGB Values
                int red =  r.nextInt(255);
                int blue = r.nextInt(255);
                int green = r.nextInt(255);
                ((TextView) findViewById(R.id.textView)).setTextColor(Color.rgb(red, green, blue));
            }
        });
        findViewById(R.id.viewCol).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                //sets Random RGB values
                int red =  r.nextInt(255);
                int blue = r.nextInt(255);
                int green = r.nextInt(255);
                (findViewById(R.id.container)).setBackgroundColor(Color.rgb(red, green, blue));

            }
        });
        findViewById(R.id.txtStr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textHolder = (EditText) findViewById(R.id.newText);
                String newStr = textHolder.getText().toString();
                //default String if empty
                if (TextUtils.isEmpty(newStr))
                    ((TextView)findViewById(R.id.textView)).setText("Hello from David!");
                else
                    ((TextView)findViewById(R.id.textView)).setText(newStr);
            }
        });

        findViewById(R.id.container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reset Text Color
                ((TextView) findViewById(R.id.textView)).setTextColor(Color.rgb(0,0,0));
                //Reset Text String
                ((TextView) findViewById(R.id.textView)).setText("Hello from David!");
                //Reset Background Color
                ( findViewById(R.id.container)).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));



            }
        });
    }
}
