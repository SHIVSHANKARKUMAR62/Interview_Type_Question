package Interview_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:- ");
        String name = sc.nextLine();
        char []ch = name.toCharArray();
        for(int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]>ch[j]) {
                    char temp;
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.print(ch);

        // 2nd approach
        System.out.println("..............................................");
        Arrays.sort(ch);
        System.out.print(ch);
    }
}
