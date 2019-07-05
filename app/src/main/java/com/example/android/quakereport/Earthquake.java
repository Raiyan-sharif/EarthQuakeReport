package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;

    private String mLocation;

    private long mDate;

    public Earthquake(double magnitude, String location, long date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getDate(){
        return mDate;
    }
}
