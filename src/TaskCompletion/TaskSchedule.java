package TaskCompletion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class TaskSchedule {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of task:");
        int n= sc.nextInt();
        Task[] tasks=new Task[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the deadline for task:");
            int deadline= sc.nextInt();
            System.out.println("Enter the time for task: ");
            int time= sc.nextInt();
            tasks[i]=new Task(deadline,time);
        }
        Arrays.sort(tasks, Comparator.comparingInt(Task::getDeadline)); // Sort tasks by deadline in ascending order
        //Calculate maximum time exceeded for each task
        int totalTime=0;
        for (Task task:tasks){
            totalTime+=task.time;
            int overtime=Math.max(0,totalTime-task.deadline);
            System.out.println(overtime);
        }
    }
}
