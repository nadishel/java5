package home3;

import java.util.Random;

public class Hours {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801);
        System.out.println(n + " seconds");
        if (n/3600 < 1){
            System.out.println("Осталось менее часа");
        } else {
            System.out.println("Осталось " + n/3600 + " hours");
        }
    }
}
