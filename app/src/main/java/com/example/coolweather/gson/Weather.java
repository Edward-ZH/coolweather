package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author 张昊
 * @detail
 * @Date 2020/10/26 11:40
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
