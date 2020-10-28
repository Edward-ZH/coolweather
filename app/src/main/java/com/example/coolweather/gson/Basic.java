package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 张昊
 * @detail
 * @Date 2020/10/26 11:14
 */
public class Basic {
    @SerializedName("city")    //采用注解的方式来让JSON字段和Java字段之间建立映射关系
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
