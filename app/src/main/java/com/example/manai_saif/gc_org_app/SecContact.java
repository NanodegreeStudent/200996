package com.example.manai_saif.gc_org_app;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecContact extends Activity implements View.OnClickListener {
    Button btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_contact);
        btn_about = (Button) findViewById(R.id.button_about);
        btn_about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(this, SecAbout.class);
        startActivity(myIntent);
    }
}
