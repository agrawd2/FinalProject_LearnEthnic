package com.studyjam.android.learnethnic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EthnicSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethnic_selection);
    }

    public void teach(View view) {
        Intent i = new Intent(getApplicationContext(), TemplateActivity.class);
        i.putExtra("buttonID", view.getId());
        startActivity(i);
    }
}
