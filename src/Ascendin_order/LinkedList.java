package Ascendin_order;

public class LinkedList<K> {
    Node head=new Node();
    void insertSortedList(int data){
        Node temp=head;
        Node newnode=new Node(data);
        if(head.next==null){
            head.next=newnode;
            return;
        }
        while (temp.next!=null && (int)temp.next.data<(int)data) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
     void display(){
        Node temp=head.next;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
