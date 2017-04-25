/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int x) {
    Node node = new Node();
    node.data = x;
    if(head==null){
        head=node;
    }
    else{
        Node temp;
        temp = head;
        head = node;
        head.next = temp;
    }
    
    return head;
    
}
