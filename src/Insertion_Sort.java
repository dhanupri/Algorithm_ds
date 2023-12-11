import java.util.Scanner;
public class Insertion_Sort {
    //insertion sort
    public static void insertionSort(String[] arr){
        for(int i=1;i<arr.length;i++){
            String key=arr[i];
            int j=i-1;
            int res=arr[j].compareTo(key);
            while (j>=0 && res>0){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String words[]=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.nextLine();
        }
        insertionSort(words);
        for (String s:words){
            System.out.println(s);
        }
    }

}
