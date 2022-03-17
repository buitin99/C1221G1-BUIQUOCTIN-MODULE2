package case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV implements IReadAndWriteCSV {
    @Override
    public void writeFile(String pathFile, String line){
        try {
            FileWriter fileWriter = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> readFile(String pathFile) {
        List<String> listline = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                listline.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listline;
    }
}
