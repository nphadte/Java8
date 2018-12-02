package A_Basics;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        for (int i = 0; i < 20; i++) {
            int face = 1 + randomNumber.nextInt(6);
            System.out.println("The number rolled is :" + face);
        }
    }
}
