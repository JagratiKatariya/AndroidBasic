package com.example.admin.intentapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);


        Bundle Firstdata = getIntent().getExtras();

        if(Firstdata==null)
        {
        return;
        }
        String msg=Firstdata.getString("MyMsg");
        final TextView texttwo = (TextView) findViewById(R.id.Sectext);
        texttwo.setText(msg);
    }


}
