package com.booleanuk.extension;

public class Task {
    private static int nextId = 1;
    private int id;
    private String name;
    private boolean status;
    private String timeAndDate;

    // ADDED TIME AND DATE AS A STRING MEMBER ATTRIBUTE AND
    // NOT AS A REAL DATETIME OBJECT
    // TO MAKE TESTING OF THE getTaskTimeAndDate METHOD IN THE TODOLIST CLASS
    // POSSIBLE WITHOUT USING MOCKITO

    public Task(String name, String timeAndDate) {
        this.id = nextId++;
        this.name = name;
        this.status = false;
        this.timeAndDate = timeAndDate;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(String timeAndDate) {
        this.timeAndDate = timeAndDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void toggleStatus() {

    }
}
