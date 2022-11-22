package homework8_1;

public class HomeWork8Task3 {

    public static void main(final String[] args) {

    }

}

interface Passengers {

    public int seatCount();

}

class Transport {
    protected int wheels;
    protected final int seats;

    Transport(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

}

class Bus extends Transport implements Passengers {
    protected final String licensePlate;
    protected float price;

    public Bus(String licensePlate, float price, int wheels, int seats) {
        super(wheels, seats);
        this.licensePlate = licensePlate;
        this.price = price;
    }

    @Override
    public int seatCount() {
        return seats;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

}