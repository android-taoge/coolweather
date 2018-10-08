package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * created by：TangTao on 2018/10/8 14:12
 * <p>
 * email：xxx@163.com
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
