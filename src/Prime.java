public class Prime {
    public static void main(String[] args){
        int start= 0;
        int end= 1000;
        int flag;
        //get prime  ranges from 0 to 1000
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
                System.out.println(i);
            }
        }
    }
}
