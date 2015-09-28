package com.yahid.lightanalyzer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;

public class Activity_SelectMeasureType extends AppCompatActivity {

    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_measure_type);

        rg = (RadioGroup) this.findViewById(R.id.measureTypeRG);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_select_measure_type, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void nextBTN_clickHandler(View view) {
        Intent intent = new Intent();
        int selectedRB = rg.getCheckedRadioButtonId();
        switch(selectedRB)
        {
            case R.id.pointRBTN:
            case R.id.streetRBTN:
            default: {
                intent.setClass(this, Activity_SetRoadData.class);
                break;
            }
        }
        startActivity(intent);
    }
}
