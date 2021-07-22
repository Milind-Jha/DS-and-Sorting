package DataStructures1;

public class StringAcontainBinSameOrder {

    static int i=0;
    public static boolean checkSequence(String a, String b) {
        if(b.length()<1){
            return false;
        }
        char x = a.charAt(0);
        char y = b.charAt(0);
        boolean temp = false;

        if(a.length()==1){
           if(x==y){
               return true;
           }
           else
               return false;
        }

        if(x!=y){
            temp = checkSequence(a.substring(1),b);
            return temp;
        }
        if(x==y){
            i++;
            temp = checkSequence(a.substring(1),b.substring(1));
            return temp;
        }
        if(i==b.length()){
            return true;
        }
        return temp;
    }
    public static void main(String[] args){
        System.out.println(checkSequence("abcdefghi","adc"));
    }

}
