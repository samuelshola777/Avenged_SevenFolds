package justExercise;

import java.util.Scanner;

public class ValidateNetWorkPhoneNumberz {

    private static Scanner scanner = new Scanner(System.in);

    public boolean validateForMtN(String mntNumberZ) {
        String[] mntNumber = {"0803", "0816", "0903", "0810", "0806", "0703", "0706", "0813",
                "0814", "0906"};
        for (int i = 0; i < mntNumber.length; i++) {
            if (mntNumber[i].equals(mntNumberZ)) {
                return true;
            }
        }
        return false;
    }

    public boolean validForAirtel(String airtel) {
        String[] airtelNumbers = {"0802", "0808", "0708", "0812", "0701", "0901", "0904", "0907", "0912"};
        for (int i = 0; i < airtelNumbers.length; i++) {
            if (airtelNumbers[i].equals(airtel)) {
                return true;
            }
        }
        return false;
    }

    public boolean validateForGLo(String glo) {
        String[] gloNumbers = {"0805", "0905", "0807", "0811", "0705", "0815"};
        for (int i = 0; i < gloNumbers.length; i++) {
            if (gloNumbers[i].equals(glo)) {
                return true;
            }
        }
        return false;
    }

    public boolean validateForEtisalat(String etisalat) {
        String[] etisalatNumbers = {"0909", "0908", "0818", "0809", "0817"};
        for (int i = 0; i < etisalatNumbers.length; i++) {
            if (etisalatNumbers[i].equals(etisalat)) {
                return true;
            }
        }
        return false;
    }

    public boolean validateForVisaFone(String visaFone) {
        String[] visaFoneNumbers = {"0704", "07026", "07025"};
        for (int i = 0; i < visaFoneNumbers.length; i++) {
            if (visaFoneNumbers[i].equals(visaFone)) {
                return true;
            }
        }
        return false;
    }


    public String allNetWorkValisdation(String checkNum) throws ValidateNumberExeption {
        checkForPhoneNumberLength(checkNum);
        holdFirstFourDigit(checkForPhoneNumberLength(checkNum));

        validateForEtisalat(holdFirstFourDigit(checkNum));

        if (validateForEtisalat(holdFirstFourDigit(checkNum)) == false) {

            validateForVisaFone(holdFirstFourDigit(checkNum));

        } else return "Your Mobile Number is ETISALAT Number";
        if (validateForVisaFone(holdFirstFourDigit(checkNum)) == false) {

            validateForMtN(holdFirstFourDigit(checkNum));

        } else return "Your Mobile Number is A VISAFONE Number";
        if (validateForMtN(holdFirstFourDigit(checkNum)) == false) {

            validForAirtel(holdFirstFourDigit(checkNum));
        } else return "Your Mobile Number is An MTN Number ";
        if (validForAirtel(holdFirstFourDigit(checkNum)) == false) {

            validateForGLo(holdFirstFourDigit(checkNum));

        } else return " Your Mobile Number is An AIRTEL number ";
        if (validateForGLo(holdFirstFourDigit(checkNum)) == true) {
            return " Your Mobile Number is A Glo number ";

        } else return "you have entered a wrong number ";
//
    }

    public String ifContainAlphabet(String number)  {
        char[] alphabets = {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'c', 'C', 'f', 'F', 'g', 'G', 'h',
                'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S',
                't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'};

        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (number.charAt(i) == alphabets[j]) {
                    return "  you have entered a Mobile number that contain an alphabet ";
                }
            }
        }
        return number;
    }


    public static void main(String[] args) throws ValidateNumberExeption {
        ValidateNetWorkPhoneNumberz valid = new ValidateNetWorkPhoneNumberz();
        while (true) {
            System.out.println("please enter your mobile number ");
            String mobileNumber = scanner.nextLine();
            System.out.println(valid.allNetWorkValisdation(mobileNumber));
        }

    }

    public String checkForPhoneNumberLength(String mobileNumber)  {
        if (mobileNumber.length() < 11) {
            return "your have entered an invalid lenght of number ";
        }
        return mobileNumber;
    }


    public String holdFirstFourDigit(String mobileNumber) {
        String firstFour = "";
        for (int i = 0; i < 4; i++) {
            firstFour += mobileNumber.charAt(i);
        }
        return firstFour;
    }
}
