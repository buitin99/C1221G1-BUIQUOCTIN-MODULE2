package s16_io_text_file.thuc_hanh.tinh_tong_cac_so_file.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class ReadFileExample {

    public void readFileText(String filePath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File("D:\\codegym\\module2\\src\\s16_io_text_file\\thuc_hanh\\tinh_tong_cac_so_file\\numbers\\numbers");

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader("D:\\codegym\\module2\\src\\s16_io_text_file\\thuc_hanh\\tinh_tong_cac_so_file\\numbers\\numbers"));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText("D:\\codegym\\module2\\src\\s16_io_text_file\\thuc_hanh\\tinh_tong_cac_so_file\\numbers\\numbers");
    }
}