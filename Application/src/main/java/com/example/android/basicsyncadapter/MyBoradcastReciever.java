package com.example.android.basicsyncadapter;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.android.common.accounts.GenericAccountService;
import com.example.android.common.logger.Log;

import static com.example.android.basicsyncadapter.SyncUtils.ACCOUNT_TYPE;
import static com.example.android.basicsyncadapter.provider.FeedContract.CONTENT_AUTHORITY;

/**
 * Created by Kif on 22.07.2017.
 */

public class MyBoradcastReciever extends BroadcastReceiver {

    public MyBoradcastReciever() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
       /* if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")||
                (intent.getAction().equals("com.example.android.basicsyncadapter"))) {

            SyncUtils.TriggerRefresh();
        }*/



        SyncUtils.TriggerRefresh();

    }

}
