

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Teacher Constructor
     * @param id employee id
     * @param name  teacher's name
     * @param salary teacher's salary
     */
    public Teacher(int id, String name, int salary)throws Exception{
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * 
     * @return employee id
     */
    public int getId(){
        return this.id;
    }
    /**
     * 
     * @return teacher's salary
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * 
     * @return teacher's name
     */
    public String getName(){
        return this.name;
    }
    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.addCashOut(salaryEarned);
    }
    @Override
    public String toString(){
        return "Teacher name is "+ name +
                "Total salary paid: " + salaryEarned;
    }
}
