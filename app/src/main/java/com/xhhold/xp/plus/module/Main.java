package com.xhhold.xp.plus.module;

import android.content.Context;
import android.util.Log;

/**
 * @author nameh
 */
public class Main {

    private static final String TAG=Main.class.getName();

    public Main(Context contextNet,Context contextPlus){
        Log.i(TAG,"云音乐增强模块(Module)"+contextNet.getPackageName());
    }
}
