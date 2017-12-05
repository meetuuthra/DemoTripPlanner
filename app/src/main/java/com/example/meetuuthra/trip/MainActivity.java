package com.example.meetuuthra.trip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton AddTrip;
    RecyclerView tripContact;
    FirebaseAuth mAuth;
//    DatabaseReference dbref = FirebaseDatabase.getInstance().getReference();
    ArrayList<Trip> tripArrayList;
    DatabaseReference insref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddTrip = (ImageButton) findViewById(R.id.imageButton);
        //tripContact = (RecyclerView) findViewById(R.id.tripContact);

        AddTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, createtrip.class);
                startActivityForResult(intent, 9);
            }
        });

        /*LinearLayoutManager mLayoutManager = new LinearLayoutManager(getBaseContext());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        tripContact.setLayoutManager(mLayoutManager);

        insref = dbref.child("Trip");

        insref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ArrayList<Trip> trips = new ArrayList<Trip>();
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    Trip trip = ds.getValue(Trip.class);
                    trips.add(trip);

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK){
            Trip trip = (Trip) data.getExtras().getSerializable("get");
            tripArrayList.add(trip);
            *//*DatabaseReference update = FirebaseDatabase.getInstance().getReference().child("Users").child(user_id).child("Contacts");
            update.setValue(contactArrayList);
            adapter.notifyDataSetChanged();*//*


        }
    }

    public void FillAppsList(final List<Trip> tripList){


        ArrayList<Trip> finallist=new ArrayList<Trip>();

        if(tripList!=null){
            for(int i=0;i<tripList.size();i++){
                Log.d("insideFilllist",tripList.get(i).getTripName()+"");
                finallist.add(tripList.get(i));

            }

        }
        Log.d("finallist",finallist.toString());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getBaseContext());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        tripContact.setLayoutManager(mLayoutManager);
        //adapter = new ContactsListAdapter(this,finallist);
        //listContact.setAdapter(adapter);
    }
*/


    }
}
