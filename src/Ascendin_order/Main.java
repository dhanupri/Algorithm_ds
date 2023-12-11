package Ascendin_order;
import java.io.*;
import java.util.Scanner;
public class Main {
    //read the file
    public static  void readFile(String filename, LinkedList linkedList){
        try(BufferedReader br=new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line=br.readLine())!=null){
                int num = Integer.parseInt(line);
                    linkedList.insertSortedList(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //write the file and disply it
    public static <K> void writeFile(String filename, LinkedList linkedList){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filename))) {
          Node temp=linkedList.head.next;
            while (temp!=null){
                writer.write(temp.data+"\n");
                temp=temp.next;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList linkedList=new LinkedList();
        //input filepath
        String filename="E:\\DS&Algorithms\\src\\Ascendin_order\\input.txt";
        readFile(filename,linkedList);
        //output filepath
        filename="E:\\DS&Algorithms\\src\\Ascendin_order\\output.txt";
        writeFile(filename,linkedList);


    }
}
