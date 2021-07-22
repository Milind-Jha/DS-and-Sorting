package DataStructures1;

public class QuickSort2 {
    public static void Quick(int [] x, int start , int end){
        if(start>=end){
            return;
        }
        int a = Partition(x, start, end);
        Quick(x, start, a-1);
        Quick(x, a+1, end);
    }
    private static int Partition(int [] x, int start , int end){
        int  partion = 0;
        for(int i=start;i<=end;i++){
            if(x[i]<x[start]){
                partion++;
            }
        }
        if(partion!=0){
             int temp = x[start+partion];
            x[start+partion]= x[start];
             x[start] = temp;
        }
        int a = start+partion;
        int i= start;
        int j = end;
        while(i<j){
            if(x[i]<x[a]){
                i++;
            }
            else if(x[j]>=x[a]){
                j--;
            }
            else {
                int temp = x[i];
                x[i]=x[j];
                x[j]=temp;
                i++;
                j--;
            }
        }
        return start+partion;
    }
}
