public class Recursion {
    public static void main(String[]args){
        int[] x={2,4,6,8,5,3,8,6};
        System.out.println(lastIndex(x,8));

    }

    public static int lastIndex(int input[], int x) {

        return lastIndex(input,0,input.length-1,x);

    }
    public static int lastIndex(int[] arr,int start,int end,int num) {

        if(start > end) {
            return  -1;
        }
        if(arr[end] == num){
            return end;
        }
        return lastIndex(arr, start, end-1, num);

    }
    static int count=0;
    public static int searchforfirstIndex(int[] a , int z){
        if(a.length==1&&a[0]!=z){
            int y=-1;
        }
        if(a.length!=1&&a[0]!=z){
            count++;
        }
        if(a[0]==z){
            return count;
        }
        int [] temp = new int[a.length-1];
        for(int i=1;i<a.length;i++){
            temp[i-1]=a[i];
        }
        int output = searchforfirstIndex(temp,z);
        return output;
    }
}
