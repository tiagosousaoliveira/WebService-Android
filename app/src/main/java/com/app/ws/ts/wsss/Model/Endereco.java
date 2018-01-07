package com.app.ws.ts.wsss.Model;


import com.google.gson.annotations.SerializedName;

public class Endereco {

    @SerializedName("street")
    public String street;
    @SerializedName("login")
    public String login;


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
