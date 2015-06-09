package com.aness.tsukubabus;

import android.app.Activity;

import android.app.ListActivity;
import android.content.Intent;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Switch;

import java.security.acl.Owner;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;


public class Home extends ListActivity {
    ListView Stations;
    Switch choice;
    Bustimetable_db db = new Bustimetable_db(this);


    Intent intent;

    public final static String EXTRA_MESSAGE_STATION = "param1";
    public final static String EXTRA_MESSAGE_DAYS = "param2";

    public Home() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Stations = getListView();
        choice = (Switch) findViewById(R.id.switch1);
        String msg_days;
        if (choice.isChecked()) msg_days = "1";
        else msg_days = "0";
        ArrayList<HashMap<String, String>> times_list =  db.get_nextbus(msg_days);
        ListAdapter adapter_list = new SimpleAdapter(Home.this,Prepare_stations_array(times_list),R.layout.style_main,new String[] {"information","station","icon"},new int[] {R.id.information,R.id.time,R.id.icon});



        Stations.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String msg_days;
                if (choice.isChecked()) msg_days = "1";
                else msg_days = "0";

                Intent intent = new Intent(getApplicationContext(), display_timetable.class);
                intent.putExtra(EXTRA_MESSAGE_STATION, Integer.toString(position + 1));
                intent.putExtra(EXTRA_MESSAGE_DAYS, msg_days);


                startActivity(intent);
            }
        });


        setListAdapter(adapter_list);

    }

    private ArrayList Prepare_stations_array(ArrayList<HashMap<String, String>> times_list) {
        ArrayList data = new ArrayList<Map<String, Object>>();
        Map<String, Object> item;

        item = new HashMap<String, Object>();
        item.put("station", "Tsukuba center");
        item.put("icon", Integer.toString(R.mipmap.center2));
        item.put("information", times_list.get(0).get("time"));
        data.add(item);
        item = new HashMap<String, Object>();
        item.put("station", "Hospital");
        item.put("icon", Integer.toString(R.mipmap.hospital));
        item.put("information", times_list.get(0).get("time"));
        data.add(item);
        item = new HashMap<String, Object>();
        item.put("station", "University Hall");
        item.put("icon", Integer.toString(R.mipmap.hall));
        item.put("information", times_list.get(2).get("time").toString());
        data.add(item);
        item = new HashMap<String, Object>();
        item.put("station", "Ichinoya");
        item.put("icon", Integer.toString(R.mipmap.ichinoya));
        item.put("information", times_list.get(3).get("time").toString());
        data.add(item);
        item = new HashMap<String, Object>();
        item.put("station", "Administration");
        item.put("icon", Integer.toString(R.mipmap.admin));
        item.put("information", times_list.get(4).get("time").toString());
        data.add(item);
        item = new HashMap<String, Object>();
        item.put("station", "Amakubo 2");
        item.put("icon", Integer.toString(R.mipmap.amakubo));
        item.put("information", times_list.get(5).get("time").toString());
        data.add(item);
        return data;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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

    public void getlist(View view){


        //Intent intent = new Intent(this, display_timetable.class);

        //startActivity(intent);


    }

    public void set_changes(View view){

        String msg_days;
        if (choice.isChecked()) msg_days = "1";
        else msg_days = "0";
        ArrayList<HashMap<String, String>> times_list =  db.get_nextbus(msg_days);
        ListAdapter adapter_list = new SimpleAdapter(Home.this,Prepare_stations_array(times_list),R.layout.style_main,new String[] {"information","station","icon"},new int[] {R.id.information,R.id.time,R.id.icon});
        Stations.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String msg_days;
                if (choice.isChecked()) msg_days = "1";
                else msg_days = "0";

                Intent intent = new Intent(getApplicationContext(), display_timetable.class);
                intent.putExtra(EXTRA_MESSAGE_STATION, Integer.toString(position + 1));
                intent.putExtra(EXTRA_MESSAGE_DAYS, msg_days);


                startActivity(intent);
            }
        });


        setListAdapter(adapter_list);


    }




}
