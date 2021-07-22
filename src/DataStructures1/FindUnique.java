package DataStructures1;

public class FindUnique {
    public static int findUnique(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        MergeSortAndQuickSort.mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0&&arr[i]!=arr[i+1]){
                return arr[i];
            }
            else if(i==arr.length-1&&arr[i]!=arr[i-1]){
                return arr[i];
            }
            else if(i>0&&i<arr.length-1){
                if(arr[i-1]!=arr[i]&&arr[i]!=arr[i+1]){
                    return arr[i];
                }
            }
            else
                continue;
        }
        return -1;
    }
}
