package DataStructures1;

public class EquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr){
        int sum=0;
        if(arr.length==1){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        float hs = 0f;
        for( int i=1;i<arr.length;i++){
            float half = (sum-arr[i])/2f;
            hs+=arr[i-1];
            int j =0;

//            float halfsum=0f;
//            while (j<i){
//                halfsum+=arr[j];
//                j++;
//            }
            if(hs==half){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] x = {6,1,6,5,3,0,5,0,5,6,0};
        System.out.println(arrayEquilibriumIndex(x));
        System.out.println(EquilibriumIndex2.equilibrium(x));
    }
}
