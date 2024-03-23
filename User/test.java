package 习题.User;

 class User {
    private String account;
    private String password;
    void User(String account,String password){
        this.account=account;
        this.password=password;
    }

     public void setAccount(String account) {
         this.account = account;
     }

     public String getAccount() {
         return account;
     }

     public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
public class test {
     public static void main(String[] args){
         User u=new User();
         u.setPassword("wqt12");
         u.setAccount("admin");
         System.out.println("账号： "+u.getAccount()+"\n密码： "+u.getPassword());
     }
}