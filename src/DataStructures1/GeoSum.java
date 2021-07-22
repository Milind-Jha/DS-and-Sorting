package DataStructures1;

public class GeoSum {
    static double sum;
    public static double GeometricSum(int k){ // 1 + 1/2 + 1/4 + 1/8....
        if( k ==0 ){
            return 1;
        }
        sum = GeometricSum(k-1);
        double element = Math.pow(2,-k);
        sum+=element;
        return sum;
    }

    static int s=0;
    public static int sumOfDigits(int input){
        if(input==0){
            return 0;
        }
        int num = input%10;
        input=input/10;
        s=num+sumOfDigits(input);
        return s;
    }
}
