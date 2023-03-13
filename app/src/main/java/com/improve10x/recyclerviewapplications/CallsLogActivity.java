package com.improve10x.recyclerviewapplications;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CallsLogActivity extends AppCompatActivity {
      public CallLogItems[] callLogItems;
      public CallLogRvAdapter adapter;
      RecyclerView callLogItemsRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls_log);
        initViews();
        createCallLogItems();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
       callLogItemsRv.setLayoutManager(new GridLayoutManager(this,2));
       callLogItemsRv.setAdapter(adapter);

    }

    private void setupAdapter() {
        adapter = new CallLogRvAdapter(callLogItems);

    }

    private void initViews() {
        callLogItemsRv = findViewById(R.id.calllogitems_rv);

    }

    private void createCallLogItems() {
        callLogItems = new CallLogItems[6];
        callLogItems[0] = new CallLogItems();
        callLogItems[0].imageUrl = "https://static.thenounproject.com/png/100859-200.png";
        callLogItems[0].number = "+91 93135 49611";
        callLogItems[0].timeAndCountry = "India,46min.ago";

        callLogItems[1] = new CallLogItems();
        callLogItems[1].imageUrl = "https://static.thenounproject.com/png/100859-200.png";
        callLogItems[1].number = "WiFi";
        callLogItems[1].timeAndCountry = "Mobile,1hr.ago";

        callLogItems[2] = new CallLogItems();
        callLogItems[2].imageUrl = "https://static.thenounproject.com/png/100859-200.png";
        callLogItems[2].number = "+91 76786 05379";
        callLogItems[2].timeAndCountry = "↗️India,22min.ago";

        callLogItems[3] = new CallLogItems();
        callLogItems[3].imageUrl = "https://static.thenounproject.com/png/100859-200.png";
        callLogItems[3].number = "+91 81305 92642";
        callLogItems[3].timeAndCountry = "↙️️India,2 days.ago";

        callLogItems[4] = new CallLogItems();
        callLogItems[4].imageUrl = "https://static.thenounproject.com/png/100859-200.png";
        callLogItems[4].number = "+91 114940 2363";
        callLogItems[4].timeAndCountry = "↙️New Delhi,2 days.ago";

        callLogItems[5] = new CallLogItems();
        callLogItems[5].imageUrl = "https://static.thenounproject.com/png/100859-200.png";
        callLogItems[5].number = "1909";
        callLogItems[5].timeAndCountry = "↗️India,46 min.ago";

    }
}