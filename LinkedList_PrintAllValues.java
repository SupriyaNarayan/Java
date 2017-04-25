/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
void Print(Node head) {
    Node temp = head;
  while(temp!=null){
      System.out.format("%d \n", temp.data);
      temp = temp.next;
  }
}
