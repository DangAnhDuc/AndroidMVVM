package com.example.androidmvvm.ViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.androidmvvm.callback.LoginResultCallback;

public class LoginViewModelFactory  extends ViewModelProvider.NewInstanceFactory {
    private LoginResultCallback loginResultCallback;

    public LoginViewModelFactory(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginResultCallback);
    }
}
