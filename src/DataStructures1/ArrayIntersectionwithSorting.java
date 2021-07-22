package DataStructures1;

public class ArrayIntersectionwithSorting {
    public static void intersection(int []x, int []y){
        mergeSort(x);
        mergeSort(y);
        int i=0;
        int j=0;
        while (i< x.length&&j< y.length){
            if(x[i]<y[j]){
                i++;
            }
            else if(x[i]>y[j]){
                j++;
            }
            else {
                System.out.print(x[i]+" ");
                i++;
                j++;
            }
        }
    }
    private static void mergeSort(int[] x){
        if(x.length==1){
            return;
        }
        int [] a = new int[x.length/2];
        int[] b = new int[x.length- a.length];
        for(int i=0;i<a.length;i++){
            a[i]=x[i];
        }
        for(int i= 0;i< b.length;i++){
            b[i]=x[a.length+i];
        }
        mergeSort(a);
        mergeSort(b);
        Merge(a,b,x);
    }

    private static void Merge(int[] a, int[] b, int[] x) {
        int i=0;
        int j=0;
        int k=0;
        while(i < a.length && j< b.length){
            if(a[i]<=b[j]){
                x[k]=a[i];
                i++;
                k++;
            }
            else if(a[i]>b[j]){
                x[k]=b[j];
                j++;
                k++;
            }
        }
        if(j<b.length){
            while (j< b.length){
                x[k]= b[j];
                j++;
                k++;
            }
        }
        if(i<a.length){
            while (i< a.length){
                x[k]= a[i];
                i++;
                k++;
            }
        }
    }
    public static void main(String[]args){
        int[] x={1,2,3,4,2};
        int[] y={2,6,1,2};
        intersection(x,y);
    }
}
