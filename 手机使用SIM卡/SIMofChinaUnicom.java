package 习题.手机使用SIM卡;

public class SIMofChinaUnicom extends SIM {
    private String number;
    SIMofChinaUnicom(){
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getCorpName() {
        return "此卡为中国联通";
    }
}
