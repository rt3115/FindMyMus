package com.example.happy.findmymus.Profile;

public class ProfileData {

    private String profileType;
    private String location;
    private String description;
    private String shortDescription;
    private String name;
    private String userName;

    private boolean L = true;

    public ProfileData(String Type, String loc, String description, String shortDescription){
        profileType = Type;
        location = loc;
        this.description = description;
        this.shortDescription = shortDescription;
    }

    public void setName(String name, String userName){
        this.name = name;
        this.userName = userName;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getUserName(){
        return this.userName;
    }

    public ProfileData(String Type, String loc){
        profileType = Type;
        location = loc;
    }

    public ProfileData(String Type){
        profileType = Type;
    }

    public String getDescription(){
        description = description + "/n Location: " + location;
        return description;
    }

    public String getLocation(){
        return location;
    }

}
