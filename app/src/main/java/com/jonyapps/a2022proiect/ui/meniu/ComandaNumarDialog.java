package com.jonyapps.a2022proiect.ui.meniu;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.ui.iesire.IesireFragmentDialog;

public class ComandaNumarDialog extends DialogFragment {
    public static final String COMANDA_FRAGMENT_DIALOG = "ComandaNumarDialog";
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_fragment_numar_comanda, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getDialog().getWindow()
                .setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        Button comandaButton = view.findViewById(R.id.comandaButton);
        Button cancelButton = view.findViewById(R.id.cancelButton);
        comandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                Toast.makeText(getActivity(), "Meniul va ajunge la masa dumneavoastra in cel mai scurt timp posibil!", Toast.LENGTH_LONG).show();
            }
        });
        cancelButton.setOnClickListener(view1 -> this.dismiss());
    }

}