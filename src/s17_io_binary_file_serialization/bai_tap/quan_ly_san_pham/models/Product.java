package s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.models;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    protected int idOfProduct;
    protected String nameOfProduct;
    protected String manufacturer;
    protected double priceOfProduct;
    protected String description;

    public Product() {
    }

    public Product(int idOfProduct, String nameOfProduct, String manufacturer, double priceOfProduct, String description) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.manufacturer = manufacturer;
        this.priceOfProduct = priceOfProduct;
        this.description = description;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id : ");
        idOfProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name : ");
        nameOfProduct = scanner.nextLine();
        System.out.println("Enter Manufacturer : ");
        manufacturer = scanner.nextLine();
        System.out.println("Enter Price : ");
        priceOfProduct = scanner.nextDouble();
        System.out.println("Enter Description : ");
        description = scanner.nextLine();
    }

    public void display(){
        System.out.println(this);
    }

    public String getInfoToCSV(){
        return this.idOfProduct+","+this.nameOfProduct+","+this.manufacturer+","+this.priceOfProduct+","+this.description;
    }
}
