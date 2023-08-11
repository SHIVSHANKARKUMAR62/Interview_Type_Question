package Interview_Question;

import java.util.HashSet;
import java.util.Iterator;

public class TreeSetProgram {
    public static void main(String[] args) {
        HashSet<String> string = new HashSet<>();
        string.add("Shiv");
        string.add("Rahul");
        string.add("Ashik");
        string.add("Mohit");
        for (String a:string){
            System.out.println(a);
            StringBuffer sb = new StringBuffer(a);
            System.out.println(sb.reverse());
        }
        System.out.println(".....................................................");

        Iterator<String> itr = string.iterator();
        while (itr.hasNext()){
            String naxt = itr.next();
            System.out.println(naxt);
        }

    }
}
