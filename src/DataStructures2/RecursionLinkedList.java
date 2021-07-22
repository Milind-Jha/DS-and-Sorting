package DataStructures2;
class DoubleNode {
        GenericNode head;
        GenericNode tail;
        DoubleNode(GenericNode head, GenericNode tail){
            this.head=head;
            this.tail=tail;
        }
        DoubleNode(){

        }
}
public class RecursionLinkedList {
    public static GenericNode<Integer> insertRec(GenericNode<Integer> head,int pos, int data){
        if(head==null && pos> 0){
            return head;
        }
        if(pos>LinkedListUse.length(head)-1){
            return head;
        }
        GenericNode <Integer> temp = new GenericNode<Integer>(data);
        if(pos==0){
            temp.next=head;
            return temp;
        }
        else {
            GenericNode<Integer> temp2 = insertRec(head.next,pos-1,data);
            head.next=temp2;
            return head;
        }
    }
    public static GenericNode<Integer> reverseLinklistRec(GenericNode<Integer> head){
        if(head==null || head.next == null ){
            return head;
        }
        GenericNode<Integer> reversehead = reverseLinklistRec(head.next);
        GenericNode<Integer> temp = reversehead;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return reversehead;
    }
    public static GenericNode<Integer> reverseLinkListBest(GenericNode<Integer> head){ //IMPORTANT
        if(head==null||head.next==null){
            return head;
        }
        GenericNode<Integer> temp = reverseLinkListBest(head.next);
        GenericNode<Integer> tail = head.next;
        tail.next=head;
        head.next=null;
        return temp;
    }
    public static DoubleNode reverseLinkListRecAlternate(GenericNode<Integer> head){
        DoubleNode smallans = new DoubleNode();
        if(head==null||head.next==null){
            smallans = new DoubleNode();
            smallans.head = head;
            smallans.tail = head;
            return smallans;
        }
        DoubleNode temp = reverseLinkListRecAlternate(head.next);
        temp.tail.next= head;
        head.next=null;
//        smallans = new DoubleNode(); // - ALTERNATIVES - smallans = new DoubleNode(temp.head,head);
        smallans.head = temp.head;   //                                           ^^^^
        smallans.tail = head;        //                                                   ^^^^
        return smallans;
    }
    public static GenericNode<Integer> convert(DoubleNode d){
        return d.head;
    }
    public static int findNodeRec(GenericNode<Integer> head, int n) {
        if(head==null){
            return -1;
        }
        if(head.next==null&&!head.data.equals(n)){
            return -1;
        }
        if(head.data.equals(n)){
            return 0;
        }
        int temp = findNodeRec(head.next,n);
        if(temp==-1){
            return -1;
        }
        return temp+1;
    }



    public static GenericNode<Integer> deleteRec(GenericNode<Integer> head, int pos){
        if(pos<0||pos>LinkedListUse.length(head)-1){
            return head;
        }
        if(pos==0){
            head=head.next;
            return head;
        }
        GenericNode<Integer> temp = deleteRec(head.next,pos-1);
        head.next=temp;
        return head;
    }

    public static void main(String[] args){

        GenericNode<Integer> head = LinkedListUse.EnterValuesforLinkList();
//        insertRec(head,2,33);
//        head=deleteRec(head,2);
//        head = reverseLinkListBest(head);
//        head = convert(reverseLinkListRecAlternate(head));
        LinkedListUse.PrintLinkedList(head);
        int x = findNodeRec(head,2);
        System.out.print(x);
    }
}
