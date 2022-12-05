package PhoneBook;

public class Contact {

    private String name;
        private String streetName;
            private String phoneNumber;
                 private String emailAddress;
     int id = 0;
    int counter = 0;

    public Contact(String name,
        String streetName,
           String phoneNumber,
             String emailAddress) {
                this.name = name;
                    this.streetName = streetName;
                        this.phoneNumber = phoneNumber;
                            this.emailAddress = emailAddress;
        id ++;

    }

    public int getId() {
        return id;
    }

        public int getCounter() {
        return counter;
    }

            public String getName() {
        return name;
    }
                public void setName(String name) {
        this.name = name;
    }
                         public String getStreetName() {
        return streetName;
    }

                                public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
                                        public String getPhoneNumber() {
        return phoneNumber;
    }
                                                public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
                                                         public String getEmailAddress() {
        return emailAddress;
    }

             public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
                         public Contact(){}

                                 public String toString(){
    return String.format("\n\n||===========================================||\n" +
                            "|| Contact Name --> %s         ||\n" +
                            "||------------------------------------------||\n" +
                            "|| Street Name --> %s         ||\n" +
                            "||------------------------------------------||\n" +
                            "|| Phone Number --> %s         ||\n" +
                            "||------------------------------------------||\n" +
                            "|| Email Address --> %s     ||\n" +
                            "||__________________________________________||\n" +
                            "|| Contact ID    --> %d                     ||\n" +
                            "||------------------------------------------||", getName(),getStreetName(),

        getPhoneNumber(),getEmailAddress(),getId());
    }
}
