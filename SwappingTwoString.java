package Interview_Question;

import java.util.Scanner;

public class SwappingTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1,name2,temp=" ";
        System.out.print("Enter First String Name:- ");
        name1=sc.nextLine();
        System.out.print("Enter Second String:- ");
        name2=sc.nextLine();
        System.out.println("Before Swapping Value of First String is "+name1+" and Second String is "+name2);
        temp=name1;
        name1=name2;
        name2=temp;
        System.out.println("After Swapping Value of First String is "+name1+" and Second String is "+name2);
    }
}
