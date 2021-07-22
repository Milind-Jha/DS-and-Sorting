package DataStructures2;

public class SwapNodes {
    public static int length(GenericNode<Integer> head){
        if(head==null){
            return 0;
        }
        GenericNode<Integer> temp = head.next;
        int ans = length(temp)+1;
        return ans;
    }
    public static GenericNode<Integer> swapNodes(GenericNode<Integer> head, int i, int j) {
        int x= length(head);
        if(i>=x||j>=x){
            return head;
        }
        if(i<0||j<0){
            return head;
        }
        GenericNode<Integer> temp1 = head;
        GenericNode<Integer> temp2 =head;
        while (i>0){
            temp1=temp1.next;
            i--;
        }
        while (j>0){
            temp2=temp2.next;
            j--;
        }
        GenericNode<Integer> temp3 = new GenericNode<Integer>(temp1.data);
        temp1.data=temp2.data;
        temp2.data=temp3.data;
        return head;
    }
}
