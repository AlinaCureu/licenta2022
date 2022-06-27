package com.jonyapps.a2022proiect.ui.logare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.databinding.FragmentLogareBinding;
public class LogareFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_logare,container,false);
        getActivity().getWindow().setBackgroundDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.backgroundinregistrare));

        return root;
    }



}