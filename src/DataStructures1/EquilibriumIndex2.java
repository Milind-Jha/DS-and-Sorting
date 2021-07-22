package DataStructures1;

public class EquilibriumIndex2 {
    public static int equilibrium(int[] arr){
        int leftsum=0;
        int rightsum=0;
        if(arr.length==1){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            rightsum+=arr[i];
        }
        int i=0;
        while (i<arr.length){
            rightsum=rightsum-arr[i];
            if(leftsum==rightsum){
                return i;
            }
            else {
                leftsum+=arr[i];
                i++;
            }
        }
        return -1;
    }
}
