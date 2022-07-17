/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDs {
    public static void main(String[] args){
        //LinkedList in queue
        Queue<Integer> que = new LinkedList<>();
        que.offer(62);
        que.offer(32);
        que.offer(24);
        que.offer(42);
        que.offer(25);//adding element at last
        que.offer(27);
        que.offer(7);     
        System.out.println(que);
        que.poll();//deleting element at first
        System.out.println(que.poll());//printing the which are elements deleting 
        System.out.println(que); 
        System.out.println(que.peek()); //printing element at the first
        
        
        //Priority Queue=> it is known as accending or dec. order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(34);
        pq.offer(22);
        pq.offer(26);
        pq.offer(2);
        pq.offer(80);
        System.out.println(pq); //it is printing first small elements and then all elements       
        System.out.println(pq.poll());//deleting high priority elements from the queue
        System.out.println(pq);
        System.out.println(pq.peek());//printing high priority elements from the queue
        
        //sorting order in queue
        Queue<Integer> pqs = new PriorityQueue<>(Comparator.reverseOrder());//it is sorted order deceding order
        pqs.offer(20);
        pqs.offer(34);
        pqs.offer(22);
        pqs.offer(26);
        pqs.offer(2);
        pqs.offer(80);
        System.out.println(pqs);        
        System.out.println(pqs.poll());//printing deleting elements
        System.out.println(pqs);
        System.out.println(pqs.peek());//printing next elements for deleting
       
       
       //Double ended queue
       ArrayDeque<Integer> adq = new ArrayDeque<>();
       adq.offer(34); //simple adding 
       adq.offerFirst(45); //it add in first at the queue
       adq.offerLast(46);//it add in last at the queue 
       adq.offer(87);
       adq.offer(56);
       adq.offer(76);
       adq.offer(89);
       System.out.println(adq);
       System.out.println("First Element "+adq.peek());//printing next elements for deleting
       System.out.println("First Element "+adq.peekFirst());//printing first elements for deleting
       System.out.println("Last Element "+adq.peekLast()); //printing last elements for deleting
       System.out.println(adq);
       
       System.out.println("Deleted elemets at the first "+adq.poll());//printing deleting elements
       System.out.println(adq);
       System.out.println("First Elements deleted "+adq.pollFirst()); //printing first deleting elements
       System.out.println(adq);
       System.out.println("Last element Deleted "+adq.pollLast()); //printing last deleting elements
       System.out.println(adq);
    }
}
