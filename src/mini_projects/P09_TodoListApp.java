package mini_projects;

import java.util.ArrayList;
import java.util.Scanner;

/*
Project: Todo List App

Menu:
1 - Add task
2 - Remove task
3 - List tasks
4 - Exit

Input:
- menu choice
- task text / task number

Output:
- updated todo list
*/
public class P09_TodoListApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("=== Todo List App ===");

        while (true) {
            System.out.println("\n1- Add task");
            System.out.println("2- Remove task");
            System.out.println("3- List tasks");
            System.out.println("4- Exit");

            System.out.print("Choose an option: ");
            String choiceStr = input.nextLine();

            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (Exception e) {
                System.out.println("ERROR! Please enter a number (1-4).");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter new task: ");
                String task = input.nextLine().trim();

                if (task.isEmpty()) {
                    System.out.println("ERROR! Task cannot be empty.");
                } else {
                    tasks.add(task);
                    System.out.println("Task added!");
                }

            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("Todo list is empty.");
                    continue;
                }

                System.out.println("Enter task number to remove:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + "- " + tasks.get(i));
                }

                System.out.print("Task number: ");
                String numStr = input.nextLine();

                int index;
                try {
                    index = Integer.parseInt(numStr) - 1;
                } catch (Exception e) {
                    System.out.println("ERROR! Invalid number.");
                    continue;
                }

                if (index < 0 || index >= tasks.size()) {
                    System.out.println("ERROR! Task number out of range.");
                } else {
                    String removed = tasks.remove(index);
                    System.out.println("Removed: " + removed);
                }

            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("Todo list is empty.");
                } else {
                    System.out.println("Your tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + "- " + tasks.get(i));
                    }
                }

            } else if (choice == 4) {
                System.out.println("Goodbye...");
                break;

            } else {
                System.out.println("ERROR! Invalid choice. Please select 1-4.");
            }
        }
    }
}
