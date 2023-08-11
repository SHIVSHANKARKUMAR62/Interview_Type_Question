package Interview_Question;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random(1000);
        int a = r.nextInt();
        System.out.println(a);
    }
}
