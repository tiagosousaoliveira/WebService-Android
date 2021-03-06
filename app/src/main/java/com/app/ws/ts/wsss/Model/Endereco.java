package com.app.ws.ts.wsss.Model;


import com.google.gson.annotations.SerializedName;

public class Endereco {

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
