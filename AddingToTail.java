/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node node = new Node();
    node.data = data;
    if(head==null){
        head=node;
    }
    else{
        Node temp = head;
   while(temp.next !=null){
       temp=temp.next;
   }
    temp.next = node;
    }
    return head;
  
}
