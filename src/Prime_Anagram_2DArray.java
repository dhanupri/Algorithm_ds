import java.util.ArrayList;

public class Prime_Anagram_2DArray {
    //method to seperate anagram and non anagram
    public static ArrayList<Integer> prime_number(int start,int end,int flag,ArrayList<Integer> prime_list,int n){
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
                String s=i+"";
                String s1="";
                for (int k=s.length()-1;k>=0;k--){
                    s1+=s.charAt(k);
                }
                if(n==1) {
                    if (s.equals(s1)) {
                        prime_list.add(i);
                    }
                }
                if(n==2){
                    if (!s.equals(s1)) {
                        prime_list.add(i);
                    }

                }
            }
        }
        return prime_list;
    }
    public static void main(String[] args){
        //initialise 2D array
        int arr[][]=new int[10][];
        //create arraylist
        ArrayList<Integer> prime_Anagram=new ArrayList<>();
        ArrayList<Integer> prime_Not_Anagram=new ArrayList<>();
        int start=0;
        int end=1000;
        //function call for prime number anagram
        ArrayList<Integer> arr1=prime_number(start,end,0,prime_Anagram,1);
        arr[0]=new int[arr1.size()];
        for (int j=0;j<arr1.size();j++){
            arr[0][j]=arr1.get(j);
        }
        //function call for prime number not  anagram
        ArrayList<Integer> arr2=prime_number(start,end,0,prime_Not_Anagram,2);
        arr[1]=new int[arr2.size()];
        for (int j=0;j<arr2.size();j++){
            arr[1][j]=arr2.get(j);
        }
        //display the 2D array
        for (int i=0;i<2;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
