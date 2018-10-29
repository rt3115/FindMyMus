package com.example.happy.findmymus.Profile;

import android.media.Image;

public class LocalProfile {

    private boolean loggedIn = false; //defualt false until the user logs in for the first time
    private ProfileData profile;

    public boolean isLoggedIn(){
        return loggedIn;
    }

    public boolean signUp(String name, String userName, String password){
        //Returns true if sign up was successful

        if(checkUserName(userName)){
            profile = new ProfileData(name, userName, password);
        }else {
            return false;
        }
        return true;
    }

    public boolean setUpDescription(String description, Image ProfilePicture, String location)
    {   //If setup is successful returns true
        //TO-DO add code to add to the description, profile picture and location
        return false;
    }

    public boolean setUpProfileInformation(String gender, int age)
    {   //If setup is successful returns true
        //TO-DO add code to add profile information to a newly created profile
        if(age < 18){
            return false;
        }

        return false;
    }

    public boolean logIn(String name, String password){
        //Returns true if log in was successful
        return false;
    }

    private boolean checkUserName(String name){
        //At some point will have to check all username to make sure it is original, no duplicates
        return true;
    }

}
