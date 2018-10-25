package com.example.happy.findmymus.Profile;

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

    public boolean logIn(String name, String password){
        //Returns true if log in was successful
        return false;
    }

    private boolean checkUserName(String name){
        //At some point will have to check all username to make sure it is original, no duplicates
        return true;
    }

}
