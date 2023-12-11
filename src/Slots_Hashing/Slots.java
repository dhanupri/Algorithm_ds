package Slots_Hashing;
import java.io.*;
import java.util.*;
public class Slots {
    private Map<Integer, LinkedList<Integer>> slotMap;//hashmap
    public Slots() {
        slotMap = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            slotMap.put(i, new LinkedList<>());//insert in hashmap
        }
    }
    //read the file and map in hashmap according to index
    public void storeNumbers(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                int slot = num % 11;
                slotMap.get(slot).add(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //search if number/slot present or not
    public void searchNumber(int number) {
        int slot = number % 11;
        LinkedList<Integer> chain = slotMap.get(slot);
        if (chain.contains(number)) {
            chain.remove((Integer) number);
            System.out.println("Number found and removed from slot " + slot);
        } else {
            chain.add(number);
            System.out.println("Number not found, added to slot " + slot);
        }
    }
    //write the file
    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i <= 10; i++) {
                writer.write(i+"-index : ");
                for (int num : slotMap.get(i)) {
                    writer.write(num + " , ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Slots slot = new Slots();
        slot.storeNumbers("E:\\DS&Algorithms\\src\\Slots_Hashing\\input.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you need to search");
        int n= sc.nextInt();
        slot.searchNumber(n); // Example search
        slot.saveToFile("E:\\DS&Algorithms\\src\\Slots_Hashing\\output.txt");
    }
}