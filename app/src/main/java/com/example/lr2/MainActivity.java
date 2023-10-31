package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnCLick(View v)
    {
        EditText nameText = findViewById(R.id.name);
        EditText ageText = findViewById(R.id.age);

        String name = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("age",age);
        startActivity(intent);
    }
}