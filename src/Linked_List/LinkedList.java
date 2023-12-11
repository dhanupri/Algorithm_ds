package Linked_List;
public class LinkedList<K> {
    Node head=new Node();
    //insert the data based on postion
    void insert(int position,K data){
        Node temp=head;
        Node newnode=new Node(data);
        int count=-1;
        while (count!=position-1 && temp.next!=null){
            temp=temp.next;
            count++;
        }
        newnode.next= temp.next;
        temp.next=newnode;
    }
    //insert th data at last
    void append(K data){
        Node temp=head;
        Node newnode=new Node(data);
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    // search if the data present or not in linkedlist
    void search(K data){
        Node temp=head.next;
        while (temp!=null){
            if(temp.data.equals(data)){
                remove((K) temp.data);
                System.out.println("word found and removed from linkedlist " );
                return;
            }
            temp=temp.next;
        }
        append(data);
        System.out.println("word not found, added to linkedlist");
    }
    //remove the Node
    void remove(K data){
        Node temp=head;
       while (!temp.next.data.equals(data)){
           temp=temp.next;
       }
       if(temp.next.next!=null){
           temp.next=temp.next.next;
       }
       else{
           temp.next=null;
       }
    }
    //diaplay the linkedlist
    void display(){
        Node temp=head.next;
        while (temp!=null){
            System.out.println(temp.data+"\n");
            temp=temp.next;
        }

    }
}
