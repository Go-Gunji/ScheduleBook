package com.example.schedulebook;

import io.realm.Realm;

class ScheduleBookApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}