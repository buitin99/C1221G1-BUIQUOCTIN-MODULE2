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

    @Override
    public String toString() {
        return "Product{" +
                "idOfProduct=" + idOfProduct +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                ", description='" + description + '\'' +
                '}';
    }
}
