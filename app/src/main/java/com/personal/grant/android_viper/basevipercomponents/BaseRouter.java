package com.personal.grant.android_viper.basevipercomponents;

import android.content.Context;

public abstract class BaseRouter implements IBaseRouter {
    protected Context _context;

    public BaseRouter(Context context) {
        _context = context;
    }
}
