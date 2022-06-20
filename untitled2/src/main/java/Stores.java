package main.java;

public class Stores {
    private
    int IdStores;
    String street;
    String house;
    int Personal_data;

    public int IdStores() {
        return IdStores;
    }
    public String getstreet() {
        return street;
    }
    public String gethouse() {
        return house;
    }
    public int getPersonal_data() {
        return Personal_data;
    }


    public void setIdStores(int idStores) {
        IdStores = idStores;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setPersonal_data(int personal_data) {
        Personal_data = personal_data;
    }
}

