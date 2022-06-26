package com.jonyapps.a2022proiect.ui.iesire;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.jonyapps.a2022proiect.R;


public class IesireFragment extends Fragment {


    DrawerLayout drawerlayout;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_iesire, container, false);

        drawerlayout= v.findViewById(R.id.drawer_layout);

        return v;
    }
}