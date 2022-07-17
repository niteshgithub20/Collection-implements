//set is an interface which is not allowd duplicate values and also its not consider order.
package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDs {
  public static void main(String[] args){
      //HashSet
      Set<Integer> s = new HashSet<>();//clear();
      s.add(36);                        //contains();=> its finding element and giving true & false
      s.add(33);                        //isEmpty();=>its finding empty or not
      s.add(32);                        //size();=>its finding size of hashset
      s.add(31);                        //remove(5);=> deleting elements 5
      s.add(30);
      s.add(37);
      s.add(38);
      s.add(39);
      System.out.println(s); 
     /* for(Integer se : s){ //Iterator 
          System.out.println("Elements: "+se);
      }*/
      s.add(39);//it will not add because its already available
      System.out.println("deleted elements: "+s.remove(32));//deleting element as 32
      System.out.println(s);
      System.out.println("hashset is empty or not: "+s.isEmpty());
      System.out.println("Size of hashset: "+s.size());
      System.out.println("Availabe element: "+s.contains(37));//checking element as 37
      System.out.println(s);
      
      
  }  
}
