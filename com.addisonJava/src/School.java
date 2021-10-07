/**
 * Maintain teachers and students using ArrayList
 */
import java.util.List;
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int operationalFees;
    private static int totalCashIn;
    private static int totalCashOut;
    private int GL;
    
    /**
     * 
     * @param teachers
     * @param students
     */
    public School(List<Teacher> teachers, List<Student>students)throws Exception{
        this.teachers = teachers;
        this. students = students;
        totalCashIn = 0;
        totalCashOut = 0;
        this.operationalFees = 0;
    }

    /**
     * 
     * @return list of teachers
     */
    public List<Teacher> getTeachers() {
        return this.teachers;
    }
    /**
     * 
     * @param teacher add teacher to teacher arraylist
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    /**
     * 
     * @return students arraylist
     */
    public List<Student> getStudents() {
        return this.students;
    }
    /**
     * 
     * @param student add student to student arraylist
     */
    public void addStudents(Student student) {
        students.add(student);
    }
    /**
     * 
     * @param operationalFees set operational fees
     */
    public void setOperationalFees(int operationalFees){
        this.operationalFees = operationalFees;
    }
    /**
     * 
     * @return get the total cash in flow
     */
    public int getCashIn() {
        return totalCashIn;
    }
    /**
     * 
     * @param cashIn add cash in when student pay fees
     */
    public static void addCashIn(int cashIn) {
        totalCashIn += cashIn;
    }
    /**
     * 
     * @return total cash out
     */
    public int getCashOut() {
        return totalCashOut;
    }
    /**
     * 
     * @param cashOut add cash out
     */
    public static void addCashOut(int cashOut) {
        totalCashOut += cashOut;
    }
     
    public int getGL(int totalCashIn, int totalCashOut){
        return totalCashIn - totalCashOut;
    }



}
