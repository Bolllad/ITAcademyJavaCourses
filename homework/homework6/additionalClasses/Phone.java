package homework6.additionalClasses;

public class Phone {
    int number;
    double weight;
    String model;

    public Phone(int number, double weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model.toString();
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling.");
    }

    public void receiveCall(String name, int number) {
        System.out.println(name + " is calling. " + number);
    }

    public int getNumber() {
        return this.number;
    }

    public void sendMessage(int ...numbers) {
        System.out.print("Messaging: ");

        for (int num : numbers) {
            System.out.print(num + ", ");
        }

        System.out.print("\b\b\n");
    }
}
