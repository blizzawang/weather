package com.iamasoldier6.soldierweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by blizzawang on 19/3/9.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateReceiver.class);
        context.startService(i);
    }
}
