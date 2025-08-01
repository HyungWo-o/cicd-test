package com.example.cicdtest.service;

import com.example.cicdtest.controller.dto.TodoResponseDto;
import com.example.cicdtest.domain.model.Todo;
import com.example.cicdtest.domain.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public void createTodo(String title, String content) {
        todoRepository.save(Todo.of(title, content));
    }

    public TodoResponseDto getTodo(Long todoId) {
        Todo todo = todoRepository.findById(todoId).orElseThrow(
                RuntimeException::new
        );

        return TodoResponseDto.of(todo.getTitle(), todo.getContent());
    }

}
