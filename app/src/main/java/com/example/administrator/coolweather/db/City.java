package com.example.administrator.coolweather.db;

/**
 * Created by Administrator on 2017/10/22.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//市名
    private int cityCode;//城市的代号
    private int provinceId;//所在省的id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(String CityName){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public  int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
