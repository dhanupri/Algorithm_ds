package Ascendin_order;
public class Node<K> {
    K data;
    Node<K> next;
    Node(){
        next=null;
    }
    Node(K data){
        this.data=data;
        next=null;
    }
}
