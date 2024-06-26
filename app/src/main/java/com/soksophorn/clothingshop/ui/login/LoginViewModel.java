package com.soksophorn.clothingshop.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private final MutableLiveData<Boolean> loginStatus = new MutableLiveData<>();

    public LiveData<Boolean> getLoginStatus() {
        return loginStatus;
    }

    public void login(String username, String password) {
        // Simulate a login process, replace with actual login logic
        if ("user@example.com".equals(username) && "password123".equals(password)) {
            loginStatus.setValue(true); // Login successful
        } else {
            loginStatus.setValue(false); // Login failed
        }
    }
}
