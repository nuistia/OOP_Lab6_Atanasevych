package lab6.carshop.cars;

public class Sedan extends Car {
    int length;


    public Sedan(int speed,
          String color,
          double regularPrice,
          boolean isSellOut,
          int length) {
        setSpeed(speed);
        setColor(color);
        setRegularPrice(regularPrice);
        setSellOut(isSellOut);
        setLength(length);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice*0.95;
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
                "Length: " + length + "]";
    }
}
