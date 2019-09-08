package com.example.midterm07600527;

public class Auth {
    private static final String USERNAME1 = "aaa";
    private static final String PASSWORD1 = "111";

    private static final String USERNAME2 = "bbb";
    private static final String PASSWORD2 = "222";

    private String nusername;
    private String npassword ;

    public void setUsername(String username){
        this.nusername = username;
    }

    public void setPassword(String password){
        this.npassword = password;
    }

    public String getUsername(){
        return nusername;
    }

    public String getPassword(){
        return npassword;
    }

    public int check(){
        int check = 0;
        if(nusername.equalsIgnoreCase(USERNAME1)&&(npassword.equalsIgnoreCase(PASSWORD1))){
            return check = 1;
        }else if(nusername.equalsIgnoreCase(USERNAME2)&&(npassword.equalsIgnoreCase(PASSWORD2))){
            return check = 2;
        }else{
            return check = 3;
        }
    }


}
