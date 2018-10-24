package com.example.happy.findmymus.Profile;

public class LocalProfile {

    private boolean loggedIn = true;

    public boolean isLoggedIn(){
        return loggedIn;
    }

    public boolean signUp(){
        //Returns true if sign up was successful
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
