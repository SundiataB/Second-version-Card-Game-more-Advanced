// Author Sundiata Bondojia
// Program : Sorting Array 
// Date 2/16/2021
// Date Modified 5/14/2021
public class ListNode<E> {
    //Return True if stack is empty 
    private E item;

    //Return the top items on this stack, but do not modify the stack
    private ListNode<E> next;

    public ListNode(E item) { 
        this.item = item;
        next = null;
    }

    public ListNode(E item, ListNode<E> next) {
        this.item = item;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public ListNode <E> getNext() {
        return next;
    }

    public void SetItem(E item) {
        this.item = item;
    }
    public void setnext(ListNode<E> next) {
        this.next = next;
    }
    
    @Override
    public  String toString() {
      if (item != null)
        return String.format(((E)item).toString()); 
      return null; 
    
    }

}