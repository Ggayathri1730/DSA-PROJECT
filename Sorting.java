public class Sorting {
     static void bubbleSort(Passenger arr[],int n){

        for(int i=0;i<n-1;i++){

            for(int j=0;j<n-i-1;j++){

                if(arr[j].time>arr[j+1].time){

                    Passenger temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }

        }

    }
}
