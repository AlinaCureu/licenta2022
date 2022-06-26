package com.jonyapps.a2022proiect.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.SQL;
import com.jonyapps.a2022proiect.databinding.FragmentHomeBinding;

import java.sql.Connection;
import java.sql.Statement;

public class HomeFragment extends Fragment {


        public View onCreateView( LayoutInflater inflater,
                                  ViewGroup container, Bundle savedInstanceState) {

            View v = inflater.inflate(R.layout.fragment_home, container, false);


            return v;
        }

}