package com.example.testing1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Button button1,button2, button3, button4;
    TextView textView1, textView2, textView3,textView4;
    RadioGroup radioGroup;
    AlertDialog.Builder builder;
    RatingBar ratingBar;

    String[] country = {"India","USA","Australia","Singapore","Norway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        builder = new AlertDialog.Builder(this);

        textView4 = (TextView)findViewById(R.id.textView4);
        final Spinner spin =(Spinner)findViewById(R.id.spinner); //y has to be declared final
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //clesar spinner value on start
        //set spinner hhint (setPrompt)
        spin.setPrompt("Select country");
         spin.setAdapter(aa);



         button4 = (Button)findViewById(R.id.button4);
         ratingBar = (RatingBar)findViewById(R.id.ratingBar);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton1);
                RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton2);
                RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton3);

                RadioButton rb6 = (RadioButton)findViewById(R.id.radioButton6);
                RadioButton rb7 = (RadioButton)findViewById(R.id.radioButton7);
                RadioButton rb8 = (RadioButton)findViewById(R.id.radioButton8);
                RadioButton rb9 = (RadioButton)findViewById(R.id.radioButton9);
                RadioButton rb10 = (RadioButton)findViewById(R.id.radioButton10);
                RadioButton rb11 = (RadioButton)findViewById(R.id.radioButton11);
                RadioButton rb12 = (RadioButton)findViewById(R.id.radioButton12);
                RadioButton rb13 = (RadioButton)findViewById(R.id.radioButton13);
                RadioButton rb14 = (RadioButton)findViewById(R.id.radioButton14);
                RadioButton rb15 = (RadioButton)findViewById(R.id.radioButton15);
                RadioButton rb16 = (RadioButton)findViewById(R.id.radioButton16);
                RadioButton rb17 = (RadioButton)findViewById(R.id.radioButton17);
                RadioButton rb18 = (RadioButton)findViewById(R.id.radioButton18);
                RadioButton rb19 = (RadioButton)findViewById(R.id.radioButton19);
                RadioButton rb20 = (RadioButton)findViewById(R.id.radioButton20);
                RadioButton rb21 = (RadioButton)findViewById(R.id.radioButton21);
                RadioButton rb22 = (RadioButton)findViewById(R.id.radioButton22);
                RadioButton rb23 = (RadioButton)findViewById(R.id.radioButton23);


                if (rb1.isChecked()){

                    Intent i = new Intent(MainActivity.this, ToggleButtonExample.class);
                    startActivity(i);
                }
                else if (rb2.isChecked()){
                    Intent i = new Intent(getApplicationContext(),Check_Box.class);
                    startActivity(i);
                }
                /*else if (rb3.isChecked()){
                    Intent i = new Intent(getApplicationContext(),Custom_Checkbox.class);
                    startActivity(i);
                }
                else if (rb5.isChecked()){
                    Intent i = new Intent(getApplicationContext(),SpinnerExample.class);
                    startActivity(i);
                }*/
                else if (rb6.isChecked()){
                    Intent i = new Intent(getApplicationContext(),AutoCompTextViewExample.class);
                    startActivity(i);
                }
                else if (rb7.isChecked()){
                    Intent i = new Intent(getApplicationContext(),List_View.class);  //mylist.xml not made
                    startActivity(i);
                }
                else if (rb10.isChecked()) {
                    Intent i = new Intent(getApplicationContext(), SeekBarExample.class);
                    startActivity(i);
                }
                /*else if (rb8.isChecked()){
                    Intent i = new Intent(getApplicationContext(),Custom_ListView.class);
                    startActivity(i);
                }

                else if (rb10.isChecked()){
                    Intent i = new Intent(getApplicationContext(),WebViewExample.class);
                    startActivity(i);
                }
                else if (rb11.isChecked()){
                    Intent i = new Intent(getApplicationContext(),DatePickExample.class);
                    startActivity(i);
                }
                else if (rb12.isChecked()){
                    Intent i = new Intent(getApplicationContext(),TimePickExample.class);
                    startActivity(i);
                }
                else if (rb13.isChecked()){
                    Intent i = new Intent(getApplicationContext(),Analog_Digital.class);
                    startActivity(i);
                }
                else if (rb14.isChecked()){
                    Intent i = new Intent(getApplicationContext(),ProgBarExample.class);
                    startActivity(i);
                }
                else if (rb15.isChecked()){
                    Intent i = new Intent(getApplicationContext(),HorizontalScrollExample.class);
                    startActivity(i);
                }
                else if (rb16.isChecked()){
                    Intent i = new Intent(getApplicationContext(),ImageSwitchExample.class);
                    startActivity(i);
                }
                else if (rb17.isChecked()){
                    Intent i = new Intent(getApplicationContext(),ImageSlideExample.class);
                    startActivity(i);
                }
                else if (rb18.isChecked()){
                    Intent i = new Intent(getApplicationContext(),ViewStubExample.class);
                    startActivity(i);
                }
                else if (rb19.isChecked()){
                    Intent i = new Intent(getApplicationContext(),TabLayoutExample.class);
                    startActivity(i);
                }
                else if (rb20.isChecked()){
                    Intent i = new Intent(getApplicationContext(),TabFrameLayoutExample.class);
                    startActivity(i);
                }
                else if (rb21.isChecked()){
                    Intent i = new Intent(getApplicationContext(),SearchViewExample.class);
                    startActivity(i);
                }
                else if (rb22.isChecked()){
                    Intent i = new Intent(getApplicationContext(),SearchViewToolBarExample.class);
                    startActivity(i);
                }
                else if (rb23.isChecked()){
                    Intent i = new Intent(getApplicationContext(),EditText_TextWatcherExample.class);
                    startActivity(i);
                }*/
                else{
                    Toast.makeText(MainActivity.this, "nothing selected", Toast.LENGTH_SHORT).show();
                }


                }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                radioGroup.clearCheck();
                ratingBar.setRating(0.0f);
                spin.setAdapter(null);
                textView4.setText("");

                Toast.makeText(MainActivity.this, "everything cleared", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage(R.string.dialog_msg).setTitle(R.string.dialog_title);
                builder.setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                Toast.makeText(MainActivity.this, "you chose yes for the dialog", Toast.LENGTH_SHORT).show();
                            }
                        })
                        
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                Toast.makeText(MainActivity.this, "you chose no button", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(MainActivity.this, rating, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,country[position], Toast.LENGTH_SHORT).show();
        String a = country[position];
        textView4.setText("");
        textView4.append(a);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}