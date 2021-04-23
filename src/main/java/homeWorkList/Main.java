package homeWorkList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            EpamListImpTwo<Integer> epamListImpTwo = new EpamListImpTwo<Integer>();
            epamListImpTwo.add(6);
            epamListImpTwo.add(4);
            epamListImpTwo.add(89);
            epamListImpTwo.add(2);
            System.out.println("List after add 4 Integer");
            epamListImpTwo.printAllContext();
            System.out.println("Integer in index 0 = " + epamListImpTwo.get(0));
            System.out.println("Integer in index 3 = " + epamListImpTwo.get(3));
            epamListImpTwo.remove(0);
        System.out.println("list after remove Integer in index 0");
            epamListImpTwo.printAllContext();
        System.out.println("list after remove Integer 89");
            epamListImpTwo.remove(89);
            epamListImpTwo.printAllContext();
        System.out.println("when index out of bound");
        epamListImpTwo.get(10);

    }
}
