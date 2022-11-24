package homework8;

public class HomeWork8Task2 {

    public static void main(final String[] args) {
        Flower[] flowers = new Flower[5];
        flowers[0] = new Rose("red", 12, 4.2f);
        flowers[1] = new Daisy("white", 24, 2.35f);
        flowers[2] = new Tulip("pink", 23, 5f);
        flowers[3] = new Daisy("yellow", 14, 3.6f);
        flowers[4] = new Rose("white", 11, 4f);

        float price = 0;
        int min = flowers[0].getLifespan(), max = 0;
        for (Flower flower : flowers) {
            price += flower.getPrice();

            if (flower.getLifespan() > max) {
                max = flower.getLifespan();
            }

            if (flower.getLifespan() < min) {
                min = flower.getLifespan();
            }
        }

        System.out.println("This bouquet costs: $" + price + " and first flower will fade in: " + min + " hours, last: " + max + " hours.");
    }

}

class Flower {
    private String type;
    private String color;
    private int lifespan;

    private float price;

    Flower(String type, String color, int lifespan, float price) {
        this.type = type;
        this.color = color;
        this.lifespan = lifespan;
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void timeUntilFades() {
        System.out.println("This " + type + " will fade in " + lifespan + " hours.");
    }

}

class Rose extends Flower {

    public Rose(String color, int lifespan, float price) {
        super("Rose", color, lifespan, price);
    }

}

class Tulip extends Flower {

    public Tulip(String color, int lifespan, float price) {
        super("Tulip", color, lifespan, price);
    }

}

class Daisy extends Flower {

    public Daisy(String color, int lifespan, float price) {
        super("Daisy", color, lifespan, price);
    }

}