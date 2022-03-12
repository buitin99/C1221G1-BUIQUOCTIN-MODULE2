package s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.util;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;
import s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSVToFile {
    public static List<Product> readDataFromFile(String path){
        List<Product> productList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return productList;
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}