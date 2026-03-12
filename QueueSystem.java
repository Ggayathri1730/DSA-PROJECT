public class QueueSystem {
    Passenger queue[]=new Passenger[20];

    int front=-1;
    int rear=-1;

    void enqueue(Passenger p){

        if(rear==19){

            System.out.println("Queue Full");
            return;

        }

        if(front==-1)

            front=0;

        queue[++rear]=p;

    }

    void dequeue(){

        if(front==-1 || front>rear){

            System.out.println("Queue Empty");
            return;

        }

        System.out.println("Passenger Boarding:");

        queue[front++].display();

    }
}
