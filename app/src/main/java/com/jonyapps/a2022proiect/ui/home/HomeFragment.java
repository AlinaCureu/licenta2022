package com.jonyapps.a2022proiect.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.jonyapps.a2022proiect.R;

public class HomeFragment extends Fragment {


        public View onCreateView( LayoutInflater inflater,
                                  ViewGroup container, Bundle savedInstanceState) {

            View v = inflater.inflate(R.layout.fragment_alergeni, container, false);


            return v;
        }

}