package main.java;

public class Personal_data {
    private
    int IdPersonal_data;
    String last_name;
    String first_name;
    int phone_number;
    String street;
    int house;

    public int getIdPersonal_data() {
        return IdPersonal_data;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public int getPhone_number() {
        return phone_number;
    }
    public String getStreet() {
        return street;
    }
    public int getHouse() {
        return house;
    }


    public void setIdPersonal_data(int idPersonal_data) {
        IdPersonal_data = idPersonal_data;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHouse(int house) {
        this.house = house;
    }
}

