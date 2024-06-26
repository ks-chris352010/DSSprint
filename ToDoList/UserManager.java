package ToDoList;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private final List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public ArrayList<String> getUsers() {
        ArrayList<String> userNames = new ArrayList<>();
        for (User user : users) {
            userNames.add(user.getName());
        }
        return userNames;
    }

    public User findUser(String name) {
        for (User user: users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public void createUser(String name) {
        if (findUser(name) != null) {
            throw new IllegalArgumentException("User with name '"+name+"' already exists.");
        }

        User newUser = new User(name);
        users.add(newUser);
        System.out.println("User: '"+name+"' has been created.");
    }

    public void addTask(String name, String description) {
        User user = findUser(name);
        if (user == null) {
            throw new IllegalArgumentException("User: '"+name+"' not found.");
        }
        Task newTask = new Task(description);
        if (user.getTaskHead() == null) {
            user.setTaskHead(newTask);
        } else {
            Task current = user.getTaskHead();
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
        System.out.println("Task: '"+description+"' added to user: '"+name+"'");
    }

    public void markTaskCompleted(String name, String taskDescription) {
        User user = findUser(name);
        if (user == null) {
            throw new IllegalArgumentException("User '" + name + "' not found.");
        }

        Task current = user.getTaskHead();
        while (current != null) {
            if (current.getDescription().equals(taskDescription)) {
                current.setCompleted(true);
                System.out.println("Task '" + taskDescription + "' marked as completed for user '" + name + "'.");
                return;
            }
            current = current.getNext();
        }
        throw new IllegalArgumentException("Task '" + taskDescription + "' not found for user '" + name + "'.");
    }

    public void viewTasks(String name) {
        User user = findUser(name);
        if (user == null) {
            throw new IllegalArgumentException("User '" + name + "' not found.");
        }

        Task current = user.getTaskHead();
        if (current == null) {
            System.out.println("User '" + name + "' has no tasks.");
            return;
        }

        System.out.println("Tasks for user '" + name + "':");
        while (current != null) {
            String status = current.getCompleted() ? "completed" : "pending";
            System.out.println("  - " + current.getDescription() + " (" + status + ")");
            current = current.getNext();
        }
    }
}
