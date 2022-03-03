package case_study.service;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeServiceImpl {

    ArrayList<EmployeeServiceImpl> staffs = new ArrayList<>();
    public EmployeeServiceImpl() {

    }

    public EmployeeServiceImpl(String nameOfStaff, int ageOfStaff, double salaryOfStaff) {
    }
   public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên : ");
        String nameOfStaff = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên : ");
        int ageOfStaff = scanner.nextInt();
        System.out.println("Nhập lương nhân viên : ");
        double salaryOfStaff = scanner.nextDouble();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl(nameOfStaff, ageOfStaff, salaryOfStaff);
        staffs.add(employeeService);
        }
        public void display(){
            for (int i = 0; i < staffs.size(); i ++ ) {
                System.out.println();
            }
        }

}
