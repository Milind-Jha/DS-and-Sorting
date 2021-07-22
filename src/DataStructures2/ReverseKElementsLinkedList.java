package DataStructures2;

public class ReverseKElementsLinkedList {
    public static GenericNode<Integer> kReverse(GenericNode<Integer> head, int k) {
        int x = LinkedListUse.length(head);
        boolean change = false;
        if(k<2||k>x){
            return head;
        }

        GenericNode<Integer> temp1 = head;
        GenericNode<Integer> tempstart = head;
        GenericNode<Integer> tempafterend = head;
        GenericNode<Integer> link = head;

        while(tempafterend!=null){
            int count =1;
            while(count<k&&temp1.next!=null){
                temp1=temp1.next;
                count++;
            }
                tempafterend = temp1.next;
                temp1.next = null;

            tempstart = reverse(tempstart);
            if(change==false){
                head = tempstart;
                change = true;
                link=head;
                while (link.next!=null){
                    link=link.next;
                }
            }
            else{
                link.next = tempstart;
                while (link.next!=null){
                    link=link.next;
                }
            }
            if(tempafterend!=null&&temp1!=null){
                count =1;
                while(count<k&&temp1!=null){
                    temp1=temp1.next;
                    count++;
                }
                temp1.next = tempafterend;
                temp1 = tempafterend;
                tempstart = tempafterend;
            }
        }
        return head;
    }
    public static GenericNode<Integer> reverse(GenericNode<Integer> head){
        if(head==null || head.next == null ){
            return head;
        }
        GenericNode<Integer> reversehead = reverse(head.next);
        GenericNode<Integer> temp = reversehead;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return reversehead;
    }
    public static void main(String[] args){
        GenericNode<Integer> head = LinkedListUse.EnterValuesforLinkList();
        head = kReverse(head,6);
        LinkedListUse.PrintLinkedList(head);
    }
}
