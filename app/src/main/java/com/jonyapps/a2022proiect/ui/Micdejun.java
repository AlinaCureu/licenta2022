package com.jonyapps.a2022proiect.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jonyapps.a2022proiect.R;
import com.jonyapps.a2022proiect.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class Micdejun extends AppCompatActivity {

    private Button addcar;
    private TextView title,price;
    private ImageView poza;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    private MicdejunModel object;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micdejun);

        listView = findViewById(R.id.listview);

        ArrayList<MicdejunModel> arrayList = new ArrayList<>();

        arrayList.add(new MicdejunModel(R.drawable.menu_image, "30", "micdejun"));
        arrayList.add(new MicdejunModel(R.drawable.menu_image, "20", "micdejun"));
        arrayList.add(new MicdejunModel(R.drawable.menu_image, "20", "micdejun"));
        arrayList.add(new MicdejunModel(R.drawable.menu_image, "20", "micdejun"));

        ListAdapter listAdapter = new ListAdapter(this, R.layout.list_item, arrayList);
        listView.setAdapter(listAdapter);


        initView();


    }


    private void initView() {
         addcar=findViewById(R.id.buttonadd);
         title=findViewById(R.id.name);
         price=findViewById(R.id.price);


    }
}