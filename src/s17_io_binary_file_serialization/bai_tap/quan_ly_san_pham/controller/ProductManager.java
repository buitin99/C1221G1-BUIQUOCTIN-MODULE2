package s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.controller;

import s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.models.Product;
import sun.dc.pr.PRError;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager extends Product {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Bánh","ABC",20000,"New"));
        productList.add(new Product(2,"Sữa","Vinamilk",10000,"Old"));
        productList.add(new Product(3,"Kem","Thủ đô",5000,"Sold Out"));
        productList.add(new Product(4,"Choccobie","ABC",30000,"New"));
        productList.add(new Product(5,"Sửa chua","Vinamilk",22000,"New"));
        writeObjectListProductToFile("src\\s17_io_binary_file_serialization\\bai_tap\\quan_ly_san_pham\\data\\Product.csv",productList);
        for (Product product : productList){
            System.out.println(product.getIdOfProduct()+","+product.getNameOfProduct()+","+product.getPriceOfProduct()+","+product.getDescription());
        }
    }
        public static void writeObjectListProductToFile(String s, List<Product> productList){
            File file = new File ("src\\s17_io_binary_file_serialization\\bai_tap\\quan_ly_san_pham\\data\\Product.csv");
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            try{
                fileOutputStream = new FileOutputStream(file);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(productList);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    fileOutputStream.close();
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public static List<Product> readObjectToListProduct(){
            List<Product> productList = new ArrayList<>();
            File file = new File("src\\s17_io_binary_file_serialization\\bai_tap\\quan_ly_san_pham\\data\\Product.csv");
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            try {
                if (file.length()>0){
                    fileInputStream = new FileInputStream(file);
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    productList = (List<Product>) objectInputStream.readObject();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fileInputStream != null){
                        fileInputStream.close();
                        objectInputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return productList;
        }

}
