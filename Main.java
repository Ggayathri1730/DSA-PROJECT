import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        Passenger arr[]=new Passenger[20];

        PassengerList list=new PassengerList();
        QueueSystem queue=new QueueSystem();
        HashTable hash=new HashTable();

        System.out.println("Enter number of passengers");

        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("Enter Passenger ID");
            int id=sc.nextInt();

            System.out.println("Enter Name");
            String name=sc.next();

            System.out.println("Start Station");
            String start=sc.next();

            System.out.println("Destination");
            String dest=sc.next();

            System.out.println("Travel Time");
            int time=sc.nextInt();

            Passenger p=new Passenger(id,name,start,dest,time);

            arr[i]=p;

            list.addPassenger(p);
            queue.enqueue(p);
            hash.insert(p);

        }

        System.out.println("\nPassenger List");

        list.displayPassengers();

        System.out.println("\nSorted by Travel Time");

        Sorting.bubbleSort(arr,n);

        for(int i=0;i<n;i++)

            arr[i].display();

        System.out.println("\nEnter Passenger ID to Search");

        int key=sc.nextInt();

        Passenger result=Searching.linearSearch(arr,n,key);

        if(result!=null)

            result.display();

        else

            System.out.println("Passenger Not Found");

        System.out.println("\nPassenger Boarding Queue");

        queue.dequeue();

        System.out.println("\nHash Table Search");

        hash.search(key);

    }

}