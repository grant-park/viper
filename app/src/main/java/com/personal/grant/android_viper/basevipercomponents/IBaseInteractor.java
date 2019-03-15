package com.personal.grant.android_viper.basevipercomponents;

public interface IBaseInteractor<P extends IBasePresenter> {
    void registerPresenter(P presenter);
}
