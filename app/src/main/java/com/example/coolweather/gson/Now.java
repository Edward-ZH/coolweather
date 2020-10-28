package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 张昊
 * @detail
 * @Date 2020/10/26 11:23
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
