package lab6.carshop.cars;

public class Truck extends Car {
    int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Truck() {
        weight = 0;
    }

    public Truck(int speed,
          String color,
          double regularPrice,
          boolean isSellOut,
          int weight) {
        setSpeed(speed);
        setColor(color);
        setRegularPrice(regularPrice);
        setSellOut(isSellOut);
        setWeight(weight);
    }

    @Override
    public double getSalePrice() {
        //если вес больше 2000, скидка 10%
        if (weight > 2000) {
            return regularPrice * 0.9;
        }
        return regularPrice;
    }

    @Override
    public String toString() {
        return "[Sedan; " +
                "Speed: " + speed + "; " +
                "Color: " + color + "; " +
                "Price: " + getSalePrice() + "; " +
                "In stock: " + !isSellOut() + "; " +
                "Weight: " + weight + "]";
    }
}
