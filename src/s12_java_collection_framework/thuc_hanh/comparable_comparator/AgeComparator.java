package s12_java_collection_framework.thuc_hanh.comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge().equals(o2.getAge())){
            return 0;
        }else{
            return -1;
        }
    }
}

