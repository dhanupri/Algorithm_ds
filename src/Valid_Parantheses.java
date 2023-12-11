import java.util.Scanner;
import java.util.Stack;
public class Valid_Parantheses {
    public static boolean check(String s){
        //create a stack
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
            boolean isBalanced=false;
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                    isBalanced=true;
                }
            }
            if(stack.isEmpty() && isBalanced){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//input from user
        boolean res=check(s);//functional call
        System.out.println(res);
    }
}
