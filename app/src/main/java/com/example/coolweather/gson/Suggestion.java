package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 张昊
 * @detail
 * @Date 2020/10/26 11:26
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfot comfot;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfot {
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
