package com.app.ws.ts.wsss.Model;


import com.google.gson.annotations.SerializedName;

public class Usuario {

    @SerializedName("name")
    public String name;
    @SerializedName("login")
    public String login;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
