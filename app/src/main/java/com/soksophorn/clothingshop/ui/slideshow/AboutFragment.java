package com.soksophorn.clothingshop.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.soksophorn.clothingshop.databinding.FragmentAboutBinding;


public class AboutFragment extends Fragment {

    private FragmentAboutBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get ViewModel
        AboutViewModel aboutViewModel = new ViewModelProvider(this).get(AboutViewModel.class);

        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set up text views
        final TextView textAboutTitle = binding.textAboutTitle;
        final TextView textAboutDescription = binding.textAboutDescription;
        final TextView textMissionTitle = binding.textMissionTitle;
        final TextView textMissionDescription = binding.textMissionDescription;
        final TextView textTeamTitle = binding.textTeamTitle;
        final TextView textContactTitle = binding.textContactTitle;
        final TextView textContactInfo = binding.textContactInfo;

        // Observe ViewModel data
        aboutViewModel.getAboutTitle().observe(getViewLifecycleOwner(), textAboutTitle::setText);
        aboutViewModel.getAboutDescription().observe(getViewLifecycleOwner(), textAboutDescription::setText);
        aboutViewModel.getMissionTitle().observe(getViewLifecycleOwner(), textMissionTitle::setText);
        aboutViewModel.getMissionDescription().observe(getViewLifecycleOwner(), textMissionDescription::setText);
        aboutViewModel.getTeamTitle().observe(getViewLifecycleOwner(), textTeamTitle::setText);
        aboutViewModel.getContactTitle().observe(getViewLifecycleOwner(), textContactTitle::setText);
        aboutViewModel.getContactInfo().observe(getViewLifecycleOwner(), textContactInfo::setText);

        // Set up WebView for the map

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up binding
        binding = null;
    }
}
