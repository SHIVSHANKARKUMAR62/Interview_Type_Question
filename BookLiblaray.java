package Interview_Question;



import java.util.Scanner;

public class BookLiblaray {

    Node head = null;

    static class Node{
        String BookT;
        Node next;
        Node(String BookT){
            this.BookT=BookT;
            this.next=null;
        }

    }

    public void BookLibrary(){
        //Node new_Node = head;
        Scanner sc = new Scanner(System.in);
        int n;
        String Book_Name;
        do {
            System.out.print("Enter Book Name:- ");
            Book_Name = sc.next();
            Node new_node = new Node(Book_Name);
            if (head==null){
                head=new_node;
            }else {
                Node temp = head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=new_node;

            }

            System.out.print("If You Want to Take more Book Then Press 1 other press any other key:- ");
            n=sc.nextInt();
        }while (n==1);
    }

    public void viewBook(){
        Node temp1 = head;
        if (temp1==null){
            System.out.println("There have no any book present in the labary");
        }else {
            System.out.print("Books are:- ");
            while (temp1!=null){
                System.out.println(temp1.BookT);
                temp1=temp1.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookLiblaray bl = new BookLiblaray();
        int n;
        do {
            System.out.print("Enter Your Choice\n1.Create Labary\n2.View Book\n3.Exit\n");
            n=sc.nextInt();
            switch (n){
                case 1->
                    bl.BookLibrary();
                case 2->
                    bl.viewBook();
                case 3->
                    System.exit(1);
            }
        }while (true);
    }
}
