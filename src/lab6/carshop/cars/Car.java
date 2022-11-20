package lab6.carshop.cars;

public abstract class Car {
    int speed;
    boolean isSellOut;
    double regularPrice;
    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setSellOut(boolean sellOut) {
        isSellOut = sellOut;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public boolean isSellOut() {
        return isSellOut;
    }

    public Car() {
        speed = 0;
        color = "none";
        regularPrice = 0;
        isSellOut = false;
    }

    public Car(int speed,
        String color,
        double regularPrice,
        boolean isSellOut) {
        setSpeed(speed);
        setColor(color);
        setRegularPrice(regularPrice);
        setSellOut(isSellOut);
    }
    public abstract double getSalePrice();
}
