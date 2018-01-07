package com.app.ws.ts.wsss.Model;


import com.google.gson.annotations.SerializedName;

public class Date{

    public Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

class Data {

    @SerializedName("id")
    public  int     id;
    @SerializedName("type")
    public  String type;
    @SerializedName("attributes")
    public attributes atrib;

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

    public attributes getAtrib() {
        return atrib;
    }

    public void setAtrib(attributes atrib) {
        this.atrib = atrib;
    }
}
class attributes{
    @SerializedName("street")
    public String street;
    @SerializedName("neighborhood")
    public String neighborhood;
    @SerializedName("complement")
    public String complement;
    @SerializedName("city")
    public String city;
    @SerializedName("state")
    public String state;
    @SerializedName("zipcode")
    public String zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}