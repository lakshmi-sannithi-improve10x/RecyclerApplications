package com.improve10x.recyclerviewapplications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class InstagramActivity extends AppCompatActivity {
    public  InstagramItems[] instagramItems;
    RecyclerView instagramItemsRv;
     public InstagramRvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        initViews();
        createInstagramData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        instagramItemsRv.setLayoutManager(new LinearLayoutManager(this));
        instagramItemsRv.setAdapter(adapter);
    }

    private void setupAdapter() {
       adapter = new InstagramRvAdapter(instagramItems) ;
    }

    private void initViews() {
        instagramItemsRv = findViewById(R.id.instagramitems_rv);
    }

    private void createInstagramData() {
        instagramItems = new InstagramItems[4];

        instagramItems[0] = new InstagramItems();
        instagramItems[0].imageUrl = "sample";
        instagramItems[0].contactName = "lil_wyatt838";
        instagramItems[0].description = "Wyatt Torres";

        instagramItems[1] = new InstagramItems();
        instagramItems[1].imageUrl = "Sample";
        instagramItems[1].contactName = "sprinkles_bby19";
        instagramItems[1].description = "Gabriela Perez";

        instagramItems[2] = new InstagramItems();
        instagramItems[2].imageUrl = "Sample";
        instagramItems[2].contactName = "xander.the.great178";
        instagramItems[2].description = "Alex Koch";

        instagramItems[3] = new InstagramItems();
        instagramItems[3].imageUrl = "Sample";
        instagramItems[3].contactName = "kyia_kayaks";
        instagramItems[3].description = "Kyra Marie";
    }
}