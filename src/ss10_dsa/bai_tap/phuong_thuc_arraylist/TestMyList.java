package ss10_dsa.bai_tap.phuong_thuc_arraylist;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student a = new Student(1,"Tin1");
            Student b = new Student(2,"Tin2");
            Student c = new Student(3,"Tin3");
            Student d = new Student(4,"Tin4");
            Student e = new Student(5,"Tin5");
            Student f = new Student(6,"Tin6");
            Student g = new Student(7,"Tin7");

            MyList<Student> studentMyList = new MyList<>();
            MyList<Student> newMyList = new MyList<>();
            studentMyList.add(a);
            studentMyList.add(b);
            studentMyList.add(c);
            studentMyList.add(d);
            studentMyList.add(e);
            studentMyList.add(f);
            studentMyList.add(g);

            System.out.println(studentMyList.get(2).getName());
            System.out.println(studentMyList.contains(g));

            newMyList = studentMyList.clone();
            Student student = newMyList.remove(0);
            System.out.println(student.getName());
            System.out.println(newMyList.indexOf(c));
        }
    }
}
