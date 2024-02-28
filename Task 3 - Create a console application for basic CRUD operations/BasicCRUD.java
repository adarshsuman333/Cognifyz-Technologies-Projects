import java.util.*;

class TaskList{
    private int taskCode;
    private String taskTitle;
    private String taskDetails;

    TaskList(int taskCode, String taskTitle, String taskDetails){
        this.taskCode = taskCode;
        this.taskTitle = taskTitle;
        this.taskDetails = taskDetails;
    }

    public int getTaskCode(){
        return taskCode;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTastDetails() {
        return taskDetails;
    }

    @Override
    public String toString() {
        return "Task code : " + taskCode + "\n" +
                "Task title : " + taskTitle + "\n" +
                "Task details : " + taskDetails;
    }
}

public class BasicCRUD {
    public static void main(String[] args) {

        // We have created two instances of Scanner class. One is for the integer input and
        // the other one is for the String input because it would create problems if we try to take
        // integer input and String input from the same scanner instance.
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        // Whenever we want to update the data, we can make use of List iterator. List iterator is
        // available in the List Collection. So, we will make use of List Collection.
        // Whenever we use List Collection, we will be able to access the functionalities of List Iterators.
        List<TaskList> collection = new ArrayList<TaskList>();

        // A user has to enter his choice
        int choice;
        do {
            System.out.println("1. Create your tasks");
            System.out.println("2. Display your tasks");
            System.out.println("3. Update your tasks");
            System.out.println("4. Delete your tasks");
            System.out.print("Enter your choice : ");
            choice = intScanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter task code : ");
                    int taskCode = intScanner.nextInt();
                    System.out.print("Enter task title : ");
                    String taskTitle = stringScanner.nextLine();
                    System.out.print("Enter task details : ");
                    String taskDetails = stringScanner.nextLine();

                    //Adding task details to the List collection class
                    collection.add(new TaskList(taskCode, taskTitle, taskDetails));
                break;

                case 2:
                    System.out.println("------------------------------------------------");

                    // Iterator is a function which is used to retrieve each and every record
                    // one by one.
                    // Iterator instance is having the object so we can say that this iterator is the
                    // collection of employee.
                    Iterator<TaskList> iterator = collection.iterator();

                    //The .hasNext() method returns true if an iterator or a ListIterator object has more
                    //elements. Returns false otherwise.
                    while (iterator.hasNext()) {

                        // If the task is available then retrieve the tasks one by one.
                        TaskList taskList = iterator.next();

                        // Printing the task
                        System.out.println(taskList);
                    }
                    System.out.println("------------------------------------------------");
                break;

                case 3:
                    boolean found = false;
                    System.out.println("Enter task code to update : ");
                    taskCode = intScanner.nextInt();
                    System.out.println("------------------------------------------------");

                    //This function is used to initialize the collection to list iterator.
                    ListIterator<TaskList> listIterator = collection.listIterator();

                    while (listIterator.hasNext()) {
                        // It means if the task is available then we can get the listIterator.next
                        // into taskList
                        TaskList taskList = listIterator.next();
                        if (taskList.getTaskCode() == taskCode ){
                            System.out.print("Enter task's new code : ");
                            taskCode = intScanner.nextInt();

                            System.out.print("Enter new task title : ");
                            taskTitle = stringScanner.nextLine();

                            System.out.print("Enter new task details : ");
                            taskDetails = stringScanner.nextLine();

                            listIterator.set(new TaskList(taskCode, taskTitle, taskDetails));

                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found");
                    }
                    else{
                        System.out.println("Record is updated successfully...!");
                    }
                    System.out.println("------------------------------------------------");
                break;

                case 4:
                    found = false;
                    System.out.println("Enter task code to delete : ");
                    taskCode = intScanner.nextInt();
                    System.out.println("------------------------------------------------");
                    iterator = collection.iterator();
                    while (iterator.hasNext()) {
                        TaskList taskList = iterator.next();
                        if (taskList.getTaskCode() == taskCode){
                            iterator.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Task was not found");
                    }
                    else{
                        System.out.println("Task is deleted successfully...!!!");
                    }
                    System.out.println("------------------------------------------------");
                break;
            }
        }while (choice!=0);
    }
}