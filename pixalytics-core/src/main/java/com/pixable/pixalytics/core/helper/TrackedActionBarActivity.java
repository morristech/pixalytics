package com.pixable.pixalytics.core.helper;

import android.support.v7.app.ActionBarActivity;

import com.pixable.pixalytics.core.TrackingWrap;

public abstract class TrackedActionBarActivity extends ActionBarActivity {

    @Override
    protected void onStart() {
        super.onStart();

        TrackingWrap.get().onSessionStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();

        TrackingWrap.get().onSessionFinish(this);
    }
}