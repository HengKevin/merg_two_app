package com.samples.flironecamera;

import android.graphics.Bitmap;

import java.util.ArrayList;

public class people_face_array {
    private String Id;
    private Bitmap Image;
    private String Name;
    private float distance;
    private ArrayList<Float> face;
    private String title;

   public people_face_array (String Id,String Name, float distance,ArrayList<Float> face,String title){
        this.Id=Id;
        this.Name=Name;
        this.distance=distance;
        this.face=face;
        this.title=title;

    }


    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public float getDistance() {
        return distance;
    }

    public ArrayList<Float> getFace() {
        return face;
    }

    public String getTitle() {
        return title;
    }
}
