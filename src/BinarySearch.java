import java.util.Scanner;

public class BinarySearch {
    //search if an string present in array
    public static int binarySearch(String[] arr,String s){
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid = left + (right - left) / 2;
            int result = s.compareTo(arr[mid]);
            if(result==mid){
                return mid;
            }
            if(result>0){
                left=mid+1;
            }
            else{
                result=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String words[]=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.nextLine();
        }
        System.out.println("Enter the word want to search");
        String search=sc.next();
        int res=binarySearch(words, search);
        if(res==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+res);
        }
    }
}
