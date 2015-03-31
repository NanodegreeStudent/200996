package com.example.manai_saif.gc_org_app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class TicActivity extends ActionBarActivity {
    ListView l ;
    String[] values = new String[] { "Insat Google Club","Insat Microsoft Club", "Insat Android Club","Sigcom", "Securinets", "Netlinks","Gamerhood"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic);
        l = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, values);
        l.setAdapter(adapter);

        l.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent newIntent = new Intent(TicActivity.this, IgcAbout.class);
                        startActivity(newIntent);
                        break;
                    case 1:
                        Intent newIntent1 = new Intent(TicActivity.this, ImcAbout.class);
                        startActivity(newIntent1);
                        break;
                    case 2:
                        Intent newIntent2 = new Intent(TicActivity.this, IacAbout.class);
                        startActivity(newIntent2);
                        break;
                    case 3:
                        Intent newIntent3 = new Intent(TicActivity.this, SigAbout.class);
                        startActivity(newIntent3);
                        break;
                    case 4:
                        Intent newIntent4 = new Intent(TicActivity.this, SecAbout.class);
                        startActivity(newIntent4);
                        break;
                    case 5:
                        Intent newIntent5 = new Intent(TicActivity.this, NetAbout.class);
                        startActivity(newIntent5);
                        break;
                    case 6:
                        Intent newIntent6 = new Intent(TicActivity.this, GhAbout.class);
                        startActivity(newIntent6);
                        break;
                }
            }
        });
    }
}