package 习题.图书类;

public class Book {
    private String bookName;
    private int bookId;
    private String bookAuthor;
    private double bookPrice;
    private String bookAddress;
    static int number=0;
      public Book(String n){
          bookName=n;
          number++;
}
    public Book(String bookName,String bookAuthor,String bookAddress,int bookId,double bookPrice){
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.bookAddress=bookAddress;
        this.bookId=bookId;
        this.bookPrice=bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookAddress() {
        return bookAddress;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void borrow(String bookName){
        System.out.println("您已借书成功！");
    }
    public void lend(String bookName){
        System.out.println("您已还书成功！");
    }
    /*
    public void bookNumber(String n){
        bookName=n;
        number++;
    }

     */
}
