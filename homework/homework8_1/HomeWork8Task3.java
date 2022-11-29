package homework8_1;

public class HomeWork8Task3 {

    public static void main(final String[] args) {
        Bus[] busses = new Bus[6];
        busses[0] = new Bus("12934", 10.2f, 4, 25, 4.3f);
        busses[1] = new Bus("64325", 10.5f, 6, 30, 2.1f);
        busses[2] = new Bus("69420", 9.95f, 4, 26, 8.3f);
        busses[3] = new Bus("65420", 9.9f, 4, 24, 1.3f);
        busses[4] = new Bus("52134", 10f, 6, 20, 4.23f);
        busses[5] = new Bus("98712", 9.5f, 4, 19, 2.2f);

        BusCompany someCompany = new BusCompany(busses);

        someCompany.printFuelConsumption();
        someCompany.sortByFuelConsumption();
        someCompany.printFuelConsumption();

        someCompany.searchByCriteria(new Bus("12934", 10.2f, 4, 25, 4.3f));
    }

}

interface Passengers {

    public int seatCount();

}

class Transport implements Passengers {
    private int wheels;
    private final int seats;
    private final float fuelConsumption;
    private float price;

    Transport(int wheels, int seats, float fuelConsumption, float price) {
        this.wheels = wheels;
        this.seats = seats;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    @Override
    public int seatCount() {
        return seats;
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

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

class Bus extends Transport {
    private final String licensePlate;

    public Bus(String licensePlate, float price, int wheels, int seats, float fuelConsumption) {
        super(wheels, seats, fuelConsumption, price);
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

}

class BusCompany {
    private final Bus[] busses;

    BusCompany(Bus[] busses) {
        this.busses = busses.clone();
    }

    public void sortByFuelConsumption() {
        Bus savedBus;

        for (int index = 0; index < busses.length; index++) {
            for (int innerIndex = 0; innerIndex < busses.length; innerIndex++) {
                if (busses[index].getFuelConsumption() < busses[innerIndex].getFuelConsumption()) {
                    savedBus = busses[index];
                    busses[index] = busses[innerIndex];
                    busses[innerIndex] = savedBus;
                }
            }
        }
    }

    public void printFuelConsumption() {
        for (Transport bus : busses) {
            System.out.print(bus.getFuelConsumption() + ", ");
        }
        System.out.println("\b\b");
    }

    public void searchByCriteria(Bus searchCriteria) {
        for (Bus buss : busses) {
            if (buss.getSeats() == searchCriteria.getSeats() && buss.getFuelConsumption() == buss.getFuelConsumption()
                    && buss.getPrice() == searchCriteria.getPrice()) {
                System.out.println("Found your bus! " + buss.getLicensePlate());
                return;
            }
        }
        System.out.println("Couldn't find a bus matching this criteria.");
    }
}