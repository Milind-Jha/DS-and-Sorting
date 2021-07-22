package DataStructures1;

public class PairStars {
    static String ans = "";
    public static String addStars(String s) {

        if (s.length() <= 1) {
            return s;
        }
        String out = addStars(s.substring(1));
        if (s.charAt(0) == s.charAt(1)) {
            out = s.charAt(0) + "*" + s.charAt(1) + out.substring(1);
        } else {
            out = s.charAt(0) + out;
        }
        return out;
    }

    public static void main(String [] args){
        System.out.println(checkAB("abbaabb"));
    }
    public static boolean checkAB(String input) {
        if(input.length()<=1){
            return true;
        }
        if(input.length()==3 && input=="abb"){
            return true;
        }
        boolean temp = checkAB(input.substring(1));
        if(input.charAt(0)=='a' && input.charAt(1)=='a'){
            temp = temp & true;
        }
        if(input.length()>=2 && input.charAt(0)=='a' && input.charAt(1)=='b' && input.charAt(2)=='b' ){
            temp = temp & true;
        }
        if(input.length()>=2 && input.charAt(0)=='b' && input.charAt(1)=='b' && input.charAt(2)=='a' ){
            temp = temp & true;
        }
        return temp;
    }
}
