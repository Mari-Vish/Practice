package main.java;

import java.sql.Statement;
import java.util.*;
import java.sql.*;
import main.java.Products;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database_provider
{
    private int MaxIncrement;

    public int AddProducts(Products product) throws ClassNotFoundException
    {

        String PracticeUrl = "jdbc:mysql://localhost:3306/super_market?useSSL=false";
        String INSERT_USERS_SQL = "INSERT INTO products" +
                "(idProducts, name, price, manufacturer) VALUES"+
                "(?,?,?,?);";
        int result = 0;
        //Class.forName("com.mysql.jdbc.Driver");


        try (Connection connection = DriverManager.getConnection(PracticeUrl, "root", "227722");

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {

            //preparedStatement.setInt(1, 1);
            preparedStatement.setInt(1, product.getIdproducts());
            preparedStatement.setString(2, product.getName_product());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setString(4, product.getManufacturer());

            System.out.println(preparedStatement);

            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException e) { }

    public ArrayList<Products> GetFromDb()throws ClassNotFoundException{

        String PracticeUrl = "jdbc:mysql://localhost:3306/super_market";
        //Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT * FROM products";

        ArrayList<Products> ProductsList  = new ArrayList<Products>();
        Products  product = new Products ();

        try(Connection connection = DriverManager.getConnection(PracticeUrl, "root", "227722")){

            Statement st = connection.createStatement();

            ResultSet rs= st.executeQuery(query);

            while (rs.next()){
                MaxIncrement++;
                product.setIdproducts(rs.getInt("idProducts"));
                product.setName_product(rs.getString("name"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setPrice(rs.getDouble("price"));

                System.out.print(rs.getInt("idProducts")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.print(rs.getString("manufacturer")+" ");
                System.out.println(rs.getDouble("price"));

                ProductsList.add(rs.getInt("idProducts")-1,product);
            }
            //System.out.println(flower.getFlowerID());
            st.close();

        }catch (SQLException e){
            // process sql exception
            printSQLException(e);
        }

        return ProductsList ;
    }

    public  int UpdateProduct(Products  product) throws  ClassNotFoundException{
        int result=0;
        String PracticeUrl = "jdbc:mysql://localhost:3306/super_market?useSSL=false";

        try {
            Connection connection = DriverManager.getConnection(PracticeUrl, "root", "227722");
            Statement myStmt = connection.createStatement();


            String updSql = "update products"
                    +" set name='"+product.getName_product()+"',"
                    +"manufacturer='"+product.getManufacturer()+"',"
                    +"price='"+ product.getPrice()+"'"
                    +" where idProducts='"+ product.getIdproducts()+"'";

            result = myStmt.executeUpdate(updSql);
            System.out.println("Update complete");

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public int DeleteProducts(Products product) throws  ClassNotFoundException{
        int result=0;

        String PracticeUrl = "jdbc:mysql://localhost:3306/super_market?useSSL=false";
        try{
            String query = "SELECT * FROM products";
            Connection connection = DriverManager.getConnection(PracticeUrl, "root", "227722");
            Statement myStmt = connection.createStatement();
            ResultSet rs= myStmt.executeQuery(query);

            while (rs.next()){
            }

            String delsql= "delete from products where name='"+ product.getName_product()+"'";
            result = myStmt.executeUpdate(delsql);
            String AIncsql= "AUTO_INCREMENT ='"+MaxIncrement+"'";
            System.out.println("Rows Affected:"+result);
            System.out.printf("Delete Complete");

        }catch ( Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}

