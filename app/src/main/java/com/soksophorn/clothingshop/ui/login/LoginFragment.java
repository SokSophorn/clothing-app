package com.soksophorn.clothingshop.ui.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.soksophorn.clothingshop.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    private FragmentLoginBinding binding;
    private LoginViewModel loginViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Initialize ViewModel
        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        // Inflate the layout using ViewBinding
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Access UI components via binding
        EditText usernameEditText = binding.loginUsername;
        EditText passwordEditText = binding.loginPassword;
        Button loginButton = binding.btnloginForm;

        // Set up login button click listener
        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            // Validate user input
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(getActivity(), "Please enter both username and password.", Toast.LENGTH_SHORT).show();
            } else {
                // Call ViewModel method to handle login
                loginViewModel.login(username, password);
            }
        });

        // Observe ViewModel LiveData for login status
        loginViewModel.getLoginStatus().observe(getViewLifecycleOwner(), loginStatus -> {
            if (loginStatus) {
                Toast.makeText(getActivity(), "Login successful!", Toast.LENGTH_SHORT).show();
                // Navigate to the next screen or perform other actions on successful login
            } else {
                Toast.makeText(getActivity(), "Login failed! Please check your credentials.", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Clear binding to avoid memory leaks
    }
}
