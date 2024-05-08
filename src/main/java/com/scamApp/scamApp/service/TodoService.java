package com.scamApp.scamApp.service;

import com.scamApp.scamApp.entity.Todo;

import java.util.List;

public interface TodoService {

    void saveTodo(Todo todo);

    void updateTodo(Long id, Todo todo);

    Todo  getTodoById(Long id);

    void deleteTodo(Long id);

    List<Todo> getAllTodo();
}
