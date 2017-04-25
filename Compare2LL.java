/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    if(headA==null && headB==null){
        return 1;
    }
    if((headA==null && headB!=null)||(headA!=null && headB==null)){
        return 0;
    }
    Node tempA = headA;
    Node tempB = headB;
    while(tempA.next!=null && tempB.next!=null){
        if(tempA.data==tempB.data){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        else{
            return 0;
        }
    }
    if(tempA.next==null && tempB.next==null){
        if (tempA.data==tempB.data){
             return 1;
        }
        else{
            return 0;
        }
    }
    else{
        return 0;
    }  
}
