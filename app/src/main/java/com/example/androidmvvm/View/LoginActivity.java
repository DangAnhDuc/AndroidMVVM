package com.example.androidmvvm.View;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.androidmvvm.R;
import com.example.androidmvvm.callback.LoginResultCallback;
import com.example.androidmvvm.databinding.ActivityLoginBinding;
import com.example.androidmvvm.viewModel.LoginViewModel;
import com.example.androidmvvm.viewModel.LoginViewModelFactory;

import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity implements LoginResultCallback {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding activityLoginBinding= DataBindingUtil.setContentView(this, R.layout.activity_login);
        activityLoginBinding.setViewModel(ViewModelProviders.of(this,
                new LoginViewModelFactory(this))
                .get(LoginViewModel.class));
    }

    @Override
    public void onSuccess(String message) {
        Toasty.success(this,"Login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String message) {
        Toasty.error(this,"Login faild", Toast.LENGTH_SHORT).show();

    }
}
