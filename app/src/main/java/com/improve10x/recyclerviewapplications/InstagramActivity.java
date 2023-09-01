package com.improve10x.recyclerviewapplications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class InstagramActivity extends AppCompatActivity {
    public  InstagramItems[] instagramItems;
    RecyclerView instagramItemsRv;
    RecyclerView suggestedRv;
     public InstagramRvAdapter adapter;
     public InstagramRvAdapter suggestedAdapter;

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
        suggestedRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        instagramItemsRv.setAdapter(adapter);
        suggestedRv.setAdapter(suggestedAdapter);
    }

    private void setupAdapter() {
       adapter = new InstagramRvAdapter(instagramItems) ;
       suggestedAdapter = new InstagramRvAdapter(instagramItems);
    }

    private void initViews() {
        instagramItemsRv = findViewById(R.id.instagramitems_rv);
        suggestedRv = findViewById(R.id.suggested_rv);
    }

    private void createInstagramData() {
        instagramItems = new InstagramItems[4];

        instagramItems[0] = new InstagramItems();
        instagramItems[0].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        instagramItems[0].contactName = "lil_wyatt838";
        instagramItems[0].description = "Wyatt Torres";

        instagramItems[1] = new InstagramItems();
        instagramItems[1].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        instagramItems[1].contactName = "sprinkles_bby19";
        instagramItems[1].description = "Gabriela Perez";

        instagramItems[2] = new InstagramItems();
        instagramItems[2].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        instagramItems[2].contactName = "xander.the.great178";
        instagramItems[2].description = "Alex Koch";

        instagramItems[3] = new InstagramItems();
        instagramItems[3].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        instagramItems[3].contactName = "kyia_kayaks";
        instagramItems[3].description = "Kyra Marie";
    }
}