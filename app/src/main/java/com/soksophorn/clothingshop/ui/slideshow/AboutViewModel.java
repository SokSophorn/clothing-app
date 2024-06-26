package com.soksophorn.clothingshop.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {

    private final MutableLiveData<String> aboutTitle;
    private final MutableLiveData<String> aboutDescription;
    private final MutableLiveData<String> missionTitle;
    private final MutableLiveData<String> missionDescription;
    private final MutableLiveData<String> teamTitle;
    private final MutableLiveData<String> contactTitle;
    private final MutableLiveData<String> contactInfo;

    public AboutViewModel() {
        aboutTitle = new MutableLiveData<>();
        aboutDescription = new MutableLiveData<>();
        missionTitle = new MutableLiveData<>();
        missionDescription = new MutableLiveData<>();
        teamTitle = new MutableLiveData<>();
        contactTitle = new MutableLiveData<>();
        contactInfo = new MutableLiveData<>();

        aboutTitle.setValue("About Us");
        aboutDescription.setValue("Welcome to our company! We are committed to providing excellent services and products to our customers.");
        missionTitle.setValue("Our Mission");
        missionDescription.setValue("Our mission is to deliver high-quality solutions that empower our clients and contribute to their success.");
        teamTitle.setValue("Meet Our Team");
        contactTitle.setValue("Contact Us");
        contactInfo.setValue("Email: contact@ourcompany.com\nPhone: +1 234 567 890");
    }

    public LiveData<String> getAboutTitle() {
        return aboutTitle;
    }

    public LiveData<String> getAboutDescription() {
        return aboutDescription;
    }

    public LiveData<String> getMissionTitle() {
        return missionTitle;
    }

    public LiveData<String> getMissionDescription() {
        return missionDescription;
    }

    public LiveData<String> getTeamTitle() {
        return teamTitle;
    }

    public LiveData<String> getContactTitle() {
        return contactTitle;
    }

    public LiveData<String> getContactInfo() {
        return contactInfo;
    }
}
