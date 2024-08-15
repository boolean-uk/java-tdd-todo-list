package com.booleanuk.extension;
import java.util.ArrayList;
import java.util.Objects;

public class TodoList {
    private ArrayList<Item> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void addTask(String message) {
        list.add(new Item(message));
    }

    public Item getTaskById(String id) {
        for (Item listItem : list) {
            if (Objects.equals(listItem.getId(), id)) {
                return listItem;
            }
        }
        return null;
    }
}
