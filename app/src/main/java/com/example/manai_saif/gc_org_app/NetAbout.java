package com.example.manai_saif.gc_org_app;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NetAbout extends Activity implements View.OnClickListener {
    Button btn_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_about);
        btn_contact = (Button) findViewById(R.id.button_contact);
        btn_contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(this, NetContact.class);
        startActivity(myIntent);
    }
}
