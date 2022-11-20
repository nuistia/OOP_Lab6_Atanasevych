package lab6.carshop.cars;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;

    public Ford() {
        year = 0;
        manufacturerDiscount = 0;
    }

    public Ford(int speed,
                String color,
                double regularPrice,
                boolean isSellOut,
                int year,
                int manufacturerDiscount) {
        setSpeed(speed);
        setColor(color);
        setRegularPrice(regularPrice);
        setSellOut(isSellOut);
        setYear(year);
        setManufacturerDiscount(manufacturerDiscount);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return regularPrice * (100 - manufacturerDiscount) / 100;
    }

    @Override
    public String toString() {
        return "[Ford; " +
                "Speed: " + speed + "; " +
                "Color: " + color + "; " +
                "Price: " + getSalePrice() + "; " +
                "In stock: " + !isSellOut() + "; " +
                "Year: " + year + "; " +
                "Man. Disc.: " + manufacturerDiscount + "]";
    }
}
