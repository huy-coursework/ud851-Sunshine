package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

public class SunshineSyncUtils {
    public static void startImmediateSync(Context context) {
        Intent startServiceIntent = new Intent(context, SunshineSyncIntentService.class);
        context.startService(startServiceIntent);
    }
}