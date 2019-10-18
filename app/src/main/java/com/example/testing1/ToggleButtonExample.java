package com.example.testing1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ToggleButtonExample extends AppCompatActivity {

    ToggleButton toggleButton1, toggleButton2;
    Button tbbutton1;
    TextView textView1,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toggle_button);

        textView1 =(TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 =(TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        tbbutton1 = (Button) findViewById(R.id.tbbutton1);
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);

        tbbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText("");
                textView4.setText("");
                textView3.append(toggleButton1.getText());
                textView4.append(toggleButton2.getText());
            }
        });

    }
}
