package 习题.工资问题;

public class Employee {
    protected String name;

    protected int number;
    protected String address;
    protected double salary;
    Employee(){
    }

    public Employee(String name, int number, double salary) {
    }

    void Employee(String name,int number,double salary){
        this.name=name;
        this.number=number;
        this.salary=salary;
    }
    public void message(String name,int number,String address,double salary){
        System.out.println("员工名字： " +name+"\n员工编号： "+number+"\n员工地址： " +address+"\n员工工资： " +salary);
    }
    public void message2(String name,int number,String address){
        System.out.println("员工名字： " +name+"\n员工编号： "+number+"\n员工地址： " +address);
    }
    public void raiseSalary(double salary, double proportion){
      salary+=salary*(proportion);
      System.out.println("员工工资："+salary);
    }
}
