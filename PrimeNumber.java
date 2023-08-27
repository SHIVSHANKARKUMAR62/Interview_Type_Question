import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
            int m = n/2;
            for (int i=2; i<=m; i++){
                if (n%i==0){
                    flag=1;
                    break;
                }
            }
        if (flag==1 || n == 0 || n==1){
            System.out.print(n+" is not a prime Number...");
        }else {
            System.out.print(n+" is a prime Number...");
        }
    }
}
