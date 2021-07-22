package DataStructures1;

public class Triplet2 {
    public static int Trip(int[] arr,int num){
        MergeSortAndQuickSort.mergeSort(arr);
        int triplets=0;
        for(int i=0;i<arr.length;i++){
            int requiredsum = num -arr[i];
            triplets+=findpairs(arr,i+1, arr.length-1, requiredsum);

        }
        return triplets;
    }

    private static int findpairs(int []arr, int start, int end , int search) {
        int pairs =0;
        while (start<end){
            if(arr[start]+arr[end]<search){
                start++;
            }
            else if(arr[start]+arr[end]>search){
                end--;
            }
            else{
                if(arr[start]==arr[end]){
                    int elements = end-start+1;
                    pairs+=elements*(elements-1)/2;  // nC2= n*(n-1)/2
                    return pairs;
                }
                int tempstart=start+1;
                int tempend= end-1;
                while (arr[tempstart]==arr[start]){
                    tempstart++;
                }
                while (arr[tempend]==arr[end]){
                    tempend--;
                }
                int a = tempstart-start;
                int b = end-tempend;
                pairs+=a*b;
                start++;
                end--;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int[] x = {2, -5, 8, -6, 0, 5, 10, 11, -3};
        System.out.println(Trip(x, 10));
    }
}
