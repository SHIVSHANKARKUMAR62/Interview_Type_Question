package Interview_Question;

class A{
    public void Math1(){
        System.out.println("I am Math 1.");
    }
}

class B extends A{
    public void Math2(){
        System.out.println("I am Math 2.");
    }
}

class C extends A{
    public void Math3(){
        System.out.println("I am Math 3.");
    }
}

class D extends B {
    public void Math4(){
        System.out.println("I am Math 4.");
    }
}

public class Hybrid_Interface {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        b.Math1();
        b.Math2();

        c.Math1();
        c.Math3();

        d.Math1();
        d.Math2();
        d.Math4();
    }
}
