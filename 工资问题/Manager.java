package 习题.工资问题;

public class Manager extends Employee{
    private String officeID;
    private int bonus;
    Manager(){
       // super(name,number,salary);
    }
    void Manager(String name,int number,double salary,String officeID){
        this.name=name;
        this.number=number;
        this.salary=salary;
        this.officeID=officeID;
    }

    public void setOfficeID(String officeID) {
        this.officeID = officeID;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getOfficeID() {
        return officeID;
    }

    public int getBonus() {
        return bonus;
    }
    public void raiseSalary(double salary, double proportion){
        //super.raiseSalary(proportion+0.1);
        salary+=salary*(proportion);
        System.out.println("经理工资："+salary);
    }
}
