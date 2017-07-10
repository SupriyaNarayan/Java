int firstDuplicate(int[] a) {
    HashMap<Integer,Integer> myHash = new HashMap<Integer,Integer>();
    for(int i=0;i<a.length;i++){
        int temp = a[i];
        if(!myHash.containsKey(temp)){
            myHash.put(temp,1);
        }
        else{
            return temp;
        }
    }
    return -1;

}
