package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * created by：TangTao on 2018/10/8 14:21
 * <p>
 * email：xxx@163.com
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
