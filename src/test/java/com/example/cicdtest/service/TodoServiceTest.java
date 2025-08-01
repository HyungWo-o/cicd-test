package com.example.cicdtest.service;

import com.example.cicdtest.controller.dto.TodoResponseDto;
import com.example.cicdtest.domain.model.Todo;
import com.example.cicdtest.domain.repository.TodoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoServiceTest {

    @Mock
    private Todo todo;

    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;

    @Test
    @DisplayName("Todo 조회")
    void getTodo() {

        // given
        Long todoId = 1L;
        when(todoRepository.findById(todoId)).thenReturn(Optional.of(todo));

        // when
        TodoResponseDto todoResponseDto = todoService.getTodo(todoId);

        // then
        assertThat(todoResponseDto.getContent()).isEqualTo(todo.getContent());

    }
}