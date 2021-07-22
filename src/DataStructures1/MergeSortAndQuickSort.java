package DataStructures1;

public class MergeSortAndQuickSort {
    // Difficulty- HARD
    public static void mergeSort(int [] x){
        int mid = x.length/2;
        int[] a1 = new int[mid];
        int[] a2 = new int[x.length-mid];
        if(x.length<=1){
            return;
        }
        for(int i=0;i<mid;i++){
            a1[i]=x[i];
        }
        for(int i=mid;i< x.length;i++){
            a2[i-mid]=x[i];
        }
        mergeSort(a1);
        mergeSort(a2);
        merge(a1,a2,x);
    }

    private static void merge(int[] a1, int[] a2, int[] x) {
        int i=0;
        int j=0;
        int k=0;
        while (i< a1.length && j< a2.length){
            if(a1[i]>a2[j]){
                x[k]=a2[j];
                k++;
                j++;
            }
            else {
                x[k]=a1[i];
                i++;
                k++;
            }
        }
        if(i<a1.length){
            while (i< a1.length){
                x[k]=a1[i];
                i++;
                k++;
            }
        }
        if(j<a2.length){
            while (j<a2.length){
                x[k]=a2[j];
                k++;
                j++;
            }
        }
    }


    public static void quickSort(int[] x) {

        QuickSort(x,0,x.length-1);

    }

    private static void QuickSort(int[] x, int start, int end) {

        if(start>end){
            return;
        }
        int count =start;
        for(int i=start;i<=end;i++){
            if(x[start]>=x[i]){
                count++;
            }
        }
        if(count!=start){
            int temp = x[count-1];
            x[count-1] = x[start];
            x[start]= temp;
        }

        int i=start;
        int pos =count-1;
        int j=pos+1;
        while(i<=pos&&j<=end)
        {
            if(x[i]<=x[pos])
            {
                i++;
            }
            else if(x[j]>x[pos])
            {
                j++;
            }
            else if(x[i]>x[pos]&&x[j]<=x[pos])
            {
                int t =x[i];
                x[i]=x[j];
                x[j]=t;
                i++;
                j++;
            }
        }
        QuickSort(x,start,pos-1);
        QuickSort(x,pos+1,end);
    }
}
