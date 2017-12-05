package com.example.meetuuthra.trip;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meetuuthra on 12/4/17.
 */

public class PlaceListAdapter extends RecyclerView.Adapter<PlaceListAdapter.MyViewHolder> {

    public List<Place> placeList;
    public Context mContext;

    public PlaceListAdapter(Context context, ArrayList<Place> placeList) {
        this.placeList = placeList;
        this.mContext = context;
    }



    @Override
    public PlaceListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.placerowlayout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PlaceListAdapter.MyViewHolder holder, int position) {
        final Place place = placeList.get(position);

        holder.placeName.setText(place.getPlaceName());
        holder.placeCost.setText(place.getCost());


    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView placeName,placeCost;

        public MyViewHolder(View itemView) {
            super(itemView);

            placeName = (TextView) itemView.findViewById(R.id.tVPlaceName);
            placeCost = (TextView) itemView.findViewById(R.id.tVCost);
        }
    }
}
