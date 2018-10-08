package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * created by：TangTao on 2018/10/8 09:49
 * <p>
 * email：xxx@163.com
 */
public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceCode;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
