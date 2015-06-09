package com.aness.tsukubabus;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.ArrayList;




public class display_timetable extends ListActivity{



    ListView data_list;
    Bustimetable_db db = new Bustimetable_db(this);
    public display_timetable() {



    }

       /* ui_bus_listing.setOnItemClickListener(new OnItemClickListener(){  }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_timetable);

        // Get the message from the intent
        Intent intent = getIntent();
        String choosed_station = intent.getStringExtra(Home.EXTRA_MESSAGE_STATION);
        String choosed_days = intent.getStringExtra(Home.EXTRA_MESSAGE_DAYS);
        System.out.println("Received 1* "+choosed_station);
        System.out.println("Received 2* "+choosed_days);
        //data_list = (ListView) findViewById(R.id.list);
        data_list = getListView();
        ArrayList<HashMap<String, String>> times_list =  db.get_bustimes(choosed_station,choosed_days);
        if (times_list != null){
        ListAdapter adapter = new SimpleAdapter(display_timetable.this,times_list,R.layout.style_line,new String[]
                {"time","station","direction","stationm"},new int[] {R.id.time,R.id.station,R.id.information,R.id.icon});


        setListAdapter(adapter);}
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_timetable, menu);
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




}
