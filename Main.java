import ToDoList.UserManager;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Create users and add tasks for each:
        userManager.createUser("The Dark One");
        userManager.addTask("The Dark One", "Buy groceries");
        userManager.addTask("The Dark One", "Usher in a thousand years of darkness");

        userManager.createUser("Bob");
        userManager.addTask("Bob", "Finish homework");
        userManager.addTask("Bob", "Do something");

        userManager.createUser("Charlie");
        userManager.addTask("Charlie", "Go for a walk");
        userManager.addTask("Charlie", "Conquer the planet");

        userManager.createUser("Diana");
        userManager.addTask("Diana", "Cook dinner");
        userManager.addTask("Diana", "Go on a drive");

        userManager.createUser("Ash");
        userManager.addTask("Ash", "Write a report");
        userManager.addTask("Ash", "Become the very best");

        // View tasks for each user
        System.out.println("Viewing tasks for The Dark One:");
        userManager.viewTasks("The Dark One");

        System.out.println("\nViewing tasks for Bob:");
        userManager.viewTasks("Bob");

        System.out.println("\nViewing tasks for Charlie:");
        userManager.viewTasks("Charlie");

        System.out.println("\nViewing tasks for Diana:");
        userManager.viewTasks("Diana");

        System.out.println("\nViewing tasks for Ash:");
        userManager.viewTasks("Ash");

        // Mark a task as completed for Bob and view tasks again:
        userManager.markTaskCompleted("Bob", "Do something");
        System.out.println("\nViewing tasks for Bob after marking 'Do something' as completed:");
        userManager.viewTasks("Bob");

        // Test the getUsers method:
        System.out.println("\nList of all users:");
        for (String userName : userManager.getUsers()) {
            System.out.println(" - " + userName);
        }
    }
}