package ru.netology.sqr;
public class SQRService {

    public int calcSqrt(int min, int max) {
        int counter = 0; //счетчик
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        return counter;
    }
}
