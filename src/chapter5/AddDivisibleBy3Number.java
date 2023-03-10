package chapter5;

import java.lang.reflect.Array;

public class AddDivisibleBy3Number {
    public static void main(String[] args) {
//        int[] array = {90,50,30,23,70,45,20};
//        int max = 0;
      int total = 0;
//        for (int i = 0; i < 30; i++) {
//            if (i % 3 == 0){
//             total    += i;
//            }
//            System.out.println();
//        }
//        System.out.println(total);
        for (int i = 0; i < 30 ; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
                total += i;
            }


        }

        System.out.println(" \n"+total);

    }
}
