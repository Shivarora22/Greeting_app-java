package com.example.greeting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText edittext;
    private  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        button = findViewById(R.id.button);
        edittext = findViewById(R.id.Edittext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = edittext.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome " + inputName +" to the Application !", Toast.LENGTH_LONG).show();
            }
        });
    }
}