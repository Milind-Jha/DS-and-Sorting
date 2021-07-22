package DataStructures1;

public class StringToInteger {

    public static int convertStringToInt(String input){
        if(input.length()==0){
            return 0;
        }
        int ans =0;
        int x = input.length();
        int y = input.charAt(0);
        y= y-48;
        ans = (int) (y* Math.pow(10,x-1));
        int temp = convertStringToInt(input.substring(1));
        ans=ans+temp;
        return ans;
    }
    public static void main(String [] args){
        System.out.println(convertStringToInt("09612"));
    }
}
