package com.example.yana.temankampussttgarut;

/**
 * Created by Yana on 26/01/2017.
 */


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "tksttgarut.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table datateman(npm integer primary key, nama text null, ttl text null, tlp text null, alamat text null, ttg text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO datateman (npm, nama, ttl, tlp, alamat, ttg) VALUES ('1306137', 'Yana Nuryana', 'Garut, 10 Oktober 1994', '085793306700','Bl. Limbangan - Kab. Garut','oke bingit');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

}