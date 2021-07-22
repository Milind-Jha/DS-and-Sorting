package DataStructures2;

public class Main {
    public static void main(String[] args){
        DynamicArrayTwoDim dynamicArrayTwoDim = new DynamicArrayTwoDim(3);
        System.out.println(dynamicArrayTwoDim.isEmpty());
        dynamicArrayTwoDim.addNextelement(5);
        dynamicArrayTwoDim.addNextelement(6);
        dynamicArrayTwoDim.addNextelement(4);
        dynamicArrayTwoDim.addNextelement(3);
        dynamicArrayTwoDim.addNextelement(2);
        dynamicArrayTwoDim.addNextelement(1);
        dynamicArrayTwoDim.addNextelement(9);
        dynamicArrayTwoDim.addNextelement(77);
        dynamicArrayTwoDim.addNextelement(6);
        dynamicArrayTwoDim.addNextelement(65);
        dynamicArrayTwoDim.addNextelement(18);
        dynamicArrayTwoDim.addNextelement(34);
        dynamicArrayTwoDim.addNextelement(51);
        dynamicArrayTwoDim.addNextelement(66);
        dynamicArrayTwoDim.addNextelement(7);
        dynamicArrayTwoDim.addNextelement(84);

        System.out.println(dynamicArrayTwoDim.size());
        dynamicArrayTwoDim.printEntireArray();
        dynamicArrayTwoDim.delete(1,2);
        System.out.println(dynamicArrayTwoDim.isEmpty());
        dynamicArrayTwoDim.get(3,2);
        dynamicArrayTwoDim.get(5,0);
        dynamicArrayTwoDim.get(6,6);
        dynamicArrayTwoDim.get(99,2);
        System.out.println(dynamicArrayTwoDim.size());
        dynamicArrayTwoDim.printEntireArray();

    }
}
