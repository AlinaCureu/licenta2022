package com.jonyapps.a2022proiect.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.jonyapps.a2022proiect.R;

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
        for (int i = 1; i<20; i++) {
            arrayList.add(new MicdejunModel(R.drawable.menu_image,"30"+ i + " lei","micdejun"));
        }

        ListAdapter listAdapter = new ListAdapter(this, R.layout.list_item, arrayList, this.getSupportFragmentManager());
        listView.setAdapter(listAdapter);


        initView();


    }


    private void initView() {
         addcar=findViewById(R.id.buttonadd);
         title=findViewById(R.id.name);
         price=findViewById(R.id.price);


    }
}