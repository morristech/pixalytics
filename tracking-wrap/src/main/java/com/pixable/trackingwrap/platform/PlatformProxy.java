package com.pixable.trackingwrap.platform;

import android.content.Context;

import com.pixable.trackingwrap.Event;

import java.util.Map;

public interface PlatformProxy {

    void onApplicationCreate(Context context);

    void onActivityStart(Context context);

    void onActivityStop(Context context);

    void addCommonProperties(Context context, Map<String, String> commonProperties);

    void trackEvent(Context context, Event event);
}
