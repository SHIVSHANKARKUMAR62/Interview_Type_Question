package Interview_Question;

class Consume extends Thread{

    Company c;
    Consume(Company c){
        this.c=c;
    }
    @Override
    public void run() {
        while (true){

            try {
                this.c.consume_item();
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Producer extends Thread{

    Company c;
    Producer(Company c){
        this.c=c;
    }

    @Override
    public void run() {
        int i=1;
        while (true){

            try {
                this.c.produce_item(i);
                Thread.sleep(1000);
                i++;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Company {

    int n;
    boolean f = false;

    synchronized public void produce_item(int n) throws InterruptedException {
        this.n=n;
        if (f){
            wait();
        }
        f=true;
        System.out.println("Produce Number : "+this.n);
    }

    synchronized public int consume_item() throws InterruptedException {
        if (!f){
            wait();
        }
        f=false;
        notify();
        System.out.println("Consume Number : "+this.n);
        return this.n;
    }

    public static void main(String[] args) {
        Company company = new Company();
        Consume c = new Consume(company);
        Producer p = new Producer(company);
        p.start();
        c.start();
    }
}
