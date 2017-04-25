/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    int count=0;
    int count1=0;
    Node temp=head;
    Node temp1=head;
    while(temp.next!=null){
        temp=temp.next;
        count++;
    }
    while(count-count1!=(n+1)){
        temp1=temp1.next;
        count1++;
    }
    int x= temp1.next.data;
    return x;
}
