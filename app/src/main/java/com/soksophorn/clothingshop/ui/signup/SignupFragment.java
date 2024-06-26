package com.soksophorn.clothingshop.ui.signup;// SignupFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.soksophorn.clothingshop.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;


public class SignupFragment extends Fragment {

    private SignupViewModel viewModel;
    private TextInputEditText firstNameEditText, lastNameEditText, emailEditText, passwordEditText;
    private MaterialButton signupButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize views
        firstNameEditText = view.findViewById(R.id.signup_first_name);
        lastNameEditText = view.findViewById(R.id.signup_last_name);
        emailEditText = view.findViewById(R.id.signup_email);
        passwordEditText = view.findViewById(R.id.signup_password);
        signupButton = view.findViewById(R.id.btn_signup);

        // Initialize ViewModel
        viewModel = new ViewModelProvider(this).get(SignupViewModel.class);

        // Set click listener for signup button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle signup button click, you can call ViewModel methods here
                // For simplicity, let's just print the entered values
                String firstName = firstNameEditText.getText().toString();
                String lastName = lastNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });
    }
}
