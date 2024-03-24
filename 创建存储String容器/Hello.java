package 习题.创建存储String容器;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner c=new Scanner(System.in);
        List<String> list=new ArrayList<String>();
        for (int i=0;i<3;i++){
            list.add(c.next());
            System.out.println("集合中第"+(i+1)+"个数据为："+list.get(i));
        }
    }
}
