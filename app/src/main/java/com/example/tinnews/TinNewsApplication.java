package com.example.tinnews;

import android.app.Application;

import androidx.room.Room;

import com.example.tinnews.database.TinNewsDatabase;
import com.facebook.stetho.Stetho;

public class TinNewsApplication extends Application {
    private static TinNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();
    }

    public static TinNewsDatabase getDatabase() {
        return database;
    }

}
