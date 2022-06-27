package com.jonyapps.a2022proiect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jonyapps.a2022proiect.ui.ListAdapter;
import com.jonyapps.a2022proiect.ui.MicdejunModel;

import java.util.ArrayList;


public class CoscumparaturiFragment extends Activity {

    ListView listView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_micdejun,container,false);


        listView=v.findViewById(R.id.listview);

        //Bundle bundle = getIntent().getExtras();
        //ArrayList<Student> arraylist = bundle.getParcelableArrayList("mylist");

        //bundle;
       // meniu1 = bundle.getString("meniu1");

        return v;
    }
}