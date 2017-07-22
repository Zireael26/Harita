package com.gdgvitvellore.pricecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class BillingActivity extends AppCompatActivity {


    ArrayList<Commodity> listOfCommodities = new ArrayList<>();

    private RecyclerView mCommList;
    private CommRecAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);

        listOfCommodities.add(new Commodity("Tomato", 15, 700));
        listOfCommodities.add(new Commodity("Potato", 10, 967));
        listOfCommodities.add(new Commodity("Bell Pepper Yellow", 40, 1260));
        listOfCommodities.add(new Commodity("Brinjal", 23, 650));
        listOfCommodities.add(new Commodity("Broccoli", 6, 1763));
        listOfCommodities.add(new Commodity("Apple", 100, 700));
        listOfCommodities.add(new Commodity("Lemon", 100, 200));
        listOfCommodities.add(new Commodity("Pumpkin", 15, 700));
        listOfCommodities.add(new Commodity("Beetroot", 15, 700));
        listOfCommodities.add(new Commodity("Avocado", 15, 700));
        listOfCommodities.add(new Commodity("Grape", 100, 967));
        listOfCommodities.add(new Commodity("Bell Pepper Red", 40, 1260));
        listOfCommodities.add(new Commodity("Cherry", 90, 650));
        listOfCommodities.add(new Commodity("Chilli", 90, 130));
        listOfCommodities.add(new Commodity("Strawberry", 100, 700));
        listOfCommodities.add(new Commodity("Orange", 35, 750));
        listOfCommodities.add(new Commodity("Banana", 15, 700));
        listOfCommodities.add(new Commodity("Cucumber", 10, 1200));


        mCommList = (RecyclerView) findViewById(R.id.rv_billing);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mCommList.setLayoutManager(layoutManager);

        mCommList.setHasFixedSize(true);

        mAdapter = new CommRecAdapter(listOfCommodities);
        mCommList.setAdapter(mAdapter);
    }

}
