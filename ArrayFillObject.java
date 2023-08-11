package Interview_Question;

import java.util.Arrays;

public class ArrayFillObject {
    public static void main(String[] args) {
        Object []num = new Object[100];
        Arrays.fill(num,new Object(){
            int count=0;
            public String toString(){
                System.out.println("Shiv");
                return Integer.toString(++count);
            }

        });

        System.out.println("Print 1 to 100 without using any loop.");
        System.out.println(Arrays.toString(num));
        Arrays.toString(num);

    }
}
