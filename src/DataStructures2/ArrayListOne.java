package DataStructures2;

import java.util.ArrayList;

public class ArrayListOne {
    public static ArrayList<Integer> removeconsecutiveDuplicates(int [] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        for (int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                temp.add(arr[i]);
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int [] x ={20,20,10,30,30,30,30,40,50,50,60};
        ArrayList<Integer> ans = new ArrayList<>();
        ans = removeconsecutiveDuplicates(x);
        for (int i:ans ) {
            System.out.print(i+" ");
        }
    }
}
