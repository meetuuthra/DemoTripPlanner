package com.example.meetuuthra.trip;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TripListAdapter extends AppCompatActivity {

    public List<Trip> TList;
    public Context mContext;

    public TripListAdapter(Context context, ArrayList<Trip> TList) {
        this.TList = TList;
        this.mContext = context;
    }



}
