package DataStructures1;

public class SplitArray {
    public static boolean splitArray(int input[]) {
        boolean ans=true;
        boolean temp = checkArray(input);
            if(temp == false){
                return false;
            }
            else{
                int partition=0;
                int leftsum=0;
                int sum =0;
                int rightsum;
                for (int a:input) {
                    sum+=a;
                }
                for(int i=1;i<input.length;i++){
                    leftsum+=input[i-1];
                    rightsum=sum-leftsum-input[i];
                    if(leftsum==rightsum){
                        partition = i;
                    }
                }
                for(int i=0;i<partition;i++){
                    if(input[i]%5==0&&input[i]%3==0){
                        ans = ans&&false;
                    }
                    else if(input[i]%5==0&&input[i]%3!=0){
                        ans = ans&&true;
                    }
                }
                for(int i=partition+1;i<input.length;i++){
                    if(input[i]%5==0&&input[i]%3==0){
                        ans = ans&&false;
                    }
                    else if(input[i]%5==0&&input[i]%3!=0){
                        ans = ans&&true;
                    }
                }
            }
            return ans;
        }

    private static boolean checkArray(int[] input) {
        if(input.length<2){
            return false;
        }
        if(input.length==2){
            if(input[0]==input[1]){
                return true;
            }
            else
                return false;
        }
        int leftsum=0;
        int sum =0;
        int rightsum;
        for (int a:input) {
            sum+=a;
        }
     for(int i=1;i<input.length;i++){
         leftsum+=input[i-1];
         rightsum=sum-leftsum-input[i];
         if(leftsum==rightsum){
             return true;
         }
     }
        return false;
    }
}
