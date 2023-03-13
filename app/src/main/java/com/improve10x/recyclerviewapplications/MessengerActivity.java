package com.improve10x.recyclerviewapplications;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MessengerActivity extends AppCompatActivity {
       public MessengerItems[] messengerItems;

       public MessengerRvAdapter adapter;
       RecyclerView messengerItemsRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);
        initViews();
        createMessengerData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
       messengerItemsRv.setLayoutManager(new GridLayoutManager(this,2));
       messengerItemsRv.setAdapter(adapter);
    }

    private void setupAdapter() {
      adapter = new MessengerRvAdapter(messengerItems);
    }

    private void initViews() {
      messengerItemsRv = findViewById(R.id.messengeritems_rv);

    }

    private void createMessengerData() {
        messengerItems = new MessengerItems[6];

        messengerItems[0] = new MessengerItems();
        messengerItems[0].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        messengerItems[0].messengerName = "Sam Scoott";
        messengerItems[0].description = "Hey how's it going";

        messengerItems[1] = new MessengerItems();
        messengerItems[1].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        messengerItems[1].messengerName = "Mai Tran";
        messengerItems[1].description = "Mai sent a sticker";

        messengerItems[2] = new MessengerItems();
        messengerItems[2].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        messengerItems[2].messengerName = "Emmie Baros";
        messengerItems[2].description = "Hi again :)";

        messengerItems[3] = new MessengerItems();
        messengerItems[3].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        messengerItems[3].messengerName = "Jorge Torrres";
        messengerItems[3].description = "Can't wait!";

        messengerItems[4] = new MessengerItems();
        messengerItems[4].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        messengerItems[4].messengerName = "Maria & Soumya";
        messengerItems[4].description = "Nice";

        messengerItems[5] = new MessengerItems();
        messengerItems[5].imageUrl = "https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        messengerItems[5].messengerName = "Surf Team";
        messengerItems[5].description = "See you there😊";
    }
}