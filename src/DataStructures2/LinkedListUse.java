package DataStructures2;

import java.util.Scanner;

public class LinkedListUse {

    public static GenericNode CreateLinkedList(){

        //NODE CREATION
        GenericNode<Integer> one = new GenericNode<>(42);
        GenericNode<Integer> two = new GenericNode<>(31);
        GenericNode<Integer> three = new GenericNode<>(22);
        GenericNode<Integer> four = new GenericNode<>(39);

        //NODE CONNECTION
        one.next = two;
        two.next = three;
        three.next = four;

        return one;
    }
    public static GenericNode<Integer> insert(GenericNode<Integer> head, int pos, int data){
        if(pos==0){
            GenericNode<Integer> currentnode = new GenericNode<>(data);
            currentnode.next=head;
            return currentnode;
        }

        GenericNode<Integer> previousnode=head;
        for(int i=1;i<pos;i++){
            if(previousnode==null){ // if(previousnode==null) means that position is greater than length of Linked List.
                return head;        // we do not need to insert anything so we return head as it is.
            }
            previousnode=previousnode.next;
        }
        GenericNode<Integer> currentnode = new GenericNode<>(data);
        currentnode.next=previousnode.next;
        previousnode.next=currentnode;
        return head;
    }
    public static GenericNode<Integer> deleteNode(GenericNode<Integer> head, int pos) {
      if(pos == 0){
          head=head.next;
          return head;
      }
      GenericNode<Integer> previousnode=head;

      for (int i=1;i<=pos;i++){
          if (i == pos && previousnode.next.next!=null) {
            previousnode.next=previousnode.next.next;
            return head;
          }
          else if(i!=pos && previousnode!=null && previousnode.next.next!=null) {
              previousnode=previousnode.next;
          }
          else if(i == pos && previousnode.next!=null && previousnode.next.next==null){ // LAST ELEMENT
              previousnode.next=null;
              return head;
          }
          else
              return head;
          }
         return head;
    }
    public static GenericNode<Integer> appendLastToFirstAlternate(GenericNode<Integer> head, int n) { //HARD
        if (n == 0 || head == null) {
            return head;
        }
        int length = length(head);

        GenericNode<Integer> temp = head;
        GenericNode<Integer> temp2 = head;

        int count = 0;
        while (count < length - n - 1) {
            temp = temp.next;
            count++;
        }

        head = temp.next;
        temp.next = null;

        GenericNode<Integer> tHead = head;
        while (tHead.next != null) {
            tHead = tHead.next;
        }

        tHead.next = temp2;

        return head;
    }

    public static GenericNode<Integer> appendLastNToFirst(GenericNode<Integer> head, int n) {
        if(n==0){
            return head;
        }
        if(head==null){
            return head;
        }
        GenericNode<Integer> tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        GenericNode<Integer> secondlastnode = head;
        int count =1;
        while(count<=n){
            while(secondlastnode.next.next!=null){
                secondlastnode=secondlastnode.next;
            }

            tail.next = head;
            head=tail;
            tail=secondlastnode;
            tail.next=null;
            secondlastnode = head;
            count++;
        }
        return head;
    }
    public static GenericNode EnterValuesforLinkList(){
        GenericNode<Integer> currentNode;
        GenericNode<Integer> head = null;
        GenericNode<Integer> tail = null;
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        while (value!=-1){

            currentNode = new GenericNode<>(value);

            if(head == null){
                head = currentNode;
                tail = currentNode;
            }
            else {
                tail.next= currentNode;
                tail=currentNode;
            }
          value = scan.nextInt();
        }
        return head;
    }
    public static void PrintLinkedList(GenericNode<Integer> head){

//        if(head==null){              // LAST CASE
////            System.out.println(head.data);// PRINT FINAL ELEMENT
//            return;                       // return or else null point Exception After final element is printed
//        }
//        System.out.println(head.data);
//        GenericNode<Integer> temp = head.next;
//        PrintLinkedList(temp);

        //ITERATION ALTERNATIVE
       GenericNode<Integer> temp = head;
        while (temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }

    public static int length(GenericNode<Integer> head){
        if(head==null){
            return 0;
        }
        GenericNode<Integer> temp = head.next;
        int ans = length(temp)+1;
        return ans;
    }
    public static GenericNode<Integer> removeDuplicates(GenericNode<Integer> head) {
        if(head==null||head.next==null){
            return head;
        }
        GenericNode<Integer> temp = head;
        GenericNode<Integer> temp2 = head.next;
        // int n=length(head);
        while(temp2.next!=null){
            if(!temp.data.equals(temp2.data)){
                temp2=temp2.next;
                temp=temp.next;
            }
            else {
                while (temp2.next!=null && temp.data.equals(temp2.data)) {
                    temp.next = null;
                    temp2 = temp2.next;
                }
                temp.next = temp2;
                temp = temp.next;
                temp2 = temp2.next;
            }
            }
        if(temp.data.equals(temp2.data)){
            temp.next=null;
        }

        return head;
    }
    public static void main(String[] args){

//        Node n = new Node(5);
//        System.out.println(n.data);
//        System.out.println(n.next);
//        //GENERIC ALTERNATIVE
//        GenericNode<Integer> g = new GenericNode<>(5);
//        System.out.println(g.data);
//        System.out.println(g.next);

        //LINKED LIST USEAGE

        GenericNode<Integer> head = EnterValuesforLinkList();
//        PrintLinkedList(head);
//        System.out.println(length(head));
//        deleteNode(head,5);
//        PrintLinkedList(head);
//        System.out.println(length(head));
//        head=removeDuplicates(head);
        head = SwapNodes.swapNodes(head,3,4);
        PrintLinkedList(head);
    }
}
