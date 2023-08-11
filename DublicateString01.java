package Interview_Question;

import java.util.Scanner;

public class DublicateString01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Dublicate String:- ");
        String s = sc.nextLine();
        int count;
        char[] c = s.toCharArray();
        for (int i=0;i<c.length;i++){
            count=1;
            for (int j = i+1;j<c.length;j++){
                if (c[i]==c[j]&&c[i]!=' '){
                    c[j]=' ';
                    count++;
                }
            }if (count>1&&c[i]!=' '){
                System.out.print(c[i]);
            }
        }
    }
}
