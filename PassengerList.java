public class PassengerList {
     Node head;

    void addPassenger(Passenger p){

        Node newNode=new Node(p);

        if(head==null){

            head=newNode;
            return;

        }

        Node temp=head;

        while(temp.next!=null){

            temp=temp.next;

        }

        temp.next=newNode;

    }

    void displayPassengers(){

        Node temp=head;

        while(temp!=null){

            temp.data.display();
            temp=temp.next;

        }

    }
}
