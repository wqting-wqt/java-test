package textbook.习题.公交交通管理系统;

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

    接口：
    interface PCI{                                            //接口
    void setName(String s);
    void run();
}
class VideoCard implements PCI{                           //类实现了前面的PCI接口
    String name="微星";
    public void setName(String s){
        name=s;
    }
    public void run(){
        System.out.println(name+"显卡已开始工作!");
    }
}

 */
abstract class MotorVehicles{
    String stop;
    abstract void brake(String s);
}
interface MoneyFare{
    //String fare = null;
    void charge(String c);
}
interface ControlTemperature{
    void controlAirTemperature(String t);
}
class Bus extends MotorVehicles implements MoneyFare{
      String b;
    public Bus(String b){
        this.b=b;
    }
    void brake(String s) {
        System.out.println("公交车采用的刹车技术： "+s);
    }
    public void charge(String c){
        System.out.println("公交车采用的车票价： "+c+"元/张，不计算公里数");
    }
}
class Taxi extends MotorVehicles implements MoneyFare,ControlTemperature{
    String t;
    public Taxi(String t){
        this.t=t;
    }
    @Override
    void brake(String s) {
        System.out.println("出租车采用的刹车技术： "+s);
    }

    @Override
    public void charge(String c) {
        System.out.println("出租车采用的车票价： "+c+"元/张，不计算公里数");
    }

    @Override
    public void controlAirTemperature(String t) {
        System.out.println("出租车安装了"+t+"空调");
    }
}
public class 公交系统 {
    public static void main(String[]args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("请输入公交车采用的刹车技术和车票价： ");
        String n1 = sc.next();
        String n2=sc.next();
        System.out.println("请输入出租车采用的刹车技术、车票价和安装的空调样式： ");
        String n3 = sc.next();
        String n4=sc.next();
        String n5=sc.next();
        Bus bus=new Bus(n1);
        bus.brake(n1);
        bus.charge(n2);
        Taxi taxi=new Taxi(n3);
        taxi.brake(n3);
        taxi.charge(n4);
        taxi.controlAirTemperature(n5);

    }
}
