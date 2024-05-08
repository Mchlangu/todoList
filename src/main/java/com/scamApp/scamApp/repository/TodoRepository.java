package com.scamApp.scamApp.repository;

import com.scamApp.scamApp.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
