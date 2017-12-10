package com.example.android.learnrecyclerv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        makeData();

        adapter=new MyAdapter(listItems,this);
        recyclerView.setAdapter(adapter);
    }

    private void makeData() {
        listItems=new ArrayList<>();
        for (int i=0;i<=10;i++){
            ListItem item=new ListItem(
              "Heading "+i,
                    "Lorem Ipsum test test"
            );

            listItems.add(item);
        }
    }
}
