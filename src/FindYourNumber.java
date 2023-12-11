import java.util.Scanner;
public  class FindYourNumber {
    //to find the number on binart=y search
    public static int search(int low, int high, int n){
        if(n==0){
            return low;
        }
        int mid=(low+high)/2;
        System.out.println("Is number between "+low+"and"+mid+"?(yes/no)");
        Scanner sc=new Scanner(System.in);
        String ans=sc.nextLine().toLowerCase();
        if(ans.equals("yes")){
            return search(low,mid,n-1);
        }
        else if(ans.equals("no")){
            return search(mid+1,high,n-1);
        }
        else{
            System.out.println("Invalid input....");
            return search(low,high,n);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int low=0;
        int high = (int) Math.pow(2,n)-1;
        System.out.println("Think a number between 0 and "+high);
        int result=search(low,high,n);//function call
        System.out.println(result);
    }
}