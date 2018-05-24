package com.example.cd185134.sgpsi.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * data model for Pollutant Standards Index
 * Created by cherrie on 5/23/2018.
 */

public class PSI implements Parcelable {
    @SerializedName("region_metadata")
    private List<RegionMetadata> regionMetadata;
    @SerializedName("items")
    private List<PSIItem> psiItems;
    @SerializedName("api_info")
    private ApiInfo apiInfo;

    public PSI() {
    }

    private PSI(Parcel in) {
        regionMetadata = in.createTypedArrayList(RegionMetadata.CREATOR);
        psiItems = in.createTypedArrayList(PSIItem.CREATOR);
        apiInfo = in.readParcelable(ApiInfo.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(regionMetadata);
        dest.writeTypedList(psiItems);
        dest.writeParcelable(apiInfo, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PSI> CREATOR = new Creator<PSI>() {
        @Override
        public PSI createFromParcel(Parcel in) {
            return new PSI(in);
        }

        @Override
        public PSI[] newArray(int size) {
            return new PSI[size];
        }
    };

    public List<RegionMetadata> getRegionMetadata() {
        return regionMetadata;
    }

    public List<PSIItem> getPsiItems() {
        return psiItems;
    }

    private static class ApiInfo implements Parcelable {
        @SerializedName("status")
        private String status;

        public ApiInfo() {
        }

        ApiInfo(Parcel in) {
            status = in.readString();
        }

        public static final Creator<ApiInfo> CREATOR = new Creator<ApiInfo>() {
            @Override
            public ApiInfo createFromParcel(Parcel in) {
                return new ApiInfo(in);
            }

            @Override
            public ApiInfo[] newArray(int size) {
                return new ApiInfo[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(status);
        }
    }
}
