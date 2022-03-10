package s16_io_text_file.bai_tap.country;

import java.io.*;

public class TestCountry {

    public static void writeToFile() {
        try {
            FileWriter fw = new FileWriter("src\\s16_io_text_file\\bai_tap\\country\\Country.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src\\s16_io_text_file\\bai_tap\\country\\Country.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
