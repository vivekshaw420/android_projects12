package com.example.vivek.firebase_service;

/**
 * Created by vivek on 7/16/2016.
 */
public class BlogPost {
    private String device_on_off;
    private String charging_on_off;
    private String battery;
    private String time;
    private String date;
    private  String processor;
    private   String bandwidth;
    private String   ram;
    public BlogPost() {
        // empty default constructor, necessary for Firebase to be able to deserialize blog posts
    }
    //Getters and setters
    public String getDevice_on_off() {
        return device_on_off;
    }

    public void setDevice_on_off(String device_on_off) {
        this.device_on_off = device_on_off;
    }

    public String getCharging_on_off() {
        return charging_on_off;
    }

    public void setCharging_on_off(String charging_on_off) {
        this.charging_on_off = charging_on_off;
    }
    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}