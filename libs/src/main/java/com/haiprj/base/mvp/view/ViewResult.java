package com.haiprj.base.mvp.view;

public interface ViewResult {

    void onViewAvailable(String key, Object... objects);
    void onViewNotAvailable(String mess);
}
