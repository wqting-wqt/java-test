package textbook.习题.接口集合;
/*
    List--ArrayList---泛型类
    声明举例：
         List<String>list=new ArrayList<String>();
 */
/*
    List--ArrayList---泛型类
    声明举例：
         List<String>list=new ArrayList<String>();
 */
import java.util.ArrayList;
import java.util.List;

public class List作业 {
    public static void main(String[] args){
        List<String> list=null;
        list=new ArrayList<String>();
        list.add("q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m");//增加List中元素
        //list.add(0,"");
        //list.add("b");
        //list.add("c");
        //list.remove(0);//删除List中元素
        //list.remove("b ");
        System.out.println(list);

    }
}

