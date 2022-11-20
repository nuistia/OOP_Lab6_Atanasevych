package lab6.carshop;

import lab6.carshop.impl.MyOwnAutoShop;

import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyOwnAutoShop.purchaseCar();
        MyOwnAutoShop.getIncome();
        System.out.println("До свидания!");
    }
}
