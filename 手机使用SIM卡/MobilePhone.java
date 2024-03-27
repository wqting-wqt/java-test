package 习题.手机使用SIM卡;

public class MobilePhone {
    SIM card;
    public void useSIM(SIM card) {
        this.card = card;
    }
    public void showMess(){
        System.out.println(card.getCorpName());
    }
}
