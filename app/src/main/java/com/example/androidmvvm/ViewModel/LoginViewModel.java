package com.example.androidmvvm.viewModel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.example.androidmvvm.Model.User;
import com.example.androidmvvm.callback.LoginResultCallback;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallback loginResultCallback;

    public LoginViewModel(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
        this.user= new User();
    }

    public TextWatcher getEmailTextWater(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWater(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());
            }
        };
    }

    public void onLoginClicked(View view){
        if(user.isValidData()){
            loginResultCallback.onSuccess("Success");
        }
        else {
            loginResultCallback.onError("Error");
        }
    }
}
