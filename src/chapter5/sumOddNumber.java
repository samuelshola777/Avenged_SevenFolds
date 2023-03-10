package chapter5;

import java.util.Arrays;

public class sumOddNumber {

      int [] saveSpot = new int[100];
    private int addUp ;


    public int addOddNumber(){
        for (int i = 0; i < 99; i++) {

            if (i % 99 != 0) {
                addUp += i;
                saveSpot[i] += addUp;
                System.out.println(saveSpot[i]);

            }
        }
        return addUp ;
    }
    public void numberDivisle(){
int sum = 0;
        int count = 30;
        while (count > 0){

            if (count % 3 == 0){
                System.out.println(count);
                sum += count;
                System.out.println(sum);
            }
            count--;
        }
    }

     public void numNewLine(){
        int i = 0;
        while (i < 20){
            System.out.println(i+"  this your I");
            if (i % 5 == 0){
                System.out.println();
            }
            i++;
        }
     }
    public static void main(String[] args) {
      sumOddNumber sum = new  sumOddNumber();
        int [] numb = new int[30];

       System.out.println(sum.addOddNumber());
        double num = 2.5;
        System.out.println();
        System.out.println("mathe "+Math.pow(num, 3));
        sum.numNewLine();
        sum.numberDivisle();
    }
}
