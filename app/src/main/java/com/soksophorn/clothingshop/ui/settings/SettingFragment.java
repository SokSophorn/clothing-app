package com.soksophorn.clothingshop.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.SwitchCompat;

import com.soksophorn.clothingshop.R;


public class SettingFragment extends Fragment {

    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_settings, container, false);

        // Access the switch elements
        SwitchCompat notificationsSwitch = rootView.findViewById(R.id.switch_notifications);
        SwitchCompat locationSwitch = rootView.findViewById(R.id.switch_location);

        // Set listeners for switches
        notificationsSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(requireContext(), "Notifications Enabled", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(requireContext(), "Notifications Disabled", Toast.LENGTH_SHORT).show();
            }
        });

        locationSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(requireContext(), "Location Services Enabled", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(requireContext(), "Location Services Disabled", Toast.LENGTH_SHORT).show();
            }
        });

        // Set listener for feedback button
        rootView.findViewById(R.id.button_feedback).setOnClickListener(v ->
                Toast.makeText(requireContext(), "Feedback button clicked", Toast.LENGTH_SHORT).show()
        );

        return rootView;
    }
}
