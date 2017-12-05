package com.example.meetuuthra.trip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class createtrip extends AppCompatActivity {

    ImageButton AddTrip;
    RecyclerView jsonList;
    FirebaseAuth mAuth;
    DatabaseReference dbref = FirebaseDatabase.getInstance().getReference();
    ArrayList<Trip> contactArrayList;
    ArrayList<Place> places;
    DatabaseReference insref;
    PlaceListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createtrip);

        jsonList = (RecyclerView) findViewById(R.id.jsonList);



        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getBaseContext());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        jsonList.setLayoutManager(mLayoutManager);

        insref = dbref.child("Deals");

        dbref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.d("demo","demo1");
                //trips.clear();
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    Place place;
                    Log.d("demo", String.valueOf(data));
                    place=new Place(data.child("Place").getValue().toString(),data.child("Duration").getValue().toString(),data.child("Location").child("Lat").getValue().toString(),data.child("Location").child("Lon").getValue().toString(),data.child("Cost").getValue().toString());
                    Log.d("places",place.toString());
                    places.add(place);



                }
                FillAppList(places);

                //Log.d("demo trips", String.valueOf(trips.size()));
                //assignRecyclerView();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    public void FillAppList(final List<Place> placeList){


        ArrayList<Place> finallist=new ArrayList<Place>();

        if(placeList!=null){
            for(int i=0;i<placeList.size();i++){
                Log.d("insideFilllist",placeList.get(i).getPlaceName()+"");
                finallist.add(placeList.get(i));

            }

        }
        Log.d("finallist",finallist.toString());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getBaseContext());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        jsonList.setLayoutManager(mLayoutManager);
        adapter = new PlaceListAdapter(this,finallist);
        jsonList.setAdapter(adapter);
    }

}
