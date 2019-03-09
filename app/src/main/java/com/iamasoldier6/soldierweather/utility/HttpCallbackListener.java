package com.iamasoldier6.soldierweather.utility;

import java.io.InputStream;

/**
 * Created by blizzawang on 19/3/9.
 */
public interface HttpCallbackListener {
    void onFinish(InputStream in);

    void onError(Exception e);
}
