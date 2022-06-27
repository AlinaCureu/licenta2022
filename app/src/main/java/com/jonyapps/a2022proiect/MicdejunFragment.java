package com.jonyapps.a2022proiect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import com.jonyapps.a2022proiect.ui.ListAdapter;
import com.jonyapps.a2022proiect.ui.MicdejunModel;

import java.util.ArrayList;


public class MicdejunFragment extends Fragment {

    ListView listView;
    ListView macaruriAdaugate;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_micdejun,container,false);


        listView=v.findViewById(R.id.listview);

        ArrayList<MicdejunModel> arrayList=new ArrayList<>();

        arrayList.add(new MicdejunModel(R.drawable.menu_image,"30","micdejun"));
        arrayList.add(new MicdejunModel(R.drawable.menu_image,"20","micdejun"));
        arrayList.add(new MicdejunModel(R.drawable.menu_image,"20","micdejun"));
        arrayList.add(new MicdejunModel(R.drawable.menu_image,"20","micdejun"));

        ListAdapter listAdapter=new ListAdapter(getContext(),R.layout.list_item,arrayList);
        listView.setAdapter(listAdapter);

        //seton click lister(){
         //   macaruriAdaugate.add()
       //

        //Bundle bundle = new Bundle();
        //bundle.putString("meniu1", "30_micdejun");
      //  bundle.putSerializable(new MicdejunModel(R.drawable.menu_image,"30","micdejun"));

        return v;
    }
}