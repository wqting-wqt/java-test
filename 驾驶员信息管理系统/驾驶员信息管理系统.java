package textbook.习题.驾驶员信息管理系统;


import java.util.Scanner;

/*
抽象类与抽象方法的生命格式如下：
    abstract class 类名{          //抽象类
    成员变量;
    成员方法（）{方法体}
    abstract 成员方法（）;         //抽象方法

    举例：
    public abstract  class User {
    private String name;
    private String id;
    private String password;
    public abstract boolean login(String id，String password);

 */
abstract class Driver{
     String name;
    abstract void drives();
    public void drives(String name){
        this.name=name;
    }
}
class FemaleDriver extends Driver {
    public  FemaleDriver(String name) {
        this.name=name;
    }
    public void drives(){                  //方法覆盖
        //String name = new String();
        System.out.println( name +" (Female) drives a car.");
    }
}
class MaleDriver extends Driver {
    public  MaleDriver(String name) {
        this.name=name;
    }
    public void drives() {                  //方法覆盖
       // String name = new String();
        System.out.println(name+" (Male) drives a car.");
    }
}
public class 驾驶员信息管理系统 {
    public static void main(String[]args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("请输入女司机的姓名： ");
        String n1 = sc.next();
        System.out.println("请输入男司机的姓名： ");
        String n2 = sc.next();
        //femaleDriver=n1;
        FemaleDriver femaleDriver = new FemaleDriver(n1);
        MaleDriver maleDriver = new MaleDriver(n2);
        femaleDriver.drives();
        maleDriver.drives();
    }

}
