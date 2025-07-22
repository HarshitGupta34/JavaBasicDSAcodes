package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
    Node(){

    }
}
public class SinglyLL {
    public static void main(String[] args) {
        Node a =new Node();
        a.val=23;
        Node b =new Node();
        b.val=25;
        Node c =new Node();
        c.val=23;
        Node d =new Node();
        d.val=25;
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a);
//        System.out.println(a.next);
//        System.out.println(d.next);

    }
}
