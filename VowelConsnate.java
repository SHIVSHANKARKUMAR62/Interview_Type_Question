package Interview_Question;

import java.util.Scanner;

public class VowelConsnate {

    public static boolean vowel(char v){
        return v=='a'||v=='e'||v=='i'||v=='0'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter a String Value:- ");
        name=sc.nextLine();
        int count=0;

        System.out.print("Vowel Present in the String is:- ");
        for (int i=0;i<name.length();i++){
            if (vowel(name.charAt(i))){
                System.out.print(name.charAt(i)+" ");
                count++;
            }
        }

        System.out.println();

        System.out.print("Vowel coming in the String count:- "+count);

    }
}
