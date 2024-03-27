package 习题.手机使用SIM卡;

public class SIMofChinaMobile extends SIM {
    private String number;
    SIMofChinaMobile(){
    }

    @Override
    public void setNumber(String n) {
        this.number = n;
    }

    @Override
    public String getNumber() {
        return number;
    }
/*
    @Override
    public String getCorpName() {
        return super.getCorpName();
    }

 */

    @Override
    public String getCorpName() {
        return "此卡为中国移动\n";
    }





}
