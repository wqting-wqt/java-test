package 习题.图书类;

import 泛型类.Student;

import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        //ArrayList<Book> as = new ArrayList<Book>();
        Book b1=new Book("love01","lucy","England",1002,25);
        Book b2=new Book("hate","lucy","England",1003,25);
        System.out.println(b1.getBookName()+"\n"+b1.getBookAuthor()+"\n"+b1.getBookAuthor()+"\n"+b1.getBookId()+"\n"+b1.getBookPrice());
        System.out.println("-----------");
        System.out.println(b2.getBookName()+"\n"+b2.getBookAuthor()+"\n"+b2.getBookAuthor()+"\n"+b2.getBookId()+"\n"+b2.getBookPrice());
        //b1.borrow("love");
        //b2.borrow("hate");
        System.out.println("-----------");
        Book b3=new Book("love02");
        Book b4=new Book("love03");
        System.out.println(Book.number);
        System.out.println(b3.number);

    }
}
