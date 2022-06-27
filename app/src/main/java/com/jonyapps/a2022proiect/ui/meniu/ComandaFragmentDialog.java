package com.jonyapps.a2022proiect.ui.meniu;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.ui.iesire.IesireFragmentDialog;

public class ComandaFragmentDialog extends DialogFragment {
    public static final String COMANDA_FRAGMENT_DIALOG = "ComandaFragmentDialog";
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.comanda_fragment_dialog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button addProductButton = view.findViewById(R.id.addProductButton);
        Button cancelButton = view.findViewById(R.id.cancelButton);
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                new ComandaNumarDialog().show(getActivity().getSupportFragmentManager(), ComandaNumarDialog.COMANDA_FRAGMENT_DIALOG);
            }
        });
        cancelButton.setOnClickListener(view1 -> this.dismiss());
    }

}