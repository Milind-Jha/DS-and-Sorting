package DataStructures1;

public class MaxProfit {
    public static int maximumProfit(int budget[]) {
        MergeSortAndQuickSort.mergeSort(budget);
        int a =0;

        for(int i=0;i<budget.length;i++){
            int count =0;
            int temp = budget[i];
            for(int j=0;j<budget.length;j++){
                if(temp<=budget[j]){
                    count++;
                }
            }
            if(a<temp*count){
                a=temp*count;
            }
        }
        return a;
    }
    public static void main(String [] args){
        int [] x= {8,1,2,7,1,5,6,1,6,6};
        System.out.println(maximumProfit(x));
    }
}
