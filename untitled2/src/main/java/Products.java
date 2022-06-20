package main.java;

public class Products {
    private
    int Idproducts;
    double price;
    String name_product;
    String manufacturer;


    public int getIdproducts() {
        return Idproducts;
    }
    public double getPrice() {
        return price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getName_product() {
        return name_product;
    }



    public void setIdproducts(int idproducts) {
        Idproducts = idproducts;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setName_product(String name_product) {
        this.name_product = name_product;
    }
    public void setPrice(double price) {
       this.price = price;
    }

}

