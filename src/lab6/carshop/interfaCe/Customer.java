package lab6.carshop.interfaCe;

import lab6.carshop.cars.Car;

public interface Customer {
    void getCarsPrice(Car[]cars);
    void getCarsColor(Car[] cars);
    void getCarPrice(int id, Car[] cars);
    void getCarColor(int id, Car[] cars);

    public static void purchaseCar(int id, Car[] cars){}
}
