//package common;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FileUtils {
//
//    public void writeFile(String pathFile, String line){
//        try {
//            FileWriter fileWriter = new FileWriter(pathFile,true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<String> readFile(String pathFile) {
//        java.util.List<String> listline = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(pathFile);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
