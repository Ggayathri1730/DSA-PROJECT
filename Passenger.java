public class Passenger {
    int id;
    String name;
    String start;
    String destination;
    int time;

    Passenger(int id,String name,String start,String destination,int time){

        this.id=id;
        this.name=name;
        this.start=start;
        this.destination=destination;
        this.time=time;

    }

    void display(){

        System.out.println(id+" "+name+" "+start+" -> "+destination+" Time:"+time);

    }

}
