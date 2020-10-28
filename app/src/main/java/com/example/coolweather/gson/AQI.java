package com.example.coolweather.gson;

/**
 * @author 张昊
 * @detail
 * @Date 2020/10/26 11:20
 */
public class AQI {
    public AQICity city;
    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
