package me.ryanmiles.rain;

/**
 * Created by ryan on 5/29/17.
 */

public class Place {
    private double latitude;
    private double longitude;
    private String name;
    private int weather;


    public Place(double latitude, double longitude, String name, int weather) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.weather = weather;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }
}
