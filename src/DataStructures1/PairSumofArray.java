package DataStructures1;

public class PairSumofArray {
    public static int pairSum(int[] arr, int num) {
        if(arr.length==1){
            return -1;
        }
        MergeSortAndQuickSort.mergeSort(arr);
        int pairs=0;
        int i=0;
        int j= arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]>num){
                j--;
            }
            else if(arr[i]+arr[j]<num){
                i++;
            }
            else if(arr[i]+arr[j]==num&& arr[i]!=arr[j]){
                int a=1;
                int b=1;
                while (arr[i]==arr[i+1]){
                    a++;
                    i++;
                }
                i++;
                while (arr[j]==arr[j-1]){
                    b++;
                    j--;
                }
                j--;
                int c = a * b;
                pairs+=c;
            }
            else { // arr[i]+arr[j]==num && arr[i]==arr[j]
                int a = j-i+1;
                int b = 1;
                int c = 1;
                for(int k=1;k<=a;k++){
                    b*=k;
                }
                for(int k=1;k<=a-2;k++){
                    c*=k;
                }
                int d = b/c;
                d=d/2;// d = bC2 b = a!  c = (a-2)! 2!=2
                pairs+=d;
                return pairs;
            }
        }
        return pairs;
    }
    public static void main(String[] args){
        int[] x ={0,6,0,0};
        System.out.println(pairSum(x,6));
    }
}
