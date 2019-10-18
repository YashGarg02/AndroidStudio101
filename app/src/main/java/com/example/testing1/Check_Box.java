package com.example.testing1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Check_Box extends AppCompatActivity {


    CheckBox checkBox1,checkBox2;
    Button cbbutton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkboxexample);

        cbbutton1 = (Button)findViewById(R.id.cbbutton1);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);

        cbbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int price = 0;
                StringBuilder total = new StringBuilder();

                total.append("Items Selected:");
                if(checkBox1.isChecked()) {
                    total.append("\niPhone-Rs100k");

                    price += 1000000;
                }
                if (checkBox2.isChecked()){
                    total.append("\nWatch Rs50k");
                    price+=50000;

                }
                else if(checkBox1.isChecked()==false&&checkBox2.isChecked()==false)
                {
                    total.append("null");

                }
                total.append("\n Price for the item(s) selected is Rs"+price);
                Toast.makeText(getApplicationContext(),total.toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
