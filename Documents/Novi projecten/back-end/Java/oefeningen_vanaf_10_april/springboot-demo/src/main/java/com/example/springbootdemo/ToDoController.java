package com.example.springbootdemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("todo")
public class ToDoController {
    private List<TodoItem> todoItems;

    public ToDoController() {
        this.todoItems = new ArrayList<>();
    }

    @GetMapping
    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

    @PostMapping
    public void addTodoItem(@RequestBody TodoItem item) {
        todoItems.add(item);
    }
    // delete localhost:8080/todo
    @DeleteMapping("{id}")
    public void deleteTodoItem(@PathVariable("id") int id) {
        for (int i =0; i< todoItems.size(); i++) {
            if(todoItems.get(i).id == id) {
                this.todoItems.remove(i);
            }

        }
    }
}


// jason format voor een object in postman:
//{
//    "id":1,
//    "value": "my todo"
//}

// localhost:8080/todo