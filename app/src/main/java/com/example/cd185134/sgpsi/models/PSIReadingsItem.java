package com.example.cd185134.sgpsi.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * data model for Pollutant Standards Index readings
 * this data contain PSI data per region
 * Created by cherrie on 5/23/2018.
 */

public class PSIReadingsItem implements Parcelable, PSIReadingItemRegion {
    public static final String WEST = "west";
    public static final String NATIONAL = "national";
    public static final String EAST = "east";
    public static final String CENTRAL = "central";
    public static final String SOUTH = "south";
    public static final String NORTH = "north";
    @SerializedName(WEST)
    private double west;
    @SerializedName(NATIONAL)
    private double national;
    @SerializedName(EAST)
    private double east;
    @SerializedName(CENTRAL)
    private double central;
    @SerializedName(SOUTH)
    private double south;
    @SerializedName(NORTH)
    private double north;

    public PSIReadingsItem() {
    }

    private PSIReadingsItem(Parcel in) {
        west = in.readDouble();
        national = in.readDouble();
        east = in.readDouble();
        central = in.readDouble();
        south = in.readDouble();
        north = in.readDouble();
    }

    public static final Creator<PSIReadingsItem> CREATOR = new Creator<PSIReadingsItem>() {
        @Override
        public PSIReadingsItem createFromParcel(Parcel in) {
            return new PSIReadingsItem(in);
        }

        @Override
        public PSIReadingsItem[] newArray(int size) {
            return new PSIReadingsItem[size];
        }
    };

    public double getWest() {
        return west;
    }

    public void setWest(double west) {
        this.west = west;
    }

    public double getNational() {
        return national;
    }

    public void setNational(double national) {
        this.national = national;
    }

    public double getEast() {
        return east;
    }

    public void setEast(double east) {
        this.east = east;
    }

    public double getCentral() {
        return central;
    }

    public void setCentral(double central) {
        this.central = central;
    }

    public double getSouth() {
        return south;
    }

    public void setSouth(double south) {
        this.south = south;
    }

    public double getNorth() {
        return north;
    }

    public void setNorth(double north) {
        this.north = north;
    }

    @Override
    public double getData(String region) {
        switch (region) {
            case WEST:
                return west;
            case NATIONAL:
                return national;
            case CENTRAL:
                return central;
            case EAST:
                return east;
            case SOUTH:
                return south;
            case NORTH:
                return north;
            default:
                return 0.0;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(west);
        dest.writeDouble(national);
        dest.writeDouble(east);
        dest.writeDouble(central);
        dest.writeDouble(south);
        dest.writeDouble(north);
    }
}
