package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_java;

import ss5_access_modifier_static_method_static_property.thuc_hanh.students.Student;

public class Students {
    private String name = "john";
    private String classes = "CO2";

    public Students() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
