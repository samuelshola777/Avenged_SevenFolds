package chapter5;

public class multiplicationTable {
    public static void main(String[] args) {
        for (int line = 1; line < 13; line++) {
            for (int number = 1; number < 6; number++) {
                System.out.print(number +" * "+ line +" = ");
                System.out.printf("%2d\t\t| ",number*line);

            }
            System.out.println();
        }
    }
}
