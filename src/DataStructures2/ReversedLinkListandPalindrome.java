package DataStructures2;

import java.util.Scanner;

public class ReversedLinkListandPalindrome {

    public static void printReverse(GenericNode<Integer> root) {
        if(root==null){
            return;
        }
        int x = length(root);
        GenericNode<Integer> temp = root;
        while (x>1){
            while (temp.next.next!=null){        //2nd last
                temp=temp.next;
            }
            System.out.print(temp.next.data+"\t");
            temp.next=null;
            temp= root;
            x--;
        }
        System.out.println(temp.data);

    }
    public static void printReverseRecursion(GenericNode<Integer> head){
       if(head==null){
           return;
       }
        printReverseRecursion(head.next);
        System.out.print(head.data+"\t");
    }

    public static boolean isPalindromeRecursion(GenericNode<Integer>head){
        if(head==null||head.next==null){
            return true;
        }
        boolean ans = false;
        GenericNode<Integer> temp = head;

        while (temp.next.next!=null){ //2nd Last
            temp=temp.next;
        }
        if(temp.next.data.equals(head.data)){
            head=head.next;
            temp.next=null;
            ans = isPalindromeRecursion(head);
        }
        else{
            return false;
        }
        return ans;

    }
    public static boolean isPalindrome(GenericNode<Integer> head) {
        if(head==null || head.next==null){
            return true;
        }
        boolean ans = false;
        int x = length(head)/2;
        GenericNode<Integer> temp = head;
        while (x>0){
            while (temp.next.next!=null){ //2nd Last
                temp=temp.next;
            }
            if(temp.next.data.equals(head.data)){
                ans =true;
                head=head.next;
                temp.next=null;
                temp=head;
                x--;
            }
            else{
                return false;
            }
        }
        return ans;
    }
    public static int length(GenericNode<Integer> head){
        if(head==null){
            return 0;
        }
        GenericNode<Integer> temp = head.next;
        int ans = length(temp)+1;
        return ans;
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
    public static void main(String[] args){

        GenericNode<Integer> head =EnterValuesforLinkList();
//        System.out.println(isPalindromeRecursion(head));
//        printReverse(head);
//        printReverse(head);
//        printReverseRecursion(head);


    }
}
