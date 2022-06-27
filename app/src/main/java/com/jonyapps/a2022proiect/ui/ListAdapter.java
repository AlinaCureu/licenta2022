package com.jonyapps.a2022proiect.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;

import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.ui.meniu.ComandaFragmentDialog;
import com.jonyapps.a2022proiect.ui.meniu.ComandaNumarDialog;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<MicdejunModel> {

    private final FragmentManager fragmentManager;
    private Context mContext;
    private int mResource;
    private ArrayList<MicdejunModel> mancaruri;


    public ListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MicdejunModel> objects, FragmentManager activity) {
        super(context, resource, objects);
        this.mContext=context;
        this.fragmentManager =activity;
        this.mResource=resource;
        this.mancaruri=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        convertView=layoutInflater.inflate(mResource,parent,false);

        ImageView imageView=convertView.findViewById(R.id.imageview);
        TextView price=convertView.findViewById(R.id.price);
        TextView name=convertView.findViewById(R.id.name);
        TextView buttonadd =convertView.findViewById(R.id.buttonadd);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ComandaFragmentDialog().show(fragmentManager, ComandaNumarDialog.COMANDA_FRAGMENT_DIALOG);
            }
        });

        imageView.setImageResource(getItem(position).getImage());
        price.setText(getItem(position).getPrice());
        name.setText(getItem(position).getName());


        return  convertView;
    }
}
