package 习题.工资问题;

public class TemporaryEmployee extends Employee {
    private String hireYear;
    TemporaryEmployee(){
    }
    void TemporaryEmployee(String hireYear){
        this.hireYear=hireYear;
    }

    public String getHireYear() {
        return hireYear;
    }

    public void setHireYear(String hireYear) {
        this.hireYear = hireYear;
    }
    public void raiseSalary(double salary, double proportion){
        //super.raiseSalary(proportion+0.1);
        salary+=salary*(proportion);
        System.out.println("临时工工资："+salary);
    }
}
