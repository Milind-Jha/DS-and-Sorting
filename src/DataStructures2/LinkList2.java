package DataStructures2;

public class LinkList2 {

    public static GenericNode<Integer> midpointwithoutlength(GenericNode<Integer> head) {
        if(head==null||head.next==null){
            return head;
        }
        GenericNode<Integer> slow = head;
        GenericNode<Integer> fast = head;

        while(fast.next!=null){
            if(fast.next.next==null){ //TRUE ONLY FOR LAST CASE IF NUMBER OF ELEMENTS IS EVEN . NEVER TRUE FOR ODD NO OF ELEMENTS
                fast= fast.next;
            }
            else {
                fast=fast.next.next;
                slow=slow.next;
            }
        }
        return slow;
    }
    public static GenericNode<Integer> midpointwithoutlengthAlternate(GenericNode<Integer> head){
        GenericNode<Integer> fast = head, slow = head;
        while (fast.next!= null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static GenericNode<Integer> mergesorted(GenericNode<Integer> linklist1, GenericNode<Integer> linklist2){
        GenericNode<Integer> t1 = linklist1;
        GenericNode<Integer> t2 = linklist2;
        GenericNode<Integer> head, tail;
        if(t1.data<= t2.data){
            head = t1;
            tail = t1;
            t1=t1.next;
        }
        else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while (t1!=null && t2!=null){
            if(t1.data<= t2.data){
                 tail.next=t1;
                 tail = t1;
                 t1=t1.next;
            }
            else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null){
            tail.next=t1;
        }//ONLY T1 has ELEMENTS LEFT
        if(t2!=null){
            tail.next=t2;
        }
        return head;
    }
    public static void main(String[] args){
        GenericNode<Integer> x = LinkedListUse.EnterValuesforLinkList();
        GenericNode<Integer> y = LinkedListUse.EnterValuesforLinkList();
        GenericNode<Integer> combine = mergesorted(x,y);
//        x = midpointwithoutlengthAlternate(x);
        LinkedListUse.PrintLinkedList(combine);
    }
}
