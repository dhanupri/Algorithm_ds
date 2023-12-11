import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
public class Calender {
    //print the calender
    public static void printCalender(int month,int year){
        LocalDate firstDayMonth=LocalDate.of(year,month,1);
        DayOfWeek firstDayOfWeek=firstDayMonth.getDayOfWeek();
        String s1="";
        s1+=firstDayOfWeek;
        Month s=Month.of(month);
        int numOfDaysInMonth=firstDayMonth.lengthOfMonth();
        //create 2D array
        int[][] CalenderArray=new int[6][7];
        //create arraylist
        ArrayList<String> arr=new ArrayList<>();
        arr.add("SUNDAY");
        arr.add("MONDAY");
        arr.add("TUESDAY");
        arr.add("WEDNESDAY");
        arr.add("THURSDAY");
        arr.add("FRIDAY");
        arr.add("SATURDAY");
        int day=1;
        int n1=arr.indexOf(s1);
        for (int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(i==0 && j<n1){
                    CalenderArray[i][j]=-1;
                }
                else if(day<=numOfDaysInMonth){
                    CalenderArray[i][j]=day;
                    day++;
                }
                else{
                    CalenderArray[i][j]=-1;
                }
            }
        }
        System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                if(CalenderArray[i][j]==-1){
                    System.out.print("    ");
                }
                else {
                    System.out.printf("%4d",CalenderArray[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int month= sc.nextInt();
        int year=sc.nextInt();
        printCalender(month,year);
    }
}
