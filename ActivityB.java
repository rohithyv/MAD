package com.example.lab10_083;

import com.example.lab10_083.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ActivityB extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//setContentView(R.layout.activity_layout_b);
        addPreferencesFromResource(R.xml.preferences);
    }
}
