package Linked_List;

import java.io.*;
public class Main {
    //read the input file
    public static <K> void readFile(String filename, LinkedList linkedList){
        try(BufferedReader br=new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line=br.readLine())!=null){
                String[] words=line.split(" ");
                for (String word:words){
                    linkedList.append((K) word);//append in linkedlist
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //write the file
    public static <K> void writeFile(String filename,LinkedList linkedList){
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
    public static <K> void main(String[] args) throws IOException {
        //input file path
       String filename="E:\\DS&Algorithms\\src\\Linked_List\\input.txt";
        LinkedList<K> linkedList = new LinkedList<>();
        readFile(filename,linkedList);
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word you need to search:");
        String serach_word=input.readLine();
       linkedList.search( (K) serach_word);
       //output file path
      filename="E:\\DS&Algorithms\\src\\Linked_List\\output.txt";
      writeFile(filename,linkedList);
    }
}
