package ss5_access_modifier_static_method_static_property.thuc_hanh.students;

import ss5_access_modifier_static_method_static_property.thuc_hanh.students.Student;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
