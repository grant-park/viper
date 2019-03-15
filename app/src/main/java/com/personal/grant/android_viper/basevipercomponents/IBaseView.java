package com.personal.grant.android_viper.basevipercomponents;

public interface IBaseView<P extends IBasePresenter> {
    void initWithContext(P presenter);
    void setup();
}
