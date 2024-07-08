package com.todo.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.application.entity.ToDo;

@Repository
public interface ITodoRepository extends JpaRepository<ToDo,Long>{

}
