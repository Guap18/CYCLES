package ru.netology.services;

public class Urlaubservice {
    public int calculate(int income, int expenses, int threshold) {
        int total = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (total >= threshold) {
                total -= expenses;
                total /= 3;
                counter++;
            } else {
                // total = total + income;
                total += income;
                // total = total - expenses;
                total -= expenses;
            }
        }
        return counter;
    }
}
