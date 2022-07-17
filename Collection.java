
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Collection {

    public static void main(String[] args) {
       /* ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Nitesh");
        studentName.add("Kumar");
        studentName.add(1,"chaurasia");
        System.out.println(studentName);
       
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(2, 3);
 
        System.out.println(list.get(2));
        
        /*List<String> newList= new ArrayList<>();
        newList.add("Dhane");
        newList.add("Goraul");
        studentName.addAll(newList);
        System.out.println(studentName);*/
        
        List<String> num = new ArrayList<>();
        num.add("200");
        num.add("204");
        num.add("205");
        num.add("250");
        num.add("600");
        num.add("700");
        
        num.add("Ntesh");
        num.add("chaurasia");
        num.add(6,"kumar");
        num.remove(String.valueOf(700));
        num.set(4, "3000");
        
        System.out.println(num);
        System.out.println(num.contains("kumar"));
        for(int i=0;i<num.size();i++){//1st:-iterating
           System.out.println("Elements : "+num.get(i));
        }
        for(String ele : num){ //2nd:- Iterating
            System.out.println("Elements are:"+ele);
        }
        //Iterator interface
        Iterator<String> it = num.iterator();
        while(it.hasNext()){ //3rd:- Iterating
            System.out.println("Elemetns are : "+it.next());
        }
        
    }
    
}
