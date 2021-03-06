package org.schabi.newpipelegacy.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.schabi.newpipelegacy.BaseFragment;
import org.schabi.newpipelegacy.R;
import androidx.annotation.Nullable;

public class EmptyFragment extends BaseFragment {
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
                             final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_empty, container, false);
    }
}
