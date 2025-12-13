package practice_12;

import java.time.LocalDateTime;

public class Task<T> {
    private T id;
    private Status status;
    private Priority priority;
    private LocalDateTime date;
    public enum Status { NEW, IN_PROGRESS, DONE }
    public enum Priority { LOW, MEDIUM, HIGH }

    public Task(T id, Status status, Priority priority, LocalDateTime date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() { return id; }
    public Status getStatus() { return status; }
    public Priority getPriority() { return priority; }
    public LocalDateTime getDate() { return date;}

    }
