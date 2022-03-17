package case_study.utils;
import java.util.List;

public interface IReadAndWriteCSV {
    void writeFile(String pathFile, String line);
    List<String> readFile(String pathFile);
}
