package com.example.android.vibcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText edittext, editcompany, editphone, editemail, editname, editposition;
    private String name, company, phone, mail, position;

    //intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addKeyListener();

        editname.setText("");
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editname.getText().toString()!="") {
                    Snackbar.make(view, "Congratulations. Your business card has been created!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else{
                    Snackbar.make(view, "Please fill at least your name.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
    }

    private void addKeyListener() {


        editcompany = (EditText) findViewById(R.id.editCompany);
        editemail = (EditText) findViewById(R.id.editEmail);
        editname = (EditText) findViewById(R.id.editName);
        editphone = (EditText) findViewById(R.id.editPhone);
        editposition = (EditText) findViewById(R.id.editPosition);
        editname.setText("");


        // Conversion might lose some information in here
        company = String.valueOf(editcompany.getText());
        name = String.valueOf(editname.getText());
        mail = String.valueOf(editemail.getText());
        phone = String.valueOf(editphone.getText());
        position = String.valueOf(editposition.getText());


/**
        edittext.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                // if the users pressed a button and that button was "0"
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_0)) {

                    // display the input text....
                    Toast.makeText(MainActivity.this,edittext.getText(), Toast.LENGTH_LONG).show();
                    return true;

                    // if the users pressed a button and that button was "9"
                } else if ((event.getAction() == KeyEvent.ACTION_DOWN) 	&& (keyCode == KeyEvent.KEYCODE_9)) {

                    // display message
                    Toast.makeText(MainActivity.this, "Number 9 is pressed!", Toast.LENGTH_LONG).show();
                    return true;
                }

                return false;
            }

**/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




}
