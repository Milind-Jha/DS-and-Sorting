package DataStructures1;

public class Recursion1 {
    public static void main(String[] args){
        String a = "xyyyzwwzzz";
//        System.out.println(removeX(a));
        System.out.println(removeConsecutiveDuplicates(a));
        int x[] = {2,4,6,8,9,11,14,65};
        System.out.println(binary(x,0,x.length-1,89));
    }
    public static String removeX(String input){
        if(input.isEmpty()){
            return input;
        }
        String x = removeX(input.substring(1));
        if(input.charAt(0)=='x'){
            return x;
        }
        else {
            return input.charAt(0)+x;
        }
    }

    public static String removeConsecutiveDuplicates(String s) {

        if(s.length()<=1){
            return s;
        }

      String reoccour = s.substring(1);
        reoccour= removeConsecutiveDuplicates(reoccour);
        if(reoccour.charAt(0)==s.charAt(0)){

            return reoccour;
        }
        else {
            return s.charAt(0)+reoccour;
        }
        }
        public static int binary(int [] a , int start, int end, int x){

        int mid = (start + end)/2;
        if(a[mid]==x){
            return mid;
        }
            if(start>end){
                return -1;
            }
        else if(x>mid){
            return binary(a, mid+1, end, x);
            }
        else{
            return binary(a,start,mid-1,x);
            }
        }
}
