package main.java;

public class Manufacturer {
    private
    int IdManufacturer;
    String Name_manufacturer;
    String Location;

    public int getIdManufacturer() {
        return IdManufacturer;
    }

    public String getName_manufacturer() {
        return Name_manufacturer;
    }

    public String getLocation() {
        return Location;
    }

    public void setIdManufacturer(int IdManufacturer) {
        this.IdManufacturer = IdManufacturer;
    }
    public void setName_manufacturer(String Name_manufacturer){
        this.Name_manufacturer = Name_manufacturer;
    }

    public void setLocation(String location) {
        this.Location = Location;
    }
}

