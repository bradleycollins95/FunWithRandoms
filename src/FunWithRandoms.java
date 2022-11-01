import java.util.Random;

public class FunWithRandoms {

    public static void main(String[] args) {
        System.out.println("Fun with random numbers!");

        Random random = new Random();

        //Generate 10 random integers between 1-100 to simulate class marks
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, ", random.nextInt(100));
        }

        System.out.println("random ints\n");

        //Generate 10 random integers
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, ", random.nextInt(0, 100));

        }
    }
}

