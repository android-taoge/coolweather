package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * created by：TangTao on 2018/10/8 14:19
 * <p>
 * email：xxx@163.com
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;


    public class More {
        @SerializedName("txt")
        public String info;

    }
}
