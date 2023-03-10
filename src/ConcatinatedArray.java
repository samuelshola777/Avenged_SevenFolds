public class ConcatinatedArray {

    public static void addArray(int[]num1, int[]num2){
        int[] receive = new int[num2.length + num1.length];

        for (int i = 0; i < num1.length; i++) {
            receive[i] = num1[i];
        }
            for (int j = num1.length; j < num2.length; j++) {


                receive[j] = num2[j];

        }
//        int i = 0;
//        for (; i < num1.length; i++) {
//            receive[i] = num1[i];
//        }
//        for (; i < num1.length + num2.length; i++) {
//            receive[i] = num2[i - num1.length];
//        }
      for (int value: receive) {
          System.out.print(value + "    ");
      }
    }

    public static void main(String[] args) {

        int[] goat = {56, 67, 89 ,90 ,68};
        int[] goat2 = {45,76, 43, 12};

        addArray(goat2,goat);

    }

}
