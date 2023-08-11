package Interview_Question;

import java.util.Scanner;

public class RplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentences:- ");
        String name = sc.nextLine();
        String name1 = name.replaceAll("\s","");
        System.out.print(name1);
    }
}
