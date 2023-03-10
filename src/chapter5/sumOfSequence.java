package chapter5;

public class sumOfSequence {

    public static  void sumOfSequenceZ(){
        long number = 100;
        int num = 0;
        for (long i = 0; i < number; i++) {
            num++;
            System.out.print( i +" * "+ num +"  = "+ i * num+" |  ");
               if (i % 5 == 0){
                   System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        sumOfSequenceZ();
    }
}
