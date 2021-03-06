package com.softwork.ydk.beacontestapp.FloorPlan;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DongKyu on 2016-06-14.
 */
public class FloorPlan implements Serializable{
    private String name;
    private String buildingName;
    private String description;
    private int floor;
    private double longitude;
    private double latitude;
    private Drawable floorPlanImage;

    private ArrayList<DrawingObject> objects = new ArrayList<>();

    public void FloorPlan() {

    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void addObject(DrawingObject newObject) {
        objects.add(newObject);
    }

    public ArrayList<DrawingObject> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<DrawingObject> objects) {
        this.objects = objects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Drawable getFloorPlanImage() {
        return floorPlanImage;
    }

    public void setFloorPlanImage(Drawable floorPlanImage) {
        this.floorPlanImage = floorPlanImage;
    }
}
