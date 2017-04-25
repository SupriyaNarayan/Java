/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node Delete(Node head, int position) {
    int count = 0;
    Node temp=head;
    if(position==0){
        return temp.next;
    }
    while(count!=position-1){
        if(temp!=null){
            temp=temp.next;
            count++;
        }
    }
    if(temp.next != null){
    temp.next = temp.next.next;
    }   
    
    return head;

}

