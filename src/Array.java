import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Array {
    //iterative method
    public static List<String> getAllPermutations(String input) {
        List<String> result = new ArrayList<>();
        result.add("");
        for (char currentChar : input.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            for (String permutation : result) {
                for (int j = 0; j <= permutation.length(); j++) {
                    newPermutations.add(permutation.substring(0, j) + currentChar + permutation.substring(j));
                }
            }
            result = newPermutations;
        }
        return result;
    }
//  erecursive method
    public static void getRecursivePermuntation(String s, String res, List<String> arr2) {
        if (s.length() == 0) {
            arr2.add(res);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String rem = s.substring(0, i) + s.substring(i + 1);
            getRecursivePermuntation(rem, res + ch, arr2);//recursive call
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<String> arr2=new ArrayList<>();
        //recursive method
       getRecursivePermuntation(s,"",arr2);
       //iterative method
       List<String> arr1=getAllPermutations(s);
        Collections.sort(arr1);
        Collections.sort(arr2);
        if(arr1.equals(arr2)){
            System.out.println("the two string functions are equal"+"True");
        }
        else{
            System.out.println("the two string functions are equal"+"False");
        }
    }
}
