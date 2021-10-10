
public class Student {

    private int id;
    private String name;
    private int grade;
    private int tuitionPaid;
    private int tuitionDue;

    
    /**
     * Student Constructor
     * @param id student id
     * @param name student name
     * @param grade grade level
     * @throws Exception
     */
    public Student (int id, String name, int grade) throws Exception{
        this.id = id;
        this.name = name;
        this.grade = grade;
        tuitionPaid = 0;
        tuitionDue = 20000;
    }

     /**
      * update the grade of students
      * @param grade new grade of student
      */   
    public void setGrade (int grade){
        this.grade = grade;
    }

    /**
     * 
     * @param fees the fees paid
     */
    public void payTuition(int fees){
        tuitionPaid += fees;
        School.addCashIn(tuitionPaid);
    }

    /**
     * Getters
     * @return student id, name, grade, tuition paid, tuition due
     */

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getTuitionPaid() {
        return this.tuitionPaid;
    }

    public int getTuitionDue() {
        return this.tuitionDue;
    }
    @Override
    public String toString(){
        return "Student name is "+ name +
                "Total tutition paid: " + tuitionPaid;
    }

}

