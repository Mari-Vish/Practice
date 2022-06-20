package main.java;

//import main.java.controllers.Database_Provider;
import java.util.ArrayList;
import java.util.Scanner;


class Main {
    public static void main(String[]args) throws InterruptedException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);

        Main mainProvider = new Main();
        Database_provider Provider_db = new Database_provider();

        ArrayList<Products> ProductsList = new ArrayList<Products>();
        Products product = new Products();

        try {
                ProductsList = Provider_db.GetFromDb();
                System.out.println("Input new product(id, name, manufacturer, price)");
                product.setIdproducts(in.nextInt());
                product.setName_product(check1());
                //in.next();
                product.setManufacturer(check1());
                //in.next();
                product.setPrice(check());
                Provider_db.AddProducts(product);

            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        try {
            System.out.println("Input Id of updating products");
            product.setIdproducts(in.nextInt());
            System.out.println("Input Name of updating products");
            product.setName_product(check1());
            System.out.println("Input Manufacturer of updating products");
            product.setManufacturer(check1());
            System.out.printf("Input Price of updating products");
            product.setPrice(check());
            Provider_db.UpdateProduct(product);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        try {
            System.out.printf("Input name of deleting product");
            product.setName_product(check1());
            Provider_db.DeleteProducts(product);
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }


    public static double check(){
        double price=0.0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.hasNextDouble()) {

                return scan.nextDouble();
            } else {
                scan.next();
                System.out.println("input price");
                String s = scan.nextLine();
            }
        }
    }
    public static String check1(){
       // double price=0.0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.hasNextLine()) {

                return scan.nextLine();
            } else {
                scan.next();
                System.out.println("input number!");
                String s = scan.nextLine();
            }
        }
    }
}
