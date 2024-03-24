package 习题.工资问题;

public class test {
    public static void main(String[] args){
        Employee employee=new Employee();
        Manager manager=new Manager();
        TemporaryEmployee temporaryEmployee=new TemporaryEmployee();
        /*
        employee.name="Lucy";
        employee.number=001;
        employee.address="England";
        employee.salary=10000;
        System.out.println("员工名字： " +employee.name+"\n员工编号： "+employee.number+"\n员工地址： " +employee.address+"\n员工工资： " +employee.salary);
        System.out.println("---------------------------------------------");
         */
        /*更简洁地表达*/
        employee.message("lucy",001,"England",10000);
        System.out.println("---------------------------------------------");
        manager.message2("lily",101,"England");
        manager.raiseSalary(10000,0.1);
        System.out.println("---------------------------------------------");
        temporaryEmployee.message2("mike",1001,"UK");
        temporaryEmployee.raiseSalary(10000,0.5);
       // temporaryEmployee.raiseSalary(10000,0.5);

    }
}
