
package collection;

import java.util.Stack;


public class StackList {
    public static void main(String[] args){
        //stack 
        Stack<String> animals = new Stack<>();
        animals.push("cat");
        animals.push("cow");
        animals.push("monkey");
        animals.push("Owl");
        animals.push("Horse");//adding elements on the top
        System.out.println(animals);
        System.out.println(animals.peek());//print elements from top
        animals.pop();//deleting  elements from top
        System.out.println(animals);
    }
}
