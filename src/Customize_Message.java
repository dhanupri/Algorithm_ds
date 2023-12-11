import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Customize_Message {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message:");
        String message=sc.nextLine();
        // Replace <<name>> with first name
        System.out.println("Enter the name you want to replace:");
        String name=sc.nextLine();
        message=replacePlaceholder(message,name,"<<name>>");
        // Replace <<full name>> with full name
        System.out.println("Enter the full name you want to replace:");
        String fullname=sc.nextLine();
        message=replacePlaceholder(message,fullname,"<<full name>>");
        // Replace mobile number with your contact number
        System.out.println("Enter the number :");
        String number=sc.nextLine();
        message=replaceContact(message,"91-xxxxxxxxxx",number);
        // Replace date in the format XX/XX/XXXX with current date
        message=replaceDate(message,"XX/XX/XXXX");
        message=replaceDate(message,"\\d{2}/\\d{2}/\\d{4}");
        System.out.println("Modified Message");
        System.out.println(message);
    }
    static String replacePlaceholder(String s, String replacement,String placeholder){
       String replaced= s.replaceAll(placeholder,replacement);
       return replaced;
    }
    static String replaceContact(String s,String numberPattern,String number){
        return s.replaceAll(numberPattern,number);
    }
    static String replaceDate(String s,String datePattern){
        SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy");
        String currentDate=dateFormat.format(new Date());
        return s.replaceAll(datePattern,currentDate);
    }
}
