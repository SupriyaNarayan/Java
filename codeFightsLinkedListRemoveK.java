ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode helper = new ListNode<Integer>(0);
    helper.next = l;
    ListNode p = helper;
    Integer x = k;
    
 
    while(p.next != null){
        if(p.next.value.equals(x)){
            p.next = p.next.next; 
        }else{
            p = p.next;
        }
    }
 
    return helper.next;
}
