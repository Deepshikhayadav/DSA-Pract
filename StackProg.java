import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackProg {

    //By ArrayList
    static class StackArrayList{
        static List<Integer> list= new ArrayList<>();
        public static boolean isEmpty() {
            return list.size()==0;
        }
        
        public static void push(int data) {
            list.add(data);
        }
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
            
        }
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }







// By LinkedList
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next= null;
        }
    }
    static class StackLinkedList{
        public static Node head;
        public static boolean isEmpty() {
            return head==null;
        }
        public static void push(int data) {
            Node newNode= new Node(data);
            if(isEmpty()){
                head= newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void pushElementAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()){
             stack.push(data);
             return;
        }
        int top= stack.pop();
        pushElementAtBottom(stack, data);
        stack.push(top);
      
    }
    public static void reverseElement(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
       }
       int top = s.pop();
       reverseElement(s);
       pushElementAtBottom(s, top);
    }
    public static void main(String[] arg) {
        //Stack using LinkedList
        StackLinkedList s = new StackLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
// Stack using ArrayList
        StackArrayList sa= new StackArrayList();
        sa.push(11);
        sa.push(12);
        sa.push(13);
        sa.push(14);
        while(!sa.isEmpty()){
            System.out.println(sa.peek());
            sa.pop();
        }


        //push  element at the bottom of the stack
        Stack<Integer> stack= new Stack<>();
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);

        //pushElementAtBottom(stack,25);
        reverseElement(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
   
}
