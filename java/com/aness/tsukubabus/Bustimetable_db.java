package com.aness.tsukubabus;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


/**
 * Created by aness on 6/8/15.
 */
public class Bustimetable_db extends SQLiteOpenHelper {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String actual_time = sdf.format(new Date());
    int id=0;
    public static final String DATABASE_NAME = "bustimetable_2015.db";

    public static final String CONTACTS_COLUMN_TIME = "time";



    public Bustimetable_db(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }





    public boolean insert_a_line  (SQLiteDatabase db ,String time, Integer direction, Integer low, Integer holiday,Integer station)
    {

        ContentValues contentValues = new ContentValues();
        id++;
        contentValues.put("id", id);
        contentValues.put("time", time);
        contentValues.put("direction", direction);
        contentValues.put("low", low);
        contentValues.put("holiday", holiday);
        contentValues.put("station", station);
        db.insert("timetable", null, contentValues);
        //db.close();
        return true;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table timetable (id INTEGER primary key, time TEXT,direction INTEGER,low INTEGER,holiday INTEGER,station INTEGER)");

        //clockwise Bus on weekdays
        this.insert_a_line(db,"06:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"06:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"06:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"06:13:00", 0, 0, 0, 4);
        this.insert_a_line(db,"06:16:00", 0, 0, 0, 5);
        this.insert_a_line(db,"06:21:00", 0, 0, 0, 6);
        this.insert_a_line(db,"06:30:00", 0, 0, 0, 1);

        this.insert_a_line(db,"06:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"06:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"06:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"06:53:00", 0, 0, 0, 4);
        this.insert_a_line(db,"06:56:00", 0, 0, 0, 5);
        this.insert_a_line(db,"07:01:00", 0, 0, 0, 6);
        this.insert_a_line(db,"07:10:00", 0, 0, 0, 1);

        this.insert_a_line(db,"07:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"07:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"07:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"07:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"07:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"07:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"07:50:00", 0, 0, 0, 1);

        this.insert_a_line(db,"07:50:00", 0, 0, 0, 1);
        this.insert_a_line(db,"07:54:00", 0, 0, 0, 2);
        this.insert_a_line(db,"07:58:00", 0, 0, 0, 3);
        this.insert_a_line(db,"08:04:00", 0, 0, 0, 4);
        this.insert_a_line(db,"08:07:00", 0, 0, 0, 5);
        this.insert_a_line(db,"08:13:00", 0, 0, 0, 6);
        this.insert_a_line(db,"08:25:00", 0, 0, 0, 1);

        this.insert_a_line(db,"08:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"08:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"08:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"08:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"08:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"08:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"08:35:00", 0, 0, 0, 1);

        this.insert_a_line(db,"08:10:00", 0, 0, 0, 1);
        this.insert_a_line(db,"08:14:00", 0, 0, 0, 2);
        this.insert_a_line(db,"08:18:00", 0, 0, 0, 3);
        this.insert_a_line(db,"08:24:00", 0, 0, 0, 4);
        this.insert_a_line(db,"08:27:00", 0, 0, 0, 5);
        this.insert_a_line(db,"08:33:00", 0, 0, 0, 6);
        this.insert_a_line(db,"08:45:00", 0, 0, 0, 1);

        this.insert_a_line(db,"08:30:00", 0, 0, 0, 1);
        this.insert_a_line(db,"08:34:00", 0, 0, 0, 2);
        this.insert_a_line(db,"08:38:00", 0, 0, 0, 3);
        this.insert_a_line(db,"08:44:00", 0, 0, 0, 4);
        this.insert_a_line(db,"08:47:00", 0, 0, 0, 5);
        this.insert_a_line(db,"08:53:00", 0, 0, 0, 6);
        this.insert_a_line(db,"09:05:00", 0, 0, 0, 1);

        this.insert_a_line(db,"08:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"08:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"08:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"08:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"08:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"09:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"09:15:00", 0, 0, 0, 1);

        this.insert_a_line(db,"08:50:00", 0, 0, 0, 1);
        this.insert_a_line(db,"08:54:00", 0, 0, 0, 2);
        this.insert_a_line(db,"08:58:00", 0, 0, 0, 3);
        this.insert_a_line(db,"09:04:00", 0, 0, 0, 4);
        this.insert_a_line(db,"09:07:00", 0, 0, 0, 5);
        this.insert_a_line(db,"09:13:00", 0, 0, 0, 6);
        this.insert_a_line(db,"09:25:00", 0, 0, 0, 1);

        this.insert_a_line(db,"09:10:00", 0, 0, 0, 1);
        this.insert_a_line(db,"09:14:00", 0, 0, 0, 2);
        this.insert_a_line(db,"09:18:00", 0, 0, 0, 3);
        this.insert_a_line(db,"09:24:00", 0, 0, 0, 4);
        this.insert_a_line(db,"09:27:00", 0, 0, 0, 5);
        this.insert_a_line(db,"09:33:00", 0, 0, 0, 6);
        this.insert_a_line(db,"09:45:00", 0, 0, 0, 1);

        this.insert_a_line(db,"09:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"09:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"09:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"09:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"09:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"09:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"09:55:00", 0, 0, 0, 1);

        this.insert_a_line(db,"09:30:00", 0, 0, 0, 1);
        this.insert_a_line(db,"09:34:00", 0, 0, 0, 2);
        this.insert_a_line(db,"09:38:00", 0, 0, 0, 3);
        this.insert_a_line(db,"09:44:00", 0, 0, 0, 4);
        this.insert_a_line(db,"09:47:00", 0, 0, 0, 5);
        this.insert_a_line(db,"09:53:00", 0, 0, 0, 6);
        this.insert_a_line(db,"10:05:00", 0, 0, 0, 1);

        this.insert_a_line(db,"09:50:00", 0, 0, 0, 1);
        this.insert_a_line(db,"09:54:00", 0, 0, 0, 2);
        this.insert_a_line(db,"09:58:00", 0, 0, 0, 3);
        this.insert_a_line(db,"10:04:00", 0, 0, 0, 4);
        this.insert_a_line(db,"10:07:00", 0, 0, 0, 5);
        this.insert_a_line(db,"10:13:00", 0, 0, 0, 6);
        this.insert_a_line(db,"10:25:00", 0, 0, 0, 1);

        this.insert_a_line(db,"10:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"10:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"10:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"10:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"10:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"10:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"10:32:00", 0, 0, 0, 1);

        this.insert_a_line(db,"10:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"10:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"10:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"10:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"10:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"10:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"10:52:00", 0, 0, 0, 1);

        this.insert_a_line(db,"10:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"10:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"10:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"10:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"10:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"11:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"11:12:00", 0, 0, 0, 1);

        this.insert_a_line(db,"11:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"11:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"11:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"11:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"11:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"11:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"11:32:00", 0, 0, 0, 1);

        this.insert_a_line(db,"11:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"11:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"11:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"11:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"11:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"11:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"11:52:00", 0, 0, 0, 1);

        this.insert_a_line(db,"11:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"11:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"11:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"11:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"11:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"12:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"12:12:00", 0, 0, 0, 1);

        this.insert_a_line(db,"12:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"12:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"12:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"12:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"12:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"12:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"12:32:00", 0, 0, 0, 1);

        this.insert_a_line(db,"12:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"12:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"12:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"12:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"12:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"12:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"12:52:00", 0, 0, 0, 1);

        this.insert_a_line(db,"12:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"12:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"12:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"12:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"12:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"13:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"13:12:00", 0, 0, 0, 1);

        this.insert_a_line(db,"13:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"13:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"13:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"13:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"13:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"13:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"13:32:00", 0, 0, 0, 1);

        this.insert_a_line(db,"13:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"13:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"13:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"13:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"13:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"13:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"13:52:00", 0, 0, 0, 1);

        this.insert_a_line(db,"13:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"13:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"13:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"13:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"13:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"14:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"14:12:00", 0, 0, 0, 1);

        this.insert_a_line(db,"14:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"14:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"14:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"14:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"14:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"14:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"14:32:00", 0, 0, 0, 1);


        this.insert_a_line(db,"14:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"14:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"14:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"14:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"14:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"14:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"14:52:00", 0, 0, 0, 1);

        this.insert_a_line(db,"14:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"14:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"14:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"14:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"14:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"15:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"15:12:00", 0, 0, 0, 1);

        this.insert_a_line(db,"15:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"15:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"15:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"15:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"15:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"15:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"15:33:00", 0, 0, 0, 1);

        this.insert_a_line(db,"15:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"15:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"15:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"15:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"15:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"15:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"15:53:00", 0, 0, 0, 1);

        this.insert_a_line(db,"15:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"15:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"15:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"15:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"15:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"16:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"16:13:00", 0, 0, 0, 1);

        this.insert_a_line(db,"16:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"16:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"16:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"16:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"16:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"16:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"16:35:00", 0, 0, 0, 1);

        this.insert_a_line(db,"16:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"16:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"16:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"16:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"16:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"16:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"16:55:00", 0, 0, 0, 1);

        this.insert_a_line(db,"16:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"16:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"16:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"16:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"16:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"17:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"17:15:00", 0, 0, 0, 1);

        this.insert_a_line(db,"17:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"17:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"17:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"17:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"17:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"17:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"17:35:00", 0, 0, 0, 1);

        this.insert_a_line(db,"17:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"17:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"17:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"17:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"17:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"17:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"17:55:00", 0, 0, 0, 1);

        this.insert_a_line(db,"17:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"17:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"17:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"17:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"17:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"18:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"18:15:00", 0, 0, 0, 1);

        this.insert_a_line(db,"18:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"18:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"18:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"18:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"18:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"18:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"18:35:00", 0, 0, 0, 1);

        this.insert_a_line(db,"18:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"18:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"18:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"18:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"18:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"18:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"18:55:00", 0, 0, 0, 1);

        this.insert_a_line(db,"18:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"18:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"18:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"18:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"18:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"19:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"19:15:00", 0, 0, 0, 1);

        this.insert_a_line(db,"19:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"19:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"19:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"19:14:00", 0, 0, 0, 4);
        this.insert_a_line(db,"19:17:00", 0, 0, 0, 5);
        this.insert_a_line(db,"19:23:00", 0, 0, 0, 6);
        this.insert_a_line(db,"19:35:00", 0, 0, 0, 1);

        this.insert_a_line(db,"19:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"19:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"19:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"19:34:00", 0, 0, 0, 4);
        this.insert_a_line(db,"19:37:00", 0, 0, 0, 5);
        this.insert_a_line(db,"19:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"19:53:00", 0, 0, 0, 1);

        this.insert_a_line(db,"19:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"19:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"19:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"19:54:00", 0, 0, 0, 4);
        this.insert_a_line(db,"19:57:00", 0, 0, 0, 5);
        this.insert_a_line(db,"20:03:00", 0, 0, 0, 6);
        this.insert_a_line(db,"20:13:00", 0, 0, 0, 1);

        this.insert_a_line(db,"20:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"20:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"20:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"20:13:00", 0, 0, 0, 4);
        this.insert_a_line(db,"20:16:00", 0, 0, 0, 5);
        this.insert_a_line(db,"20:21:00", 0, 0, 0, 6);
        this.insert_a_line(db,"20:30:00", 0, 0, 0, 1);

        this.insert_a_line(db,"20:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"20:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"20:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"20:33:00", 0, 0, 0, 4);
        this.insert_a_line(db,"20:36:00", 0, 0, 0, 5);
        this.insert_a_line(db,"20:43:00", 0, 0, 0, 6);
        this.insert_a_line(db,"20:50:00", 0, 0, 0, 1);

        this.insert_a_line(db,"20:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"20:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"20:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"20:53:00", 0, 0, 0, 4);
        this.insert_a_line(db,"20:56:00", 0, 0, 0, 5);
        this.insert_a_line(db,"21:01:00", 0, 0, 0, 6);
        this.insert_a_line(db,"20:10:00", 0, 0, 0, 1);

        this.insert_a_line(db,"21:00:00", 0, 0, 0, 1);
        this.insert_a_line(db,"21:04:00", 0, 0, 0, 2);
        this.insert_a_line(db,"21:08:00", 0, 0, 0, 3);
        this.insert_a_line(db,"21:13:00", 0, 0, 0, 4);
        this.insert_a_line(db,"21:16:00", 0, 0, 0, 5);
        this.insert_a_line(db,"21:21:00", 0, 0, 0, 6);
        this.insert_a_line(db,"21:30:00", 0, 0, 0, 1);

        this.insert_a_line(db,"21:40:00", 0, 0, 0, 1);
        this.insert_a_line(db,"21:44:00", 0, 0, 0, 2);
        this.insert_a_line(db,"21:48:00", 0, 0, 0, 3);
        this.insert_a_line(db,"21:53:00", 0, 0, 0, 4);
        this.insert_a_line(db,"21:56:00", 0, 0, 0, 5);
        this.insert_a_line(db,"22:01:00", 0, 0, 0, 6);
        this.insert_a_line(db,"22:10:00", 0, 0, 0, 1);

        this.insert_a_line(db,"22:20:00", 0, 0, 0, 1);
        this.insert_a_line(db,"22:24:00", 0, 0, 0, 2);
        this.insert_a_line(db,"22:28:00", 0, 0, 0, 3);
        this.insert_a_line(db,"22:33:00", 0, 0, 0, 4);
        this.insert_a_line(db,"22:36:00", 0, 0, 0, 5);
        this.insert_a_line(db,"22:41:00", 0, 0, 0, 6);
        this.insert_a_line(db,"22:50:00", 0, 0, 0, 1);


// For the clockwise Bus on holidays
        this.insert_a_line(db,"6:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"6:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"6:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"6:13:00", 0, 0, 1, 4);
        this.insert_a_line(db,"6:16:00", 0, 0, 1, 5);
        this.insert_a_line(db,"6:23:00", 0, 0, 1, 6);
        this.insert_a_line(db,"6:30:00", 0, 0, 1, 1);

        this.insert_a_line(db,"6:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"6:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"6:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"6:53:00", 0, 0, 1, 4);
        this.insert_a_line(db,"6:56:00", 0, 0, 1, 5);
        this.insert_a_line(db,"7:03:00", 0, 0, 1, 6);
        this.insert_a_line(db,"7:10:00", 0, 0, 1, 1);

        this.insert_a_line(db,"7:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"7:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"7:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"7:33:00", 0, 0, 1, 4);
        this.insert_a_line(db,"7:36:00", 0, 0, 1, 5);
        this.insert_a_line(db,"7:43:00", 0, 0, 1, 6);
        this.insert_a_line(db,"7:50:00", 0, 0, 1, 1);

        this.insert_a_line(db,"8:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"8:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"8:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"8:14:00", 0, 0, 1, 4);
        this.insert_a_line(db,"8:17:00", 0, 0, 1, 5);
        this.insert_a_line(db,"8:25:00", 0, 0, 1, 6);
        this.insert_a_line(db,"8:32:00", 0, 0, 1, 1);

        this.insert_a_line(db,"8:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"8:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"8:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"8:54:00", 0, 0, 1, 4);
        this.insert_a_line(db,"8:57:00", 0, 0, 1, 5);
        this.insert_a_line(db,"9:05:00", 0, 0, 1, 6);
        this.insert_a_line(db,"9:12:00", 0, 0, 1, 1);

        this.insert_a_line(db,"9:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"9:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"9:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"9:34:00", 0, 0, 1, 4);
        this.insert_a_line(db,"9:37:00", 0, 0, 1, 5);
        this.insert_a_line(db,"9:45:00", 0, 0, 1, 6);
        this.insert_a_line(db,"9:52:00", 0, 0, 1, 1);

        this.insert_a_line(db,"10:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"10:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"10:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"10:14:00", 0, 0, 1, 4);
        this.insert_a_line(db,"10:17:00", 0, 0, 1, 5);
        this.insert_a_line(db,"10:25:00", 0, 0, 1, 6);
        this.insert_a_line(db,"10:32:00", 0, 0, 1, 1);

        this.insert_a_line(db,"10:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"10:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"10:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"10:54:00", 0, 0, 1, 4);
        this.insert_a_line(db,"10:57:00", 0, 0, 1, 5);
        this.insert_a_line(db,"11:05:00", 0, 0, 1, 6);
        this.insert_a_line(db,"11:12:00", 0, 0, 1, 1);

        this.insert_a_line(db,"11:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"11:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"11:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"11:34:00", 0, 0, 1, 4);
        this.insert_a_line(db,"11:37:00", 0, 0, 1, 5);
        this.insert_a_line(db,"11:45:00", 0, 0, 1, 6);
        this.insert_a_line(db,"11:52:00", 0, 0, 1, 1);

        this.insert_a_line(db,"12:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"12:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"12:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"12:14:00", 0, 0, 1, 4);
        this.insert_a_line(db,"12:17:00", 0, 0, 1, 5);
        this.insert_a_line(db,"12:25:00", 0, 0, 1, 6);
        this.insert_a_line(db,"12:32:00", 0, 0, 1, 1);

        this.insert_a_line(db,"12:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"12:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"12:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"12:54:00", 0, 0, 1, 4);
        this.insert_a_line(db,"12:57:00", 0, 0, 1, 5);
        this.insert_a_line(db,"13:05:00", 0, 0, 1, 6);
        this.insert_a_line(db,"13:12:00", 0, 0, 1, 1);

        this.insert_a_line(db,"13:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"13:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"13:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"13:34:00", 0, 0, 1, 4);
        this.insert_a_line(db,"13:37:00", 0, 0, 1, 5);
        this.insert_a_line(db,"13:45:00", 0, 0, 1, 6);
        this.insert_a_line(db,"13:52:00", 0, 0, 1, 1);

        this.insert_a_line(db,"14:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"14:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"14:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"14:14:00", 0, 0, 1, 4);
        this.insert_a_line(db,"14:17:00", 0, 0, 1, 5);
        this.insert_a_line(db,"14:25:00", 0, 0, 1, 6);
        this.insert_a_line(db,"14:33:00", 0, 0, 1, 1);

        this.insert_a_line(db,"14:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"14:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"14:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"14:54:00", 0, 0, 1, 4);
        this.insert_a_line(db,"14:57:00", 0, 0, 1, 5);
        this.insert_a_line(db,"15:05:00", 0, 0, 1, 6);
        this.insert_a_line(db,"15:13:00", 0, 0, 1, 1);

        this.insert_a_line(db,"15:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"15:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"15:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"15:34:00", 0, 0, 1, 4);
        this.insert_a_line(db,"15:37:00", 0, 0, 1, 5);
        this.insert_a_line(db,"15:45:00", 0, 0, 1, 6);
        this.insert_a_line(db,"15:53:00", 0, 0, 1, 1);

        this.insert_a_line(db,"16:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"16:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"16:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"16:14:00", 0, 0, 1, 4);
        this.insert_a_line(db,"16:17:00", 0, 0, 1, 5);
        this.insert_a_line(db,"16:25:00", 0, 0, 1, 6);
        this.insert_a_line(db,"16:35:00", 0, 0, 1, 1);

        this.insert_a_line(db,"16:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"16:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"16:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"16:54:00", 0, 0, 1, 4);
        this.insert_a_line(db,"16:57:00", 0, 0, 1, 5);
        this.insert_a_line(db,"17:05:00", 0, 0, 1, 6);
        this.insert_a_line(db,"17:15:00", 0, 0, 1, 1);

        this.insert_a_line(db,"17:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"17:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"17:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"17:34:00", 0, 0, 1, 4);
        this.insert_a_line(db,"17:37:00", 0, 0, 1, 5);
        this.insert_a_line(db,"17:45:00", 0, 0, 1, 6);
        this.insert_a_line(db,"17:55:00", 0, 0, 1, 1);

        this.insert_a_line(db,"18:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"18:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"18:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"18:14:00", 0, 0, 1, 4);
        this.insert_a_line(db,"18:17:00", 0, 0, 1, 5);
        this.insert_a_line(db,"18:25:00", 0, 0, 1, 6);
        this.insert_a_line(db,"18:35:00", 0, 0, 1, 1);

        this.insert_a_line(db,"18:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"18:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"18:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"18:54:00", 0, 0, 1, 4);
        this.insert_a_line(db,"18:57:00", 0, 0, 1, 5);
        this.insert_a_line(db,"19:05:00", 0, 0, 1, 6);
        this.insert_a_line(db,"19:15:00", 0, 0, 1, 1);

        this.insert_a_line(db,"19:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"19:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"19:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"19:34:00", 0, 0, 1, 4);
        this.insert_a_line(db,"19:37:00", 0, 0, 1, 5);
        this.insert_a_line(db,"19:45:00", 0, 0, 1, 6);
        this.insert_a_line(db,"19:52:00", 0, 0, 1, 1);

        this.insert_a_line(db,"20:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"20:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"20:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"20:13:00", 0, 0, 1, 4);
        this.insert_a_line(db,"20:16:00", 0, 0, 1, 5);
        this.insert_a_line(db,"20:23:00", 0, 0, 1, 6);
        this.insert_a_line(db,"20:30:00", 0, 0, 1, 1);

        this.insert_a_line(db,"20:40:00", 0, 0, 1, 1);
        this.insert_a_line(db,"20:44:00", 0, 0, 1, 2);
        this.insert_a_line(db,"20:47:00", 0, 0, 1, 3);
        this.insert_a_line(db,"20:53:00", 0, 0, 1, 4);
        this.insert_a_line(db,"20:56:00", 0, 0, 1, 5);
        this.insert_a_line(db,"21:03:00", 0, 0, 1, 6);
        this.insert_a_line(db,"21:10:00", 0, 0, 1, 1);

        this.insert_a_line(db,"21:20:00", 0, 0, 1, 1);
        this.insert_a_line(db,"21:24:00", 0, 0, 1, 2);
        this.insert_a_line(db,"21:27:00", 0, 0, 1, 3);
        this.insert_a_line(db,"21:33:00", 0, 0, 1, 4);
        this.insert_a_line(db,"21:36:00", 0, 0, 1, 5);
        this.insert_a_line(db,"21:43:00", 0, 0, 1, 6);
        this.insert_a_line(db,"21:50:00", 0, 0, 1, 1);

        this.insert_a_line(db,"22:00:00", 0, 0, 1, 1);
        this.insert_a_line(db,"22:04:00", 0, 0, 1, 2);
        this.insert_a_line(db,"22:07:00", 0, 0, 1, 3);
        this.insert_a_line(db,"22:13:00", 0, 0, 1, 4);
        this.insert_a_line(db,"22:16:00", 0, 0, 1, 5);
        this.insert_a_line(db,"22:23:00", 0, 0, 1, 6);
        this.insert_a_line(db,"22:30:00", 0, 0, 1, 1);

        this.insert_a_line(db,"22:35:00", 0, 0, 1, 1);
        this.insert_a_line(db,"22:39:00", 0, 0, 1, 2);
        this.insert_a_line(db,"22:42:00", 0, 0, 1, 3);
        this.insert_a_line(db,"22:48:00", 0, 0, 1, 4);
        this.insert_a_line(db,"22:51:00", 0, 0, 1, 5);
        this.insert_a_line(db,"22:58:00", 0, 0, 1, 6);
        this.insert_a_line(db,"23:05:00", 0, 0, 1, 1);

//counter clockwise on holidays
        this.insert_a_line(db,"6:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"6:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"6:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"6:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"6:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"6:44:00", 1, 0, 1, 6);
        this.insert_a_line(db,"6:50:00", 1, 0, 1, 1);


        this.insert_a_line(db,"7:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"7:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"7:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"7:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"7:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"7:24:00", 1, 0, 1, 6);
        this.insert_a_line(db,"7:30:00", 1, 0, 1, 1);

        this.insert_a_line(db,"8:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"8:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"8:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"8:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"8:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"8:45:00", 1, 0, 1, 6);
        this.insert_a_line(db,"8:52:00", 1, 0, 1, 1);

        this.insert_a_line(db,"9:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"9:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"9:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"9:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"9:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"9:25:00", 1, 0, 1, 6);
        this.insert_a_line(db,"9:32:00", 1, 0, 1, 1);

        this.insert_a_line(db,"9:40:00", 1, 0, 1, 1);
        this.insert_a_line(db,"9:46:00", 1, 0, 1, 2);
        this.insert_a_line(db,"9:52:00", 1, 0, 1, 3);
        this.insert_a_line(db,"9:55:00", 1, 0, 1, 4);
        this.insert_a_line(db,"10:00:00", 1, 0, 1,5 );
        this.insert_a_line(db,"10:05:00", 1, 0, 1, 6);
        this.insert_a_line(db,"10:12:00", 1, 0, 1, 1);

        this.insert_a_line(db,"10:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"10:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"10:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"10:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"10:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"10:45:00", 1, 0, 1, 6);
        this.insert_a_line(db,"10:52:00", 1, 0, 1, 1);

        this.insert_a_line(db,"11:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"11:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"11:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"11:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"11:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"11:25:00", 1, 0, 1, 6);
        this.insert_a_line(db,"11:32:00", 1, 0, 1, 1);

        this.insert_a_line(db,"11:40:00", 1, 0, 1, 1);
        this.insert_a_line(db,"11:46:00", 1, 0, 1, 2);
        this.insert_a_line(db,"11:52:00", 1, 0, 1, 3);
        this.insert_a_line(db,"11:55:00", 1, 0, 1, 4);
        this.insert_a_line(db,"12:00:00", 1, 0, 1, 5);
        this.insert_a_line(db,"12:05:00", 1, 0, 1, 6);
        this.insert_a_line(db,"12:12:00", 1, 0, 1, 1);

        this.insert_a_line(db,"12:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"12:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"12:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"12:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"12:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"12:45:00", 1, 0, 1, 6);
        this.insert_a_line(db,"12:52:00", 1, 0, 1, 1);

        this.insert_a_line(db,"13:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"13:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"13:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"13:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"13:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"13:25:00", 1, 0, 1, 6);
        this.insert_a_line(db,"13:32:00", 1, 0, 1, 1);

        this.insert_a_line(db,"13:40:00", 1, 0, 1, 1);
        this.insert_a_line(db,"13:46:00", 1, 0, 1, 2);
        this.insert_a_line(db,"13:52:00", 1, 0, 1, 3);
        this.insert_a_line(db,"13:55:00", 1, 0, 1, 4);
        this.insert_a_line(db,"14:00:00", 1, 0, 1, 5);
        this.insert_a_line(db,"14:05:00", 1, 0, 1, 6);
        this.insert_a_line(db,"14:12:00", 1, 0, 1, 1);

        this.insert_a_line(db,"14:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"14:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"14:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"14:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"14:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"14:45:00", 1, 0, 1, 6);
        this.insert_a_line(db,"14:53:00", 1, 0, 1, 1);

        this.insert_a_line(db,"15:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"15:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"15:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"15:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"15:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"15:25:00", 1, 0, 1, 6);
        this.insert_a_line(db,"15:33:00", 1, 0, 1, 1);

        this.insert_a_line(db,"15:40:00", 1, 0, 1, 1);
        this.insert_a_line(db,"15:46:00", 1, 0, 1, 2);
        this.insert_a_line(db,"15:52:00", 1, 0, 1, 3);
        this.insert_a_line(db,"15:55:00", 1, 0, 1, 4);
        this.insert_a_line(db,"16:00:00", 1, 0, 1, 5);
        this.insert_a_line(db,"16:05:00", 1, 0, 1, 6);
        this.insert_a_line(db,"16:13:00", 1, 0, 1, 1);

        this.insert_a_line(db,"16:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"16:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"16:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"16:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"16:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"16:45:00", 1, 0, 1, 6);
        this.insert_a_line(db,"16:55:00", 1, 0, 1, 1);

        this.insert_a_line(db,"17:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"17:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"17:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"17:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"17:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"17:25:00", 1, 0, 1, 6);
        this.insert_a_line(db,"17:35:00", 1, 0, 1, 1);


        this.insert_a_line(db,"17:40:00", 1, 0, 1, 1);
        this.insert_a_line(db,"17:46:00", 1, 0, 1, 2);
        this.insert_a_line(db,"17:52:00", 1, 0, 1, 3);
        this.insert_a_line(db,"17:55:00", 1, 0, 1, 4);
        this.insert_a_line(db,"18:00:00", 1, 0, 1, 5);
        this.insert_a_line(db,"18:05:00", 1, 0, 1, 6);
        this.insert_a_line(db,"18:15:00", 1, 0, 1, 1);

        this.insert_a_line(db,"18:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"18:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"18:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"18:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"18:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"18:45:00", 1, 0, 1, 6);
        this.insert_a_line(db,"18:55:00", 1, 0, 1, 1);

        this.insert_a_line(db,"19:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"19:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"19:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"19:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"19:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"19:25:00", 1, 0, 1, 6);
        this.insert_a_line(db,"19:35:00", 1, 0, 1, 1);

        this.insert_a_line(db,"19:40:00", 1, 0, 1, 1);
        this.insert_a_line(db,"19:46:00", 1, 0, 1, 2);
        this.insert_a_line(db,"19:52:00", 1, 0, 1, 3);
        this.insert_a_line(db,"19:55:00", 1, 0, 1, 4);
        this.insert_a_line(db,"20:00:00", 1, 0, 1, 5);
        this.insert_a_line(db,"20:05:00", 1, 0, 1, 6);
        this.insert_a_line(db,"20:12:00", 1, 0, 1, 1);

        this.insert_a_line(db,"20:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"20:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"20:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"20:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"20:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"20:44:00", 1, 0, 1, 6);
        this.insert_a_line(db,"20:50:00", 1, 0, 1, 1);


        this.insert_a_line(db,"21:00:00", 1, 0, 1, 1);
        this.insert_a_line(db,"21:06:00", 1, 0, 1, 2);
        this.insert_a_line(db,"21:12:00", 1, 0, 1, 3);
        this.insert_a_line(db,"21:15:00", 1, 0, 1, 4);
        this.insert_a_line(db,"21:20:00", 1, 0, 1, 5);
        this.insert_a_line(db,"21:24:00", 1, 0, 1, 6);
        this.insert_a_line(db,"21:30:00", 1, 0, 1, 1);

        this.insert_a_line(db,"21:40:00", 1, 0, 1, 1);
        this.insert_a_line(db,"21:46:00", 1, 0, 1, 2);
        this.insert_a_line(db,"21:52:00", 1, 0, 1, 3);
        this.insert_a_line(db,"21:55:00", 1, 0, 1, 4);
        this.insert_a_line(db,"22:00:00", 1, 0, 1, 5);
        this.insert_a_line(db,"22:24:00", 1, 0, 1, 6);
        this.insert_a_line(db,"22:10:00", 1, 0, 1, 1);

        this.insert_a_line(db,"22:20:00", 1, 0, 1, 1);
        this.insert_a_line(db,"22:26:00", 1, 0, 1, 2);
        this.insert_a_line(db,"22:32:00", 1, 0, 1, 3);
        this.insert_a_line(db,"22:35:00", 1, 0, 1, 4);
        this.insert_a_line(db,"22:40:00", 1, 0, 1, 5);
        this.insert_a_line(db,"22:44:00", 1, 0, 1, 6);
        this.insert_a_line(db,"22:50:00", 1, 0, 1, 1);

        //counterclockwise  on weekdays

        this.insert_a_line(db,"6:20:00", 1, 0, 0, 1);
        this.insert_a_line(db,"6:26:00", 1, 0, 0, 2);
        this.insert_a_line(db,"6:32:00", 1, 0, 0, 3);
        this.insert_a_line(db,"6:35:00", 1, 0, 0, 4);
        this.insert_a_line(db,"6:40:00", 1, 0, 0, 5);
        this.insert_a_line(db,"6:44:00", 1, 0, 0, 6);
        this.insert_a_line(db,"6:50:00", 1, 0, 0, 1);

        this.insert_a_line(db,"7:00:00", 1, 0, 0, 1);
        this.insert_a_line(db,"7:06:00", 1, 0, 0, 2);
        this.insert_a_line(db,"7:12:00", 1, 0, 0, 3);
        this.insert_a_line(db,"7:15:00", 1, 0, 0, 4);
        this.insert_a_line(db,"7:21:00", 1, 0, 0, 5);
        this.insert_a_line(db,"7:24:00", 1, 0, 0, 6);
        this.insert_a_line(db,"7:32:00", 1, 0, 0, 1);

        this.insert_a_line(db,"7:40:00", 1, 0, 0, 1);
        this.insert_a_line(db,"7:46:00", 1, 0, 0, 2);
        this.insert_a_line(db,"7:52:00", 1, 0, 0, 3);
        this.insert_a_line(db,"7:55:00", 1, 0, 0, 4);
        this.insert_a_line(db,"8:01:00", 1, 0, 0, 5);
        this.insert_a_line(db,"8:04:00", 1, 0, 0, 6);
        this.insert_a_line(db,"8:15:00", 1, 0, 0, 1);

        this.insert_a_line(db,"7:40:00", 1, 0, 0, 1);
        this.insert_a_line(db,"7:46:00", 1, 0, 0, 2);
        this.insert_a_line(db,"7:52:00", 1, 0, 0, 3);
        this.insert_a_line(db,"7:55:00", 1, 0, 0, 4);
        this.insert_a_line(db,"8:00:00", 1, 0, 0, 5);
        this.insert_a_line(db,"8:04:00", 1, 0, 0, 6);
        this.insert_a_line(db,"8:10:00", 1, 0, 0, 1);

        this.insert_a_line(db,"8:20:00", 1, 0, 0, 1);
        this.insert_a_line(db,"8:26:00", 1, 0, 0, 2);
        this.insert_a_line(db,"8:32:00", 1, 0, 0, 3);
        this.insert_a_line(db,"8:35:00", 1, 0, 0, 4);
        this.insert_a_line(db,"8:41:00", 1, 0, 0, 5);
        this.insert_a_line(db,"8:45:00", 1, 0, 0, 6);
        this.insert_a_line(db,"8:55:00", 1, 0, 0, 1);

        this.insert_a_line(db,"9:00:00", 1, 0, 0, 1);
        this.insert_a_line(db,"9:06:00", 1, 0, 0, 2);
        this.insert_a_line(db,"9:12:00", 1, 0, 0, 3);
        this.insert_a_line(db,"9:15:00", 1, 0, 0, 4);
        this.insert_a_line(db,"9:21:00", 1, 0, 0, 5);
        this.insert_a_line(db,"9:25:00", 1, 0, 0, 6);
        this.insert_a_line(db,"9:35:00", 1, 0, 0, 1);

        this.insert_a_line(db,"9:40:00", 1, 0, 0, 1);
        this.insert_a_line(db,"9:46:00", 1, 0, 0, 2);
        this.insert_a_line(db,"9:52:00", 1, 0, 0, 3);
        this.insert_a_line(db,"9:55:00", 1, 0, 0, 4);
        this.insert_a_line(db,"10:01:00", 1, 0, 0,5 );
        this.insert_a_line(db,"10:05:00", 1, 0, 0, 6);
        this.insert_a_line(db,"10:15:00", 1, 0, 0, 1);

        this.insert_a_line(db,"10:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"10:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"10:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"10:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"20:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"10:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"10:42:00", 1, 0, 0, 1);

        this.insert_a_line(db,"10:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"10:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"10:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"10:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"10:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"10:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"11:02:00", 1, 0, 0, 1);

        this.insert_a_line(db,"10:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"10:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"11:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"11:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"11:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"11:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"11:22:00", 1, 0, 0, 1);

        this.insert_a_line(db,"11:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"11:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"11:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"11:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"11:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"11:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"11:42:00", 1, 0, 0, 1);

        this.insert_a_line(db,"11:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"11:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"11:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"11:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"11:01:00", 1, 0, 0, 5);
        this.insert_a_line(db,"11:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"12:02:00", 1, 0, 0, 1);

        this.insert_a_line(db,"11:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"11:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"12:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"12:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"12:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"11:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"12:22:00", 1, 0, 0, 1);

        this.insert_a_line(db,"12:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"12:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"12:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"12:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"12:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"12:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"12:42:00", 1, 0, 0, 1);

        this.insert_a_line(db,"12:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"12:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"12:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"12:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"12:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"12:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"13:02:00", 1, 0, 0, 1);

        this.insert_a_line(db,"12:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"12:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"13:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"13:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"13:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"13:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"13:22:00", 1, 0, 0, 1);

        this.insert_a_line(db,"13:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"13:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"13:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"13:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"13:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"13:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"13:42:00", 1, 0, 0, 1);

        this.insert_a_line(db,"13:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"13:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"13:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"13:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"13:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"13:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"14:02:00", 1, 0, 0, 1);

        this.insert_a_line(db,"13:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"13:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"14:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"14:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"14:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"14:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"14:22:00", 1, 0, 0, 1);

        this.insert_a_line(db,"14:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"14:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"14:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"14:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"14:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"14:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"14:42:00", 1, 0, 0, 1);

        this.insert_a_line(db,"14:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"14:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"14:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"14:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"14:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"14:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"15:02:00", 1, 0, 0, 1);

        this.insert_a_line(db,"14:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"14:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"15:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"15:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"15:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"15:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"15:22:00", 1, 0, 0, 1);

        this.insert_a_line(db,"15:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"15:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"15:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"15:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"15:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"15:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"15:43:00", 1, 0, 0, 1);

        this.insert_a_line(db,"15:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"15:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"15:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"15:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"15:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"15:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"16:03:00", 1, 0, 0, 1);

        this.insert_a_line(db,"15:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"15:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"16:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"16:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"16:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"16:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"16:23:00", 1, 0, 0, 1);

        this.insert_a_line(db,"16:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"16:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"16:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"16:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"16:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"16:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"16:45:00", 1, 0, 0, 1);

        this.insert_a_line(db,"16:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"16:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"16:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"16:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"16:01:00", 1, 0, 0, 5);
        this.insert_a_line(db,"16:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"17:05:00", 1, 0, 0, 1);

        this.insert_a_line(db,"16:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"16:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"17:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"17:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"17:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"17:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"17:25:00", 1, 0, 0, 1);

        this.insert_a_line(db,"17:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"17:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"17:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"17:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"17:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"17:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"17:45:00", 1, 0, 0, 1);

        this.insert_a_line(db,"17:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"17:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"17:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"17:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"17:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"17:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"18:05:00", 1, 0, 0, 1);

        this.insert_a_line(db,"17:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"17:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"18:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"18:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"18:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"18:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"18:25:00", 1, 0, 0, 1);

        this.insert_a_line(db,"18:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"18:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"18:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"18:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"18:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"18:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"18:45:00", 1, 0, 0, 1);

        this.insert_a_line(db,"18:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"18:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"18:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"18:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"18:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"18:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"19:05:00", 1, 0, 0, 1);

        this.insert_a_line(db,"18:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"18:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"19:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"19:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"19:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"19:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"19:25:00", 1, 0, 0, 1);

        this.insert_a_line(db,"19:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"19:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"19:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"19:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"19:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"19:35:00", 1, 0, 0, 6);
        this.insert_a_line(db,"19:43:00", 1, 0, 0, 1);

        this.insert_a_line(db,"19:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"19:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"19:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"19:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"19:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"19:55:00", 1, 0, 0, 6);
        this.insert_a_line(db,"20:03:00", 1, 0, 0, 1);

        this.insert_a_line(db,"19:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"19:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"20:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"20:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"20:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"20:15:00", 1, 0, 0, 6);
        this.insert_a_line(db,"20:23:00", 1, 0, 0, 1);

        this.insert_a_line(db,"20:10:00", 1, 0, 0, 1);
        this.insert_a_line(db,"20:16:00", 1, 0, 0, 2);
        this.insert_a_line(db,"20:22:00", 1, 0, 0, 3);
        this.insert_a_line(db,"20:25:00", 1, 0, 0, 4);
        this.insert_a_line(db,"20:31:00", 1, 0, 0, 5);
        this.insert_a_line(db,"20:34:00", 1, 0, 0, 6);
        this.insert_a_line(db,"20:40:00", 1, 0, 0, 1);

        this.insert_a_line(db,"20:30:00", 1, 0, 0, 1);
        this.insert_a_line(db,"20:36:00", 1, 0, 0, 2);
        this.insert_a_line(db,"20:42:00", 1, 0, 0, 3);
        this.insert_a_line(db,"20:45:00", 1, 0, 0, 4);
        this.insert_a_line(db,"20:51:00", 1, 0, 0, 5);
        this.insert_a_line(db,"20:54:00", 1, 0, 0, 6);
        this.insert_a_line(db,"21:00:00", 1, 0, 0, 1);

        this.insert_a_line(db,"20:50:00", 1, 0, 0, 1);
        this.insert_a_line(db,"20:56:00", 1, 0, 0, 2);
        this.insert_a_line(db,"21:02:00", 1, 0, 0, 3);
        this.insert_a_line(db,"21:05:00", 1, 0, 0, 4);
        this.insert_a_line(db,"21:11:00", 1, 0, 0, 5);
        this.insert_a_line(db,"21:14:00", 1, 0, 0, 6);
        this.insert_a_line(db,"21:20:00", 1, 0, 0, 1);

        this.insert_a_line(db,"21:20:00", 1, 0, 0, 1);
        this.insert_a_line(db,"21:26:00", 1, 0, 0, 2);
        this.insert_a_line(db,"21:32:00", 1, 0, 0, 3);
        this.insert_a_line(db,"21:35:00", 1, 0, 0, 4);
        this.insert_a_line(db,"21:41:00", 1, 0, 0, 5);
        this.insert_a_line(db,"21:44:00", 1, 0, 0, 6);
        this.insert_a_line(db,"21:50:00", 1, 0, 0, 1);

        this.insert_a_line(db,"22:00:00", 1, 0, 0, 1);
        this.insert_a_line(db,"22:06:00", 1, 0, 0, 2);
        this.insert_a_line(db,"22:12:00", 1, 0, 0, 3);
        this.insert_a_line(db,"22:15:00", 1, 0, 0, 4);
        this.insert_a_line(db,"22:21:00", 1, 0, 0, 5);
        this.insert_a_line(db,"22:24:00", 1, 0, 0, 6);
        this.insert_a_line(db,"22:30:00", 1, 0, 0, 1);

        this.insert_a_line(db,"22:35:00", 1, 0, 0, 1);
        this.insert_a_line(db,"22:41:00", 1, 0, 0, 2);
        this.insert_a_line(db,"22:47:00", 1, 0, 0, 3);
        this.insert_a_line(db,"22:50:00", 1, 0, 0, 4);
        this.insert_a_line(db,"22:56:00", 1, 0, 0, 5);
        this.insert_a_line(db,"22:59:00", 1, 0, 0, 6);
        this.insert_a_line(db,"23:05:00", 1, 0, 0, 1);

    }



    public ArrayList<HashMap<String, String>> getall_bustimes() {

        // ArrayList that contains every row in the database
        // and each row key / value stored in a HashMap

        ArrayList<HashMap<String, String>> buslist;

        buslist = new ArrayList<HashMap<String, String>>();

        String selectQuery = "SELECT  * FROM timetable";

        // Open a database for reading and writing

        SQLiteDatabase database = this.getWritableDatabase();

        // Cursor provides read and write access for the
        // data returned from a database query

        // rawQuery executes the query and returns the result as a Cursor

        Cursor cursor = database.rawQuery(selectQuery, null);

        // Move to the first row

        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> busMap = new HashMap<String, String>();

                // Store the key / value pairs in a HashMap
                // Access the Cursor data by index that is in the same order
                // as used when creating the table

                busMap.put("id", cursor.getString(0));
                busMap.put("time", cursor.getString(1));
                switch (cursor.getString(2)){
                    case "0":busMap.put("direction", "ClockWise");
                        break;
                    case "1":busMap.put("direction", "Counter-clockwise");
                        break;
                }
                switch (cursor.getString(3)){
                    case "0":
                        busMap.put("low", "Normal");
                        break;
                    case "1":
                        busMap.put("low", "Low Bus");
                        break;
                }
                switch (cursor.getString(4)){
                    case "0":busMap.put("holiday", "Weekdays");
                        break;
                    case "1":busMap.put("holiday", "Weekend and natinal holidays");
                        break;
                }
                switch (cursor.getString(5)){
                    case "1":busMap.put("stationm", Integer.toString(R.mipmap.center2));
                        break;
                    case "2":busMap.put("stationm", Integer.toString(R.mipmap.hospital));
                        break;
                    case "3":busMap.put("stationm", Integer.toString(R.mipmap.hall));
                        break;
                    case "4":busMap.put("stationm", Integer.toString(R.mipmap.ichinoya));
                        break;
                    case "5":busMap.put("stationm", Integer.toString(R.mipmap.admin));
                        break;
                    case "6":busMap.put("stationm", Integer.toString(R.mipmap.amakubo));
                        break;

                }
                switch (cursor.getString(5)){
                    case "1":busMap.put("station", "Tsukuba Station (Tsukuba center )");
                        break;
                    case "2":busMap.put("station", "Tsukuba Station (Tsukuba center )");
                        break;
                    case "3":busMap.put("station", "Tsukuba Station (Tsukuba center )");
                        break;
                    case "4":busMap.put("station", "Tsukuba Station (Tsukuba center )");
                        break;
                    case "5":busMap.put("station", "Tsukuba Station (Tsukuba center )");
                        break;
                    case "6":busMap.put("station", "Tsukuba Station (Tsukuba center )");
                        break;

                }


                buslist.add(busMap);
            } while (cursor.moveToNext()); // Move Cursor to the next row
        }

        // return contact list
        return buslist;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS timetable";
        db.execSQL(query);
        onCreate(db);
    }

    public ArrayList<HashMap<String, String>> get_bustimes(String mystation,String days) {

        // ArrayList that contains every row in the database
        // and each row key / value stored in a HashMap

        ArrayList<HashMap<String, String>> buslist;

        buslist = new ArrayList<HashMap<String, String>>();
        System.out.println(mystation);
        actual_time = sdf.format(new Date());
        String selectQuery = "SELECT  * FROM timetable WHERE station = "+mystation+" AND holiday = "+days
                +" AND '"+actual_time+"'<timetable.time ORDER BY Time";
        System.out.println(selectQuery);
        // Open a database for reading and writing

        SQLiteDatabase database = this.getWritableDatabase();

        // Cursor provides read and write access for the
        // data returned from a database query

        // rawQuery executes the query and returns the result as a Cursor

        Cursor cursor = database.rawQuery(selectQuery, null);

        // Move to the first row

        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> busMap = new HashMap<String, String>();

                busMap.put("id", cursor.getString(0));
                busMap.put("time", cursor.getString(1));

                switch (cursor.getString(2)){
                    case "0":busMap.put("direction", "ClockWise");
                        break;
                    case "1":busMap.put("direction", "Counter-clockwise");
                        break;
                }

                switch (cursor.getString(3)){
                    case "0":
                        busMap.put("low", "Normal");
                        break;
                    case "1":
                        busMap.put("low", "Low Bus");
                        break;
                }

                switch (cursor.getString(4)){
                    case "0":busMap.put("holiday", "Weekdays");
                        break;
                    case "1":busMap.put("holiday", "Weekend and natinal holidays");
                        break;
                }

                switch (cursor.getString(5)){
                    case "1":busMap.put("stationm", Integer.toString(R.mipmap.center2));
                        break;
                    case "2":busMap.put("stationm", Integer.toString(R.mipmap.hospital));
                        break;
                    case "3":busMap.put("stationm", Integer.toString(R.mipmap.hall));
                        break;
                    case "4":busMap.put("stationm", Integer.toString(R.mipmap.ichinoya));
                        break;
                    case "5":busMap.put("stationm", Integer.toString(R.mipmap.admin));
                        break;
                    case "6":busMap.put("stationm", Integer.toString(R.mipmap.amakubo));
                        break;

                }

                switch (cursor.getString(5)){
                    case "1":busMap.put("station", "Tsukuba center");
                        break;
                    case "2":busMap.put("station", "Hospital");
                        break;
                    case "3":busMap.put("station", "University Hall");
                        break;
                    case "4":busMap.put("station", "Ichinoya");
                        break;
                    case "5":busMap.put("station", "Administration");
                        break;
                    case "6":busMap.put("station", "Amakubo 2");
                        break;

                }
                buslist.add(busMap);

            } while (cursor.moveToNext()); // Move Cursor to the next row
        }

        // return contact list
        return buslist;
    }

    public ArrayList<HashMap<String, String>> get_nextbus(String days) {

        // ArrayList that contains every row in the database
        // and each row key / value stored in a HashMap

        ArrayList<HashMap<String, String>> buslist;


        buslist = new ArrayList<HashMap<String, String>>();

        actual_time = sdf.format(new Date());
        // Open a database for reading and writing
        SQLiteDatabase database = this.getWritableDatabase();
        for (int i=1;i<=6;i++){
        String selectQuery = "SELECT  * FROM timetable WHERE station = "+i+" AND holiday = "+days
                +" AND '"+actual_time+"'<timetable.time ORDER BY Time";
        System.out.println(selectQuery);

        Cursor cursor = database.rawQuery(selectQuery, null);

        // Move to the first row
        if (cursor.moveToFirst()) {
            HashMap<String, String> busMap = new HashMap<String, String>();
            busMap.put("time", cursor.getString(1));
            buslist.add(busMap);
        } else {
            HashMap<String, String> busMap = new HashMap<String, String>();
            busMap.put("time", "--:--:--");
            buslist.add(busMap);
        }}


        // return contact list
        return buslist;
    }

}
