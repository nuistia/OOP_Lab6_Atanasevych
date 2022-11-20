package lab6.carshop.impl;

import java.util.Scanner;

import lab6.carshop.cars.*;
import lab6.carshop.interfaCe.Admin;
import lab6.carshop.interfaCe.Customer;


public class MyOwnAutoShop implements Admin, Customer {

    static double income = 0;

    //метод, который заполняет и возвращает массив имеющихся машин
    public static Car[] ourCars() {
        Car[] myCars = new Car[5];
        myCars[0] = new Sedan(190, "black", 34000, false, 21);
        myCars[1] = new Ford(230, "white", 190040, false, 2010, 4);
        myCars[2] = new Ford(200, "red", 146230, false, 2009, 7);
        myCars[3] = new Truck(120, "brown", 200575, false, 1994);
        myCars[4] = new Truck(130, "violet", 260780, false, 2015);
        return myCars;
    }

    final static Scanner sc = new Scanner(System.in);

    public static void getIncome() {
        System.out.println("Желаете посмотреть сумму проданных автомобилей? (y / n)");
        String yn;
        yn = sc.next();
        yn = yn.toLowerCase();
        if (yn.matches("y")) {
            System.out.println(income);
        }
    }

    @Override
    public void getCarsPrice(Car[] cars) {
        for (Car car : cars) {
            System.out.print(car.getSalePrice() + ", ");
        }
        System.out.println();
    }

    @Override
    public void getCarsColor(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.getColor() + ", ");
        }
        System.out.println();
    }
    //в данном случае, как мне кажется, геттеры нужны не для того, чтобы
    //запомнить цену или цвет, а для того чтобы покупать мог узнать
    //цену или цвет определенной машины

    @Override
    public void getCarPrice(int id, Car[] cars) {
        System.out.println(cars[id - 1].getRegularPrice());
    }

    @Override
    public void getCarColor(int id, Car[] cars) {
        System.out.println(cars[id - 1].getColor());
    }

    public static void purchaseCar(int id, Car[] cars) {
        if (!cars[id - 1].isSellOut()) {
            income += cars[id - 1].getSalePrice();
            cars[id - 1].setSellOut(true);
            System.out.println("Вы успешно приобрели автомобиль.");
        } else {
            System.out.println("Машины нет в наличии.");
        }
    }

    public static void purchaseCar() {
        Car[] cars = MyOwnAutoShop.ourCars();
        String yn;
        do {
            System.out.println("Желаете приобрести автомобиль? (y/n)");
            yn = sc.next();
            yn = yn.toLowerCase();
            if (yn.matches("y")) {
                System.out.println("Выберите подходящую машину:");
                carList(cars);
                byte id = sc.nextByte();
                MyOwnAutoShop.purchaseCar(id, cars);
            }

        } while (yn.matches("y"));
    }

    public static void carList(Car[] cars) {
        System.out.println("Список машин:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
