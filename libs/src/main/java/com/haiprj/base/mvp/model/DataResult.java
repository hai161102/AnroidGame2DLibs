package com.haiprj.base.mvp.model;

public interface DataResult {
    void onDataResultSuccess(String key, Object... objects);
    void onDataResultFailed(String mess);
}
