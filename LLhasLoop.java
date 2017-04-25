/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
if(head==null){
    return false;
}
Node fastPtr = head;
Node slowPtr = head;
while(fastPtr!=null && fastPtr.next!=null){
    fastPtr=fastPtr.next.next;
    slowPtr=slowPtr.next;
    if(slowPtr==fastPtr){
        return true;
    }
}
    return false;
}
