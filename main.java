import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        Teacher anna = new Teacher(1, "Anna Piers", 2500);
        Student miranda = new Student(1, "Miranda Venessa", 12);
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        teacherList.add(anna);
        studentList.add(miranda);

        School uocSchool = new School(teacherList,studentList);
        miranda.payTuition(5000);
        System.out.println("school has cash in of "+ uocSchool.getCashIn());
        anna.receiveSalary(anna.getSalary());
        System.out.println("school has cash out of "+ uocSchool.getCashOut());
        System.out.println("School G/L: "+ uocSchool.getGL(uocSchool.getCashIn(),uocSchool.getCashOut()));
    }
}
