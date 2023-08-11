package Interview_Question;

import java.util.Scanner;

public class PalidromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Name:- ");
        String name = sc.nextLine();
        String rev = "";
        for (int i = name.length()-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.print(name +" is a Palidrom String.");
        }else {
            System.out.print(name +" is not a Palidrom String.");
        }
    }
}
