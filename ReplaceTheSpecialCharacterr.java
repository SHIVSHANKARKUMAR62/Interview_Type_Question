package Interview_Question;

public class ReplaceTheSpecialCharacterr {
    public static void main(String[] args) {
        String s = "489rfgvsvakbzo1-=`=.;[;";
        s=s.replaceAll("[^a-zA-Z0-9]"," ");// all are in string formate.
        System.out.println(s);
    }
}
