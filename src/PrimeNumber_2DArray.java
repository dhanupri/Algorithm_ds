import java.util.ArrayList;
public class PrimeNumber_2DArray {
    //function to check if number is prime or not
    public static ArrayList<Integer> prime_number(int start,int end,int flag,ArrayList<Integer> prime){
        for (int i=start;i<=end;i++){
            if(i==1 || i==0){
                continue;
            }
            flag=1;
            for (int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                prime.add(i);
            }
        }
        return prime;
    }
    public static void main(String[] args){
        //initialise 2D array
       int arr[][]=new int[10][];
        //initialise Arraylist
       ArrayList<Integer> prime=new ArrayList<>();
        int start=0;
        int end=100;
       for (int i=0;i<10;i++){
           ArrayList<Integer> arr1=prime_number(start,end,0,prime);
           start=end+1;
           end+=100;
           prime=new ArrayList<>();
           arr[i]=new int[arr1.size()];
           for (int j=0;j<arr1.size();j++){
               arr[i][j]=arr1.get(j);
           }
       }
       for (int i=0;i<arr.length;i++){
           for (int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
