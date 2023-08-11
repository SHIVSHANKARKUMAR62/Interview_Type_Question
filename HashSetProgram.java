package Interview_Question;
// import util package (all classes).
import java.util.*;

public class HashSetProgram {
    public static void main(String[] args) {
        // creating collection 1. type save collecetion(same type of objection collection) 2.un type safe(different types of element ccan be added).
        // type safe collection
        ArrayList<String> name = new ArrayList<>();
        name.add("Shiv");
        name.add("Rahul");
        name.add("Suman");
        //name.add(1234);->through an error

        // Un type safe
        LinkedList list = new LinkedList();
        list.add("Shiv");
        list.add(4556);
        list.add("Rahul");
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.get(0));
        name.add("Bandana");
        name.remove(1);
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.contains("Shiv"));// this is check to that element is present or not
    }
}
