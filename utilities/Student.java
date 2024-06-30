package utilities;


//this class is responsible for keeping the track of student's name,fee,id
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name,int grade)
    {
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=30000;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public int getFeesPaid() {
        return feesPaid;
    }
    
    public int getFeesTotal() {
        return feesTotal;
    }
    
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    public void updatefeePaid(int fees)
    {

        feesPaid=feesPaid+fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
     
    public int getRemainingFees()
    {
        return feesTotal-feesPaid;
    }
}