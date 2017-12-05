package com.example.meetuuthra.trip;

/**
 * Created by meetuuthra on 12/4/17.
 */

public class Trip {

    String TripName ;
    String TripNumberofPeople ;
    String TripCost;

    public Trip() {
        this.TripName = TripName;
        this.TripNumberofPeople = TripNumberofPeople;
        this.TripCost = TripCost;
    }

    public String getTripCost() {
        return TripCost;
    }

    public void setTripCost(String tripCost) {
        TripCost = tripCost;
    }

    public String getTripNumberofPeople() {

        return TripNumberofPeople;
    }

    public void setTripNumberofPeople(String tripNumberofPeople) {
        TripNumberofPeople = tripNumberofPeople;
    }

    public String getTripName() {

        return TripName;
    }

    public void setTripName(String tripName) {
        TripName = tripName;
    }
}
