import java.util.Arrays;
import java.util.Scanner;
public class AnagramDetection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String string2=sc.nextLine();
        char arr1[]=string1.toCharArray();
        Arrays.sort(arr1);
        char arr2[]=string2.toCharArray();
        Arrays.sort(arr2);
        int h=0;
        //Anagram or Not
        if(string1.length()!=string2.length()){
            System.out.println(string1+" and "+string2+" are not Anagram");
        }
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println(string1+" and "+string2+" are not Anagram");
                    h++;
                    break;
                }
            }
            if(h==0) {
                System.out.println(string1 + " and " + string2 + " are Anagram");
            }
        }
    }
}
