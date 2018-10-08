package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * created by：TangTao on 2018/10/8 14:26
 * <p>
 * email：xxx@163.com
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;


    @SerializedName("cond")
    public More more;


    public class Temperature {
        public String max;
        public String min;
    }


    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
