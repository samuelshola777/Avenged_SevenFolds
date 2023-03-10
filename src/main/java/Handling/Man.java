package Handling;

public class Man extends Human{
    private int dickSize;


    public Man(int dickSize) {
        this.dickSize = dickSize;
    }

    public Man(String name, int age, COMPLEXION color,
               String phoneNumber, String email, Address address, int dickSize) {
        super(name, age, color, phoneNumber, email, address);
        this.dickSize = dickSize;
    }

    public Man() {}

    public int getDickSize() {
        return dickSize;
    }

    public void setDickSize(int dickSize) {
        this.dickSize = dickSize;
    }

    @Override
    public String displayName() {
        return String.format("""
                           My name is %s
                           My boobSize is %d%n
                           """, super.getName(), this.dickSize);
    }
}
