package com.jonyapps.a2022proiect.ui.meniu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.jonyapps.a2022proiect.MicdejunFragment;
import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.ui.Carne;
import com.jonyapps.a2022proiect.ui.Desert;
import com.jonyapps.a2022proiect.ui.Garnituri;
import com.jonyapps.a2022proiect.ui.Micdejun;
import com.jonyapps.a2022proiect.ui.Paste;
import com.jonyapps.a2022proiect.ui.Pizza;

public class MeniuFragment extends Fragment {


    private ImageButton imagebutton,imagebutton1,imagebutton2,imagebutton3,imagebutton4,imagebutton5;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_meniu,container,false);
        imagebutton= v.findViewById(R.id.imageButton);
        imagebutton1= v.findViewById(R.id.imageButton2);
        imagebutton2= v.findViewById(R.id.imageButton3);
        imagebutton3= v.findViewById(R.id.imageButton4);
        imagebutton4= v.findViewById(R.id.imageButton5);
        imagebutton5= v.findViewById(R.id.imageButton6);

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Micdejun.class);
                startActivity(intent);
            }
        });
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Garnituri.class);
                startActivity(intent);
            }
        });
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Carne.class);
                startActivity(intent);
            }
        });
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Pizza.class);
                startActivity(intent);
            }
        });
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Paste.class);
                startActivity(intent);
            }
        });
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Desert.class);
                startActivity(intent);
            }
        });
        return v;
    }



}