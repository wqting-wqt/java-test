package 习题.手机使用SIM卡;

/*
public abstract  class SIM {
    private String number;
    private String corpName;
    void SIN(String number,String corpName){
        this.number=number;
        this.corpName=corpName;
    }

    public abstract void setNumber(String n);
    public abstract String getNumber();
    public abstract String getCorpName();

 */
public   class SIM {
    private String number;
    private String corpName;
    void SIN(String number,String corpName){
        this.number=number;
        this.corpName=corpName;
    }

    public void setNumber(String n) {
        this.number = n;
    }

    public String getNumber() {
        return number;
    }

    public String getCorpName() {
        return corpName;
    }
}
