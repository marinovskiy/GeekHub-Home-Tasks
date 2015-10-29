package ua.marinovskiy.geekhubhometasks.hometask2;

public class Calculation {

    public static long factorial(long number) {

        long result;

        if ((number == 1) || (number == 0)) {
            result = 1;
        } else {
            result = number * factorial(--number);
        }
        return result;
    }

    public static long fibonacci(long number) {

        long result;

        if ((number == 1) || (number == 2)) {
            result = 1;
        } else {
            long a = 1, b = 1;
            for (long i = 2; i < number; i++) {
                a = a + b;
                b = a - b;
            }
            result = a;
        }
        return result;
    }

}
