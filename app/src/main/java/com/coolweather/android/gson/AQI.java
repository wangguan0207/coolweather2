package com.coolweather.android.gson;

/**
 * Created by 斯凯 on 2018/4/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
