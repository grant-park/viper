package com.personal.grant.android_viper.basevipercomponents;

public abstract class BaseInteractor<P extends IBasePresenter> implements IBaseInteractor<P> {
    protected P _presenter;

    @Override
    public void registerPresenter(P presenter) {
        _presenter = presenter;
    }
}
