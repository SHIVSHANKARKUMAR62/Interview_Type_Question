package Interview_Question;

public class Dublicate_Value {
    public static void main(String[] args) {
        String []st = {"Shiv","Rahul","Shiv","Rahul"};
        for (int i=0;i<st.length;i++){
            for (int j=i+1;j<st.length;j++){
                if (st[i].equals(st[j])){
                    System.out.print(st[i]+" ");
                }
            }
        }
    }
}
