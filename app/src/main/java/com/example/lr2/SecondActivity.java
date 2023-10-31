package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nametv, agetv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nametv = findViewById(R.id.nameTV);
        agetv = findViewById(R.id.age);
        Bundle arg = getIntent().getExtras();
        if(arg!=null)
        {
            nametv.setText(arg.getString("name"));
            agetv.setText("" + arg.getInt("age"));
        }

    }
    public void onClick(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}