package ToDoList;

public class Task {
    private String description;
    private boolean completed;
    private Task next;

    public Task(String description) {
        this.description = description;
        this.completed = false;
        this.next = null;
    }

    public String getDescription() {
        return description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public Task getNext() {
        return next;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setNext(Task next) {
        this.next = next;
    }

}
