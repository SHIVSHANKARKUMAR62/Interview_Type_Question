package Interview_Question;

public class SubString01 {
    public static void main(String[] args) {
        String s = "abcd";
        int a = s.length();
        System.out.println(s);
        for (int i=0;i<=a;i++){
            for (int j=i+1;j<a+1;j++) {
                System.out.print(s.substring(i, j) + " ");
            }
        }
    }
}
