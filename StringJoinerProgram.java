package Interview_Question;

import java.util.StringJoiner;

public class StringJoinerProgram {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("Shiv")
                .add("Shankar")
                .add("Rahul")
                .add("Roshan");
        System.out.println(sj);

    }
}
