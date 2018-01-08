package com.app.ws.ts.wsss.Model;


import com.google.gson.annotations.SerializedName;

public class data extends Endereco {


    @SerializedName("id")
    public  int     id;

    @SerializedName("type")
    public  String type;

    @SerializedName("attributes")
    private Endereco Endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Endereco getAttributes() {
        return Endereco;
    }

    public void setAttributes(Endereco attributes) {
        this.Endereco = attributes;
    }
}
