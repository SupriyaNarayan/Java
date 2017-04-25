/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
Node Reverse(Node head) {
    Node prev = null;
    Node NextNode;
    while(head!=null){
        NextNode = head.next;
        head.next = prev;
        prev = head;
        head = NextNode;
    }
    
    return prev;

}
