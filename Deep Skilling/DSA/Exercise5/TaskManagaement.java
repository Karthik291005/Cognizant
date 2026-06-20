package Exercise5;
class Task{
    int taskId;
    String taskName;
    String status;
    Task next;
    Task(int taskId,String taskName,String status){
        this.status = status;
        this.taskId = taskId;
        this.taskName = taskName;
        this.next = null;
    }
    void display(){
        System.out.println("Task id : "+taskId+", Task Name : "+taskName+", Task status : "+status);
    }
}
class Tasks{
    Task head = null;
    void addTask(Task t){
        if(head==null){
            head = t;
        }
        else{
            Task temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = t;
        }
    }
    Task searchTask(int id){
        Task temp = head;
        while(temp!=null){
            if(temp.taskId == id){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    void deleteTask(int id){
        if(head == null){
            System.out.println("No tasks in the list");
            return;
        }
        if(head.taskId == id){
            head = head.next;
            return;
        }
        else{
            Task temp = head;
            while(temp.next!= null){
                if(temp.next.taskId==id){
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }
        System.out.println("Task not found");
    }
    void display(){
        Task temp = head;
        while(temp!=null){
            temp.display();
            temp = temp.next;
        }
    }
}
public class TaskManagaement {
    public static void main(String args[]){
        Tasks tasks = new Tasks();
        tasks.addTask(new Task(1,"PL/SQL","Pending"));
        tasks.addTask(new Task(2,"DSA","Completed"));
        tasks.addTask(new Task(3,"DP&DP","Completed"));
        tasks.display();
        tasks.searchTask(3);
        tasks.deleteTask(2);
        System.out.println("After deleting tasks : ");
        tasks.display();
    }
}
