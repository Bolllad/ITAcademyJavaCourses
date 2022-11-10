package homework6;

import homework6.additionalClasses.Phone;

public class HomeWork6Task2 {

    public static void main(final String[] args) {
        Phone myPhone = new Phone(2281337, 0.34, "redmi note 9s");
        Phone otherPhone = new Phone(1623567, 0.29, "samsung note 10");
        Phone anotherPhone = new Phone(4202243, 0.38, "some phone");

        int currentNumber = myPhone.getNumber();
        System.out.println(currentNumber);

        myPhone.receiveCall("Siargei", 1239854);
        myPhone.sendMessage(1623567, 4202243, 1239854);

        currentNumber = otherPhone.getNumber();
        System.out.println(currentNumber);

        otherPhone.receiveCall("Unknown");
        otherPhone.sendMessage(8123642, 9264523);

        currentNumber = anotherPhone.getNumber();
        System.out.println(currentNumber);

        anotherPhone.receiveCall("ITAcademy");
        anotherPhone.sendMessage(1239854);
    }

}
