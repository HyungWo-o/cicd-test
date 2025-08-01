package com.example.cicdtest.controller;

import com.example.cicdtest.controller.dto.TodoRequestDto;
import com.example.cicdtest.controller.dto.TodoResponseDto;
import com.example.cicdtest.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todo")
    public void createTodo(@RequestBody TodoRequestDto todoRequestDto) {
        todoService.createTodo(todoRequestDto.getTitle(), todoRequestDto.getContent());
    }

    @GetMapping("/todo/{todoId}")
    public TodoResponseDto getTodo(@PathVariable Long todoId) {
        return todoService.getTodo(todoId);
    }

}
