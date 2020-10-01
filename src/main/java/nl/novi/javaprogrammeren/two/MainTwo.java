package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int totalsum = 0;
        for (int i = 0; i < 10; i++) {
            totalsum = totalsum + random.nextInt();
        }
        System.out.println("totalSum is " + totalsum);
    }
}
