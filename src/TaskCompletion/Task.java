package TaskCompletion;
public class Task {
    int deadline;
    int time;
    Task(int deadline,int time){
        this.deadline=deadline;
        this.time=time;
    }
    public int getDeadline() {
        return deadline;
    }
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
}
