public class Searching {
    static Passenger linearSearch(Passenger arr[],int n,int key){

        for(int i=0;i<n;i++){

            if(arr[i].id==key)

                return arr[i];

        }

        return null;

    }
}
