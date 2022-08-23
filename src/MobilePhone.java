public class MobilePhone {

    // Attributes
    private String owner;
    private String colour;
    private double screenSize;

    // Constructor(s)

    public MobilePhone() {
        this.owner = "XYZ";
        this.colour = "white";
        this.screenSize = 5.0;
    }

    public MobilePhone(String owner, String colour, double screenSize) {
        this.owner = owner;
        this.colour = colour;
        this.screenSize = screenSize;
    }

    // Methods
    public void setColour(String colour) {
        this.colour = colour;
    }

    public MobilePhone clonePhone() {
        MobilePhone clonedPhone = new MobilePhone(this.owner, this.colour, this.screenSize);
        return clonedPhone;
    }

    public void ring () {
        System.out.println("ring, ring, ring!");
    }

    public String sendSMS (String receiver) {
        this.ring();
        System.out.println("hello " + receiver + ", this is " + owner);
        return "Successfully sent!";
    }

    public void print () {
        System.out.println("The owner is " + this.owner + "; The colour is " + this.colour + "; " +
                "The screen size is " + this.screenSize);
    }
}
