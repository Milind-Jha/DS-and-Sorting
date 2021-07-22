package DataStructures2;

public class LinkList3 {
    public static GenericNode<Integer> evenAfterOdd(GenericNode<Integer> head) {
        if(head==null||head.next==null){
            return head;
        }
        GenericNode<Integer> oddhead = null, oddtail=null, evenhead= null, eventail=null;
        GenericNode<Integer> temp = head;
        while(temp!=null){
            if(temp.data%2==1&&oddhead==null){
                oddhead = temp;
                oddtail = temp;
            }
            else if(temp.data%2==1&&oddhead!=null){
                oddtail.next= temp;
                oddtail=oddtail.next;
            }
            else if(temp.data%2==0&&evenhead==null){
                evenhead = temp;
                eventail = temp;
            }
            else if(temp.data%2==0&&evenhead!=null){
                eventail.next= temp;
                eventail=eventail.next;
            }
            temp=temp.next;
        }
        if(oddhead==null){
            eventail.next=null;
            oddhead=evenhead;
        }
        else if(evenhead==null){
            oddtail.next=null;
        }
        else{
            oddtail.next=null;
            eventail.next=null;
            oddtail.next=evenhead;
        }
        return oddhead;
    }
    public static GenericNode<Integer> skipMdeleteN(GenericNode<Integer> head, int M, int N) {
        if(N==0){
            return head;
        }
        if(M==0){
            head =null;
            return head;
        }
        GenericNode<Integer> temp=head;
        GenericNode<Integer> temp1=head;
        GenericNode<Integer> temp2=head;
        while(temp!=null){
            int count1 = 1;
            while(count1!=M&&temp1!=null){
                temp1=temp1.next;
                count1++;
            }

            if(temp1==null){
                return head;
            }
            temp2=temp1.next;
            temp1.next=null; //VERY IMPORTANT
            int count2 = 1;
            while(count2!=N && temp2!=null){
                temp2=temp2.next;
                count2++;
            }
            if(temp2==null){
                return head;
            }
            temp2=temp2.next;
            temp1.next=temp2;
            temp1=temp2;
            temp=temp2;
        }
        return head;
    }
}
