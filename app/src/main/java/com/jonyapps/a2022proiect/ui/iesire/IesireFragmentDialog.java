package com.jonyapps.a2022proiect.ui.iesire;


import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.jonyapps.a2022proiect.R;

public class IesireFragmentDialog extends DialogFragment {
    public static final String IESIRE_FRAGMENT_DIALOG = "IesireFragmentDialog";
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_fragment_iesire, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button exitAppButton = view.findViewById(R.id.exitAppButton);
        Button cancelButton = view.findViewById(R.id.cancelButton);
        exitAppButton.setOnClickListener(view1 -> getActivity().finishAffinity());
        cancelButton.setOnClickListener(view1 -> this.dismiss());
    }

}