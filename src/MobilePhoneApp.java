public class MobilePhoneApp {
    public static void main(String[] args) {

        // Declaration and creation of MobilePhone object in 2 lines
        MobilePhone myPhone;
        myPhone = new MobilePhone();

        // Declaration and creation of MobilePhone object in 1 line
        MobilePhone defaultPhone = new MobilePhone();

        // Using the second constructor to initialise
        MobilePhone johnPhone = new MobilePhone("John", "red", 7.0);
        johnPhone.print();

        // Calling the ring method on defaultPhone
        defaultPhone.ring();

        // Calling the sendSMS method on John's phone and printing the acknowledgement message
        System.out.println(johnPhone.sendSMS("Jane"));

        // Wrong way to copy/clone an object (Uncomment these lines below)
//        MobilePhone clonedPhone = johnPhone;
//        johnPhone.setColour("yellow");
//        clonedPhone.print();
        // clonedPhone still points to the object in memory pointed to by John's phone.
        // There is no new object created in this process.
        // When any fields in John's phone is changed, so does it in clonedPhone

        // Proper way to clone an object
        MobilePhone clonedPhone = johnPhone.clonePhone();
        johnPhone.setColour("yellow");
        clonedPhone.print();
        // Cloned phone's colour never changed, as they are two different objects with the same specifications/field values




    }
}
