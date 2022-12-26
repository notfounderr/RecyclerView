package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_cookie_24, "Food", "Cookie"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sports_esports_24, "Computer", "Games"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_directions_car_24, "Transport", "Car"));
    }
}