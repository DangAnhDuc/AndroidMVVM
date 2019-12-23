package com.example.androidmvvm.callback;

public interface LoginResultCallback {
    void onSuccess(String message);
    void onError(String message);
}
