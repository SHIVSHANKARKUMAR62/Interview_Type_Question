package Interview_Question;

import java.util.Scanner;

public class NoSpaceBetweenTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence:- ");
        String name = sc.nextLine();
        String newString="";
        for (int i=0;i<name.length();i++){
            if ((name.charAt(i)!=' ')&&(name.charAt(i)!='\n')){
                newString = newString+name.charAt(i);
            }
        }
        System.out.print("Without Spacing Sentence:- "+newString);
    }
}
