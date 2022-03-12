package s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.controller;

import collection_review.model.Experience;
import s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.models.Product;
import s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.util.ReadAndWriteCSVToFile;
import sun.dc.pr.PRError;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    final static String PRODUCT_SOURCE_FILE = "src\\s17_io_binary_file_serialization\\bai_tap\\quan_ly_san_pham\\data\\ProductData.csv";
    static  List<Product> productList = new ArrayList<>();
        public void add() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Id : ");
            int idOfProduct = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Name : ");
            String nameOfProduct = scanner.nextLine();
            System.out.println("Enter Manufacturer : ");
            String manufacturer = scanner.nextLine();
            System.out.println("Enter Description : ");
            String description = scanner.nextLine();
            System.out.println("Enter Price : ");
            Double priceOfProduct = scanner.nextDouble();
            productList.add(new Product(idOfProduct,nameOfProduct,manufacturer,priceOfProduct,description));
            ReadAndWriteCSVToFile.writeToFile(PRODUCT_SOURCE_FILE,productList);
        }


        public void display() {
            for (Product pr : productList){
                System.out.println(pr);
            }
        }

        public void search() {
            Scanner scanner = new Scanner(System.in);
            List<Product> productList1 = ReadAndWriteCSVToFile.readDataFromFile(PRODUCT_SOURCE_FILE);
            System.out.println("Enter name product to find!");
            String nameProductToFind = scanner.nextLine();
            for (Product pr : productList1) {
                if (pr.getNameOfProduct().contains(nameProductToFind)) {
                    System.out.println(pr);
                } else {
                    System.out.println("Not found Product!");
                }
            }
        }

}


