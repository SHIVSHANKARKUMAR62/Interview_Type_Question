package Interview_Question;

import java.util.Scanner;

public class dublicateCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The size of an array:- ");
        int n = sc.nextInt();
        int cont =0;
        String []arr = new String[n];
        System.out.print("Enter a String value:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.print("String Value is:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i].equals(arr[j])){
                    cont++;
                }
            }
        }

        System.out.println();
        System.out.print("Same String Coming in my Array is:- "+cont);

    }
}
