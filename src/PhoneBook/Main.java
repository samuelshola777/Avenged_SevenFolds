package PhoneBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact smile = new Contact("smile ",
                    "oloja",
                    "09099332737",
                    "smile@gmail.com");
            Contact samuelShola = new Contact("samuelShola",
                "ilajeBariga",
                "0907474849",
                "samuel@gmail.com");
                Contact renekay = new Contact("reneke",
                    "agbara",
                    "09099332737",
                    "rene@gmail.com");
                    Contact chioma = new Contact("chioma",
                    "amodu",
                    "08676655",
                    "chioma@gmail.com");

        phoneBook.setContact(samuelShola);
            phoneBook.setContact(smile);
                phoneBook.setContact(renekay);
                    phoneBook.setContact(chioma);

//        PhoneBook contact = new PhoneBook(samuelShola);
//        PhoneBook contact1 = new PhoneBook(smile);
//        PhoneBook contact2 = new PhoneBook(chioma);
//        PhoneBook contact3 = new PhoneBook(renekay);
//
        String answer;


        while (true) {
            print("""
                    ||========================================||\n
                    || WELCOME TO PHONE BOOK                     ||\n
                    || WHERE YOU SAVE YOUR CONTACTS              ||\n
                    =============================================
                                       
                    """);
            print("press 1 to save multiple contacts \n" +
                    "press 2 to save one contact  \n" +
                    "press 3 to view all save contact  \n" +
                    "press 4 to get contact in a specific index\n" +
                    "press 5 to change  contact name \n" +
                    "press 6 to change the number of a saved contact \n");
            int response = inputInt();
            switch (response) {
                case 1:
                    do {
                        print("enter contact name \n");
                             String name = input();
                                 System.out.println();
                             print("enter your address street name \n");
                                String streetName = input();
                                    System.out.println();
                                        print("enter phone number \n");
                                            String phoneNumber = input();
                                                System.out.println();
                                                    print("enter email address \n");
                                                        String emailAddress = input();
                                                                System.out.println();
//            print("enter contact  id\n");
//            int contactId = inputInt();

                        phoneBook.createContact(name, streetName, phoneNumber, emailAddress);

                        print("do you hAVE another contact to save?\n" +
                                "enter yes to save another contact \n" +
                                "enter no to exit contact save app\n");
                            answer = input();


                                 } while (answer.equalsIgnoreCase("yes"));
                    break;

                case 2:
                    print("enter contact name \n");
                        String name = input();
                             System.out.println();
                                print("enter your address street name \n");
                                    String streetName = input();
                    System.out.println();
                        print("enter phone number \n");
                            String phoneNumber = input();
                                System.out.println();
                                    print("enter email address \n");
                    String emailAddress = input();
                        System.out.println();
                             phoneBook.setContact(name, streetName, phoneNumber, emailAddress);
                    break;
                case 3:
//                PhoneBook phoneBook2 = new PhoneBook();
                    phoneBook.printContactInContactList();
                    break;
                case 4:
                    phoneBook.findContactById();
                    break;
                case 5:
                    phoneBook.changeContactName();
                    break;
                case 6:
                    phoneBook.changeContactNumber();
                break;
                case 7:
                    phoneBook.deleteContact();


            }
        }
    }



    public static  int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    public static  String input(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        return word;
    }
    public static void  print(String word){
        System.out.print(word);

    } public static void  print(int num){
        System.out.println(num);

    }
}
