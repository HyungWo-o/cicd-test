package com.example.cicdtest.domain.repository;

import com.example.cicdtest.domain.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {



}
