package com.jonyapps.a2022proiect.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jonyapps.a2022proiect.R;

import java.util.ArrayList;

public class CartListAdapter extends ArrayAdapter<MicdejunModel> {

    private Context mContext;
    private int mResource;


    public CartListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MicdejunModel> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        convertView=layoutInflater.inflate(mResource,parent,false);

        ImageView imageView=convertView.findViewById(R.id.imageview);
        TextView price=convertView.findViewById(R.id.price);
        TextView name=convertView.findViewById(R.id.name);


        imageView.setImageResource(getItem(position).getImage());
        price.setText(getItem(position).getPrice());
        name.setText(getItem(position).getName());


        return  convertView;
    }
}