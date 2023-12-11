import java.util.Scanner;
public class Merge_Sort {
    //method to split
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right) {
            int mid = left+(right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr,left,mid,right);
        }
    }
    //method to merge
    public static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int Left_arr[]=new int[n1];
        int right_arr[]=new int[n2];
        for (int i=0;i<n1;i++){
            Left_arr[i]=arr[left+i];
        }
        for (int j=0;j<n2;j++){
            right_arr[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        while (i<n1 && j<n2){
            if(Left_arr[i]<=right_arr[j]){
                arr[k]=Left_arr[i];
                i++;
            }
            else{
                arr[k]=right_arr[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=Left_arr[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right_arr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //initialise array
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        //display
        for (int i:arr){
            System.out.println(i);
        }

    }
}
