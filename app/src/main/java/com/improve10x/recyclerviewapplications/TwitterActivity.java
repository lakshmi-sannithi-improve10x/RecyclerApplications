package com.improve10x.recyclerviewapplications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TwitterActivity extends AppCompatActivity {
    public TwitterItems[] twitterItems;
    RecyclerView twitterItemsRv;
    public TwitterRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        initViews();
        createTwitterData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        twitterItemsRv.setLayoutManager(new LinearLayoutManager(this));
        twitterItemsRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new TwitterRvAdapter(twitterItems);
    }

    private void initViews() {
        twitterItemsRv = findViewById(R.id.twitteritems_rv);
    }

    private void createTwitterData() {
        twitterItems = new TwitterItems[6];

        twitterItems[0] = new TwitterItems();
        twitterItems[0].imageUrl = "sample";
        twitterItems[0].name = "Silivia";
        twitterItems[0].time = "@machadocomida.1m";
        twitterItems[0].description = "ppl keep saying hot girl summer but i'm just trying to stay out of the humidity";
        twitterItems[0].messegeNo = "5";
        twitterItems[0].rotateNo ="8";
        twitterItems[0].favoriteNo = "12";

        twitterItems[1] = new TwitterItems();
        twitterItems[1].imageUrl = "sample";
        twitterItems[1].name = "Jasi";
        twitterItems[1].time = "@k9lover85,20m";
        twitterItems[1].description = "pop songs just hit different when you're driving";
        twitterItems[1].messegeNo = "7";
        twitterItems[1].rotateNo ="3";
        twitterItems[1].favoriteNo = "20";

        twitterItems[2] = new TwitterItems();
        twitterItems[2].imageUrl = "sample";
        twitterItems[2].name = "Vera";
        twitterItems[2].time = "@Veracordeiro20-1h ";
        twitterItems[2].description = "Help i can't stop canceling meetings";
        twitterItems[2].messegeNo = "2";
        twitterItems[2].rotateNo ="1";
        twitterItems[2].favoriteNo = "6";

        twitterItems[3] = new TwitterItems();
        twitterItems[3].jone = "🔁Silver Jones Retweeted";
        twitterItems[3].imageUrl = "sample";
        twitterItems[3].name = "Twitter";
        twitterItems[3].time = "@Twitter-2/8/21 ";
        twitterItems[3].description = " memes have expiration dates";
        twitterItems[3].messegeNo = "135K";
        twitterItems[3].rotateNo =" 32.9K";
        twitterItems[3].favoriteNo = "269k";

        twitterItems[4] = new TwitterItems();
        twitterItems[4].imageUrl = "sample";
        twitterItems[4].name = "Harold";
        twitterItems[4].time = "@h_wang84-3h  ";
        twitterItems[4].description = "There are too many people outside";
        twitterItems[4].messegeNo = "4K";
        twitterItems[4].rotateNo =" 38K";
        twitterItems[4].favoriteNo = "25";

        twitterItems[5] = new TwitterItems();
        twitterItems[5].imageUrl = "sample";
        twitterItems[5].name = "Allen";
        twitterItems[5].time = "@grayhamsays-12h  ";
        twitterItems[5].description = "There are too many people outside";
        twitterItems[5].messegeNo = "4K";
        twitterItems[5].rotateNo =" 38K";
        twitterItems[5].favoriteNo = "25";





    }
}