package com.example.cicdtest.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "todo")
@RequiredArgsConstructor
@Getter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private Todo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static Todo of(String title, String content) {
        return new Todo(title, content);
    }

}
