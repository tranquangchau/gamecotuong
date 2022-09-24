package com.game.chinese.jchess.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.game.chinese.jchess.R;

/**
 * Created by tangbull on 2018/3/13.
 */

public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.game_settings);
    }
}
