package Interview_Question;

import java.util.Scanner;

public class CountUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter a String value:- ");
        name = sc.nextLine();
        int count=0;
        // 1st way
        for (int i=0;i<name.length();i++){
            if (Character.isUpperCase(name.charAt(i))){
                count++;
            }
        }

        System.out.print("1st way  to count the Upper case coming in the string:- "+count);


        System.out.println();
        // 2nd way

        int temp=0;
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)>='A'&&name.charAt(i)<='Z'){
                temp++;
            }
        }

        System.out.print("2nd way  to count the Upper case coming in the string:- "+temp);

        System.out.println();

        // 3rd way

        int ss=0;
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)>=65&&name.charAt(i)<=90){
                ss++;
            }
        }

        System.out.print("3rd way  to count the Upper case coming in the string:- "+ss);


        // 4th way
        System.out.println();

        long count1 = name.chars().filter(e->Character.isUpperCase(e)).count();
        System.out.println("4th way  to count the Upper case coming in the string:- "+count1);

        // 5th way
        long count2 = name.chars().filter(e->e>=65&&e<=90).count();
        System.out.print("5th way  to count the Upper case coming in the string:- "+count2);

    }
}
