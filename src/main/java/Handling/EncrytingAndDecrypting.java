package Handling;

public class EncrytingAndDecrypting {
    public String encrypting(int number){
        // getting the number one at a time
        int firstNumber = number / 1000;
        number = number % 1000;
        int secondNumber = number/ 100;
        number = number % 100;
        int thirdNumber = number / 10;
        number = number % 10;
        int forthNumber = number;
        // adding seven to each of the number
        firstNumber = firstNumber + 7;
        secondNumber = secondNumber + 7;
        thirdNumber = thirdNumber + 7;
        forthNumber = forthNumber + 7;
        // modding the number one at a time
        firstNumber = firstNumber % 10;
        secondNumber = secondNumber % 10;
        thirdNumber = thirdNumber % 10 ;
        forthNumber = forthNumber % 10;

        return String.format("%2d,%2d, %2d, %2d",firstNumber
                ,secondNumber,
                thirdNumber
                ,forthNumber);
    }
}
