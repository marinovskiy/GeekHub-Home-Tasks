package ua.marinovskiy.geekhubhometasks.hometask2;

public class Calculation {

    public static long factorial(long number) {

        if ((number == 1) || (number == 0)) {
            return 1;
        } else {
            return number * factorial(--number);
        }
    }

    public static long fibonacci(long number) {
        if ((number == 1) || (number == 2)) {
            return 1;
        } else {
            long a = 1, b = 1;
            for (long i = 2; i < number; i++) {
                a = a + b;
                b = a - b;
            }
            return a;
        }
    }

}
