package org.schabi.newpipelegacy.settings;

import android.os.Bundle;

import org.schabi.newpipelegacy.R;

public class DebugSettingsFragment extends BasePreferenceFragment {
    @Override
    public void onCreatePreferences(final Bundle savedInstanceState, final String rootKey) {
        addPreferencesFromResource(R.xml.debug_settings);
    }
}
