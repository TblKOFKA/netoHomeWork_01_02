package ru.netology.service;

public class CustomsService {
    public static final double RATE_PRICE = 0.01;
    public static final int RATE_WEIGHT = 100;

    public static double calculateCustoms(int price, int weight) {
         double dutyCalc = price * RATE_PRICE + weight * RATE_WEIGHT;
        return dutyCalc;
    }
}


