package Interview_Question;

class userDefinedThread extends Thread{
    @Override
    public void run() {
        System.out.print("I am Usear a defined Thread.");
    }
}


public class ThreadClass {
    public static void main(String[] args) {
        // This is a Main thread class
        System.out.println("Thread is Started.....");
        int a = 40+50;
        System.out.println("Sum is "+a);
        // Thread
        Thread t = Thread.currentThread();
        String s = t.getName();
        System.out.println("Name of the Current thared is:- "+s);
        t.setName("Shiv");
        System.out.println("Set The name of the Thread By me:- "+t.getName());
        try { //this is show the exception so we use tray catch because this is enterpitachan.
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thread Id Number is:- "+t.getId());

        // creation of usear defined thread
        userDefinedThread us = new userDefinedThread();
        us.start(); // this is to start your thread

        System.out.println("Thread is ended......");   // 1st run main thread after that your thread will be rum
    }
}
