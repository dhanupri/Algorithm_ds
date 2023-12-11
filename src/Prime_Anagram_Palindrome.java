public class Prime_Anagram_Palindrome
{ public static void main(String[] args){
        int start= 0;
        int end= 1000;
        int flag;
        System.out.println("Prime Numbers Plaindrome and Anagram");
        //number is palindrom and Anagram
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
                if(s.equals(s1)){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
