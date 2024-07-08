package com.todo.application.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.application.entity.ToDo;
import com.todo.application.repository.ITodoRepository;
import com.todo.application.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	ITodoRepository repo;

	@Override
	public List<ToDo> getAllToDoItems() {
		List<ToDo> todoList = new ArrayList<>();
		repo.findAll().forEach(todo -> todoList.add(todo));
		return todoList;
	}

	@Override
	public ToDo getToDoItemById(Long id) {
		Optional<ToDo> Item = repo.findById(id);
		return Item.get();
	}

	@Override
	public boolean updateStatus(Long id) {
		ToDo Item = getToDoItemById(id);
		Item.setStatus("Completed");
		return saveorupdateToDoItem(Item);
	}

	@Override
	public boolean saveorupdateToDoItem(ToDo item) {
		ToDo updated = repo.save(item);
		if (Objects.nonNull(getToDoItemById(updated.getId()))) {
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteToDoItem(Long id) {
		repo.deleteById(id);
		if (Objects.isNull(getToDoItemById(id))) {
			return true;
		}
		return false;
	}

}
