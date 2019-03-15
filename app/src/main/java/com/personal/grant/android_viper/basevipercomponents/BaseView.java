package com.personal.grant.android_viper.basevipercomponents;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseView<P extends IBasePresenter> extends AppCompatActivity implements IBaseView<P> {

    protected P _presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setup();
    }

    @Override
    protected void onResume() {
        super.onResume();
        _presenter.onViewCreated();
    }

    @Override
    protected void onDestroy() {
        _presenter.onDestroy();
        _presenter = null;
        super.onDestroy();
    }

    @Override
    public void initWithContext(P presenter) {
        _presenter = presenter;
    }
}
