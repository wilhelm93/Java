import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    public static List<String> taskList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to the toDolist");
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running){
            System.out.println("Please select an option:");
            System.out.println("1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            String taskName = "";

            switch (option) {
                case 1:
                    System.out.println("Please add task's name: ");
                    taskName = scanner.nextLine();
                    String result = addTask(option, taskName);
                    System.out.println(result);
                    break;

                case 2:
                    String listResult = listAddedTasks(option, taskName);
                    break;

                case 3:
                    System.out.println("Which task should be removed?");
                    String taskToRemove = scanner.nextLine();
                    System.out.println(removeTask(taskToRemove));
                    break;

                case 4:
                    System.out.println("Exiting the programm...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-4");
                    break;
            }
        }

        scanner.close();
    }
        public static String addTask ( int option, String taskName){
            taskList.add(taskName);
            return "Task added: " + taskName + "\n" + "----------";
        }
        public static String listAddedTasks ( int option, String taskName){
            if (taskList.isEmpty()){
            	System.out.println("Task list es empty!");
            }
        	
        	System.out.println("--- Current Tasks ---");
            for (String element : taskList) {
                System.out.println("-> " + element);
            }
            return ""; // Return empty string since we printed directly
        }

        public static String removeTask (String taskName) {
            System.out.println("Removing task...");
            taskList.remove(taskName);
            System.out.println("Task removed: " + taskName + "\n" + "----------");
            return  "";
        }

    }
