package com.studyjam.android.learnethnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        Bundle extra = getIntent().getExtras();
        if (extra != null && extra.containsKey("buttonID")) {
            int sourceID=extra.getInt("buttonID");
            TextView teachSaree=(TextView)findViewById(R.id.teachSaree);
            ImageView imageView=(ImageView)findViewById(R.id.bgimage);
            switch (sourceID){
                case R.id.marathi:
                    teachSaree.setText(getResources().getString(R.string.MarathiSteps));
                    imageView.setImageResource(R.drawable.marathibg);
                    break;
                case R.id.traditional:
                    teachSaree.setText(getResources().getString(R.string.traditionalSteps));
                    imageView.setImageResource(R.drawable.traditionalbg);
                    break;
                case R.id.bengali:
                    teachSaree.setText(getResources().getString(R.string.BengaliSteps));
                    imageView.setImageResource(R.drawable.bengalibg);
                    break;
                case R.id.gujarati:
                    teachSaree.setText(getResources().getString(R.string.GujaratiSteps));
                    imageView.setImageResource(R.drawable.gujaratibg);
                    break;
                case R.id.tamil:
                    teachSaree.setText(getResources().getString(R.string.TamilSteps));
                    imageView.setImageResource(R.drawable.tamilbg);
                    break;
            }

        }
    }
}