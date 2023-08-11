package Interview_Question;

import java.util.Scanner;

public class repeatingIgnore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word:- ");
        String name = sc.nextLine();
        char []ch = name.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<ch.length;i++){
            boolean repeating = false;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    repeating = true;
                    break;
                }
            }
            if (!repeating){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);

        System.out.println("..............");

        // 2nd approach

        for (int i=0;i<ch.length;i++){
            boolean repeating = false;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    repeating = true;
                    break;
                }
            }
            if (!repeating){
                System.out.print(ch[i]);
            }
        }

    }
}
