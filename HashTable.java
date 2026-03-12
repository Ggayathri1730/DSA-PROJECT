public class HashTable {
    
    Passenger table[]=new Passenger[10];

    int hash(int id){

        return id%10;

    }

    void insert(Passenger p){

        int index=hash(p.id);

        while(table[index]!=null){

            index=(index+1)%10;

        }

        table[index]=p;

    }

    void search(int id){

        int index=hash(id);

        while(table[index]!=null){

            if(table[index].id==id){

                table[index].display();
                return;

            }

            index=(index+1)%10;

        }

        System.out.println("Passenger Not Found");

    }
}
