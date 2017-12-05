package com.example.meetuuthra.trip;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

/**
 * Created by meetuuthra on 12/4/17.
 */

public class Place implements Parcelable, Serializable{

    private String placeName;
    private String duration;
    private String latitude;
    private String longitude;
    private String cost;

    protected Place(Parcel in) {
        placeName = in.readString();

        latitude = in.readString();
        longitude = in.readString();
        cost=in.readString();

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(placeName);
        dest.writeString(duration);

        dest.writeString(latitude);
        dest.writeString(longitude);
        dest.writeString(cost);


    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Place> CREATOR = new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    public Place(String placeName,String duration, String latitude, String longitude,String cost) {
        this.placeName = placeName;
        this.duration=duration;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cost=cost;
    }

    public Place() {

    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeName='" + placeName + '\'' +
                ", duration='" + duration + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
