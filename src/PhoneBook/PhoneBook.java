package PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private    int id;
    public  void setContact(String name,
                            String streetName,
                            String phoneNumber,
                            String emailAddress){
        Contact contact = new Contact( name,  streetName,  phoneNumber, emailAddress);
        contactsList.add(contact);
    }
    public static void print(String word){
        System.out.println(word);
        }
       public static void print(Contact contact){
                System.out.println(contact);
                    }
           public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
                     public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        return word;
    }
    private ArrayList<Contact> contactsList = new ArrayList<>() ;
        public PhoneBook(){}
             public PhoneBook(Contact contact) {
                this.contactsList =  new ArrayList<>();
                    this.contactsList.add(contact);

    }
 public ArrayList<Contact> getContactsList() {
        return contactsList;
    }
    public void setContactsList(Contact contact) {
        this.contactsList =  new ArrayList<>();
            this.contactsList.add(contact);
    }

   public void createContact(String name, String streetName, String phoneNumber,
        String emailAddress){
        Contact contact = new Contact(name, streetName, phoneNumber, emailAddress);
            contactsList.add(contact);
   }
            public void findContactById(){

//    while (true) {

        try {
            print("please enter id number of contact to get \n");
             id = inputInt();
            print(contactsList.get(id));
        } catch (IndexOutOfBoundsException tinu) {
            print("the contact at index  " + id + "  does not exist ");
        }

//    }
}
                public void setContact(Contact contact){
                    contactsList.add(contact);
}
                        public void changeContactName(){
//    while (true) {
            print("the id location of the contact you want to change the name");
        id = inputInt();

           try {
               print(contactsList.get(id));
               String name = inputString();
               contactsList.get(id).setName(name);
           } catch (IndexOutOfBoundsException tinu) {
               print("the contact at index  " + id + "  does not exist ");
           }
           print("enter name the replacing name ");
          ;
//           break;
//       }
}
                             public  void printContactInContactList(){
     for (int i = 0; i < contactsList.size(); i++) {
         System.out.println(contactsList.get(i));
     }
  }

                                public void changeContactNumber(){
            try {
                print("the number location of the contact you want to change  ");
                 id = inputInt();
                print("please enter the number you want to replace with  ");
                String num = inputString();
                contactsList.get(id).setPhoneNumber(num);

            }catch (IndexOutOfBoundsException reneke){
                print("the inputed id does not exist  ");
            }
            }
                                      public void deleteContact(){
            print("please enter location of the contact to be deleted ");
            int id = inputInt();
            contactsList.remove(id);
            }

}