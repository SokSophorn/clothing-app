package com.soksophorn.clothingshop.ui.settings;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.soksophorn.clothingshop.R;


public class SettingsModelView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Access the switch elements
        Switch notificationsSwitch = findViewById(R.id.switch_notifications);
        Switch locationSwitch = findViewById(R.id.switch_location);

        // Set listeners for switches
        notificationsSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Notifications Enabled", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Notifications Disabled", Toast.LENGTH_SHORT).show();
            }
        });

        locationSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Location Services Enabled", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Location Services Disabled", Toast.LENGTH_SHORT).show();
            }
        });

        // Set listener for feedback button
        findViewById(R.id.button_feedback).setOnClickListener(v ->
                Toast.makeText(this, "Feedback button clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
