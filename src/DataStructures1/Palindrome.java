package DataStructures1;

public class Palindrome {
    static int start =0;
    static int end;
    static boolean palindrome = true;
    public static boolean isPalindrome(String word){
        if (word.length()<=1){
            return palindrome;
        }
        end = word.length()-1;
        String smallword="";
        for(int i=1;i<end;i++){
            smallword+=word.charAt(i);
        }
        if(word.charAt(start)==word.charAt(end)){
            palindrome = isPalindrome(smallword);
        }
        else {
            palindrome = false;
        }
        return palindrome;
    }
}
