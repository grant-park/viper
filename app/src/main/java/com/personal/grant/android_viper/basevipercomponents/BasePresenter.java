package com.personal.grant.android_viper.basevipercomponents;

public abstract class BasePresenter<V extends IBaseView, I extends IBaseInteractor,
        R extends IBaseRouter> implements IBasePresenter {

    protected V _view;
    protected I _interactor;
    protected R _router;

    public BasePresenter(V view, I interactor, R router) {
        _view = view;
        _interactor = interactor;
        _router = router;
    }

    @Override
    public void onDestroy() {
        _view = null;
        _interactor = null;
    }
}
