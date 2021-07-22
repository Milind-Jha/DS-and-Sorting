package DataStructures1;

public class TowerofHanoi {
    // Difficulty- MEDIUM
    public static void towerOfHanoi(int disks, char source,char helper, char destination){
        if(disks == 1){
            System.out.println("Move disk "+ disks +" from "+source + " to " + destination);
            return;
        }
        towerOfHanoi(disks-1,source,destination,helper);
        System.out.println("Move disk "+ disks +" from "+source + " to " + destination);
        towerOfHanoi(disks-1,helper,source,destination);
    }
    public static void main(String[] args){
        char source ='a';
        char helper ='b';
        char destination ='c';
        towerOfHanoi(3,source,helper,destination);
    }
}
