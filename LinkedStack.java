// Author Sundiata Bondojia
// Program : Sorting Array 
// Date 2/16/2021
// Date Modified 5/14/2021

public class LinkedStack <E> implements Stack<E> {
   private ListNode <E> top;

   ListNode<E> current = top;

   public LinkedStack() {
      top = null;
   }
  
   public boolean isEmpty() {
      return top == null;
   }
   public void swap (final int index1, final int index2) {
    int i;
    ListNode<E> thisNode = top;
    ListNode<E> thatNode = top;
    for(i = 1; i <index1; i++ ){
      if(thisNode == null) {
        return;
      }
      thisNode = thisNode.getNext(); 
    }
    for(i = 1; i <index2; i++ ){
      if(thatNode == null) {
        return;
      }
      thatNode = thatNode.getNext(); 
    }
    E temp;
    temp = thisNode.getItem();
    thisNode.SetItem(thatNode.getItem());
    thatNode.SetItem(temp);
   }

   public E peek() {
      if (isEmpty()){
        throw new RuntimeException();
      }
      return top.getItem(); 
   }
    
   public E pop() {
        if (isEmpty()) {
          throw new RuntimeException();
      }
      E result = top.getItem();
      top = top.getNext();
      return result;
    }

    public void push(E target) {
        top = new ListNode<E>(target, top);
    }

    @Override
    public  String toString() {
      ListNode<E> current = top;
      String retStr = "";
      int i = 1;
      while(current != null) {
        retStr += i + ":" + current .toString() + " ";
        current = current.getNext();
        i++;
      } 
      return retStr;
    
    }

}