package 习题.手机使用SIM卡;

public class test {
    public static void main(String[] args){
        MobilePhone mobilePhone=new MobilePhone();
        SIM sm=new SIMofChinaMobile();
        SIM su=new SIMofChinaUnicom();
        sm.setNumber("12356");
        //System.out.println("该手机号为："+sm.getCorpName());
        mobilePhone.useSIM(sm);
        mobilePhone.showMess();
        su.setNumber("15422");
        //System.out.println("该手机号为："+su.getCorpName());
        mobilePhone.useSIM(su);
        mobilePhone.showMess();
    }
}
