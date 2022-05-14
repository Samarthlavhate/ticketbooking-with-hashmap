import java.sql.SQLOutput;
import java.util.*;

public class bookticketmain {
    public static void main(String[] args) {
        ArrayList<Flight> FA = new ArrayList<>();
        Flight p1 = new Flight("e1002", "chennai", "mumbai", "4:10", 5000);
        Flight p3 = new Flight("jh1254", "kolkata", "hyderabad", "7:20", 9500);
        Flight p4 = new Flight("sm10055", "indore", "gwalior", "6:00", 3500);
        Flight p5 = new Flight("gj7894", "gujrat", "delhi", "7:33", 7700);
        Flight p6 = new Flight("dl8866", "delhi", "kashi", "2:10", 2999);
        Flight p7 = new Flight("sp7785", "pune", "tawang", "9:00", 15000);
        FA.add(p1);
        FA.add(p3);
        FA.add(p4);
        FA.add(p5);
        FA.add(p6);
        FA.add(p7);
        FA.stream().forEach(System.out::println);
        ArrayList<Passenger> pass = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        ArrayList<ticketdetails> tc= new ArrayList<>();
            int j=0;
            int f=0;
            while(j!=2){
            Passenger pass1 = new Passenger();
            System.out.println("enter passenger name");
            pass1.setFull_name(sc.next());
            System.out.println("enter passenger age");
            pass1.setAge(sc.nextInt());
            System.out.println("enter passenger phno");
            pass1.setPhno(sc.next());
            pass.add(pass1);
            System.out.println("which flight you want");
            ticketdetails tcd=new ticketdetails(pass.get(j),FA.get(f= sc.nextInt()));
            tc.add(tcd);
            System.out.println();
                j++;
        }

         hashpassenger hf=new hashpassenger();

        System.out.println(hf.insert(tc));









        ///binary tree,singly list,doubly list
        //arraylist, linkedlist,
        //hashmap,hash table ,treeset int pas=INTERGER.PARSEint
    }
}