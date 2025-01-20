package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 1;

    static { //to initialize a static variable
        todos.add(new Todo(todosCount, "in28minutes", "Learn AWS" , LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn DevOps" , LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Fullstack" , LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
        todos.add(new Todo(++todosCount, username, description, targetDate, isDone));

    }
}
