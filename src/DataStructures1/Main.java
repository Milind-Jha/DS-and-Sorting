package DataStructures1;

public class Main {
    public static void main(String [] args){
    double ans = GeoSum.GeometricSum(8);
//        System.out.println(ans);
//        String word = "racecar";
//        System.out.println(Palindrome.isPalindrome(word));
        System.out.println(countZerosRec(9));
    }

    public static int countZerosRec(int input){
        int number =0;                   // NOTE: number declared inside the function
        if(input!=0 && input<10){
            return 0;
        }
        if(input==0){
            number++;
           return number;
        }
        int remainder = input%10;
        if(remainder == 0){
            number++;
        }
         int temp= countZerosRec(input/10);
        number = number+ temp;
        return number;
    }
}
