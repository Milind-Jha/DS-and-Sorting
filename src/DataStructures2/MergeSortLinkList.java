package DataStructures2;

public class MergeSortLinkList {
    public static GenericNode<Integer> mergeSort(GenericNode<Integer> head){
        if(head==null||head.next==null){
            return head;
        }
        GenericNode<Integer> head1 = head;
        GenericNode<Integer> head2 = LinkList2.midpointwithoutlength(head).next;
        GenericNode<Integer> mid   = LinkList2.midpointwithoutlength(head);
        mid.next=null;
        head1=mergeSort(head1);
        head2=mergeSort(head2);
        GenericNode<Integer> ans = LinkList2.mergesorted(head1,head2);
        return ans;
    }
    public static void main(String[] args){
        GenericNode<Integer> input = LinkedListUse.EnterValuesforLinkList();
        input=mergeSort(input);
        LinkedListUse.PrintLinkedList(input);
    }
}
