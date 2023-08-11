package Interview_Question;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ConCateTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[];
        String name1[];
        System.out.print("Enter the Size of the Array:- ");
        int n=sc.nextInt();
        name = new String[n];
        name1 = new String[n];
        System.out.print("Enter First String Elements:- ");
        for (int i=0;i<n;i++){
            name[i]=sc.next();
        }
        System.out.print("First String Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(name[i]+" ");
        }

        System.out.println();

        System.out.print("Enter Second String Elements:- ");
        for (int i=0;i<n;i++){
            name1[i]=sc.next();
        }
        System.out.print("Second String Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(name1[i]+" ");
        }

        System.out.println();

        Stream<String> n1 = Arrays.stream(name);
        Stream<String> n2 = Arrays.stream(name1);

        String [] all = Stream.concat(n1,n2).toArray(s -> new String[s]);


        System.out.print("All String Elements are:- ");
        for (String s : all){
            System.out.print(s+" ");
        }

    }
}
