package Handling;

public class Woman extends Human {
   private int boobSize;

   public Woman(int boobSize) {
      this.boobSize = boobSize;
   }

   public Woman(String name, int age, COMPLEXION color,
                String phoneNumber, String email, Address address, int boobSize) {
      super(name, age, color, phoneNumber, email, address);
      this.boobSize = boobSize;
   }

   public Woman() {}

   @Override
   public String displayName() {
      return String.format("""
                           My name is %s
                           My boobSize is %d%n
                           """, super.getName(), this.boobSize);
   }
}
