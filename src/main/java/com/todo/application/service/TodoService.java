package com.todo.application.service;

import java.util.List;

import com.todo.application.entity.ToDo;


public interface TodoService {

	List<ToDo> getAllToDoItems();

	ToDo getToDoItemById(Long id);

	boolean updateStatus(Long id);

	boolean saveorupdateToDoItem(ToDo item);

	boolean deleteToDoItem(Long id);

}
