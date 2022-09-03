import java.util.*;

// reverse linked List
public class LinkedListProblem {
    public static void main(String [] arg) {
        LinkedList<String> ll= new LinkedList();
        ll.add("Deepu");
        ll.add("Ram");
        ll.add("Yadav");

        System.out.println(ll);
        ll= reverseList(ll);
        /* 
         * or
         * Collections.reverse(ll);
         * 
         * Time compx - n/2
         * Space -1
         */
        System.out.println(ll);
    }
    public static LinkedList<String> reverseList(LinkedList<String> list) {
        for(int i=0;i<list.size()/2;i++){
            String temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
        
        return list;
    }


}
