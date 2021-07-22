package DataStructures1;

public class Staircase {
    public static int staircase(int n){
        int count =0;
        if(n-3>0){
            count = 3;
            int x = staircase(n-1);
            int y = staircase(n-2);
            int z = staircase(n-3);
            return count+x+y+z;
        }
        else if(n-3==0){
            return 4;
        }
        else if(n-2>=0){
            return 2;
        }
        else if(n-1>=0){
            return 1;
        }
        else
            return 0;
    }
    public static void main(String[] args){
        System.out.println(staircase(7));
    }
}
