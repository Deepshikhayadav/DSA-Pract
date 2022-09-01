class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next=null;
        }
    }
    public void append(int d){
        Node n= new Node(d);
        if(head==null){
            head=n;
            return;
        }
       
        Node last=head.next;
        while(last!=null){
            last=last.next;
        }

    }
    public void push(int d){
        Node n= new Node(d);
        n.next=head;
        head=n;
    }
    public void insertAfter(Node prev, int d){
        if(prev==null){
            System.out.println("it cannot be null");
            return;
        }
        Node n= new Node(d);
        n.next= prev.next;
        prev.next=n;
    }
    public void printList(){
        Node k=head;
        while(k!=null){
            System.out.println(k.data);
            k= k.next;
        }
    }
    public void deleteNode(int d){
        Node temp=head, prev=null;
         // If head node itself holds the key to be deleted
        if(temp!=null && temp.data==d){
            head=temp.next;
            return;
        }

        while(temp!=null && temp.data!=d){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        prev.next=temp.next;
    }

}


public class LinkedListProg {
    public static void main(String[] arg) {
        LinkedList ll = new LinkedList();
        ll.append(6);
        ll.push(1);
        ll.push(2);
        ll.insertAfter(ll.head.next,8);
        System.out.println("Linked List Created");
        ll.deleteNode(2);
        ll.printList();
    }
}
