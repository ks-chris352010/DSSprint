package ToDoList;

public class User {
    private String name;
    private Task taskHead;

    public User(String name) {
        this.name = name;
        this.taskHead = null;
    }

    public String getName() {
        return this.name;
    }

    public Task getTaskHead() {
        return taskHead;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaskHead(Task taskHead) {
        this.taskHead = taskHead;
    }
}
