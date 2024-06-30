package utilities;

//teacher details: name,id,salary
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    Teacher(int id,String name,int salary)  {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }

   
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void  receivedSalary(int salary)
    {
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

}
