package com.tasklist.TaskListCapstone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasklist.TaskListCapstone.entity.Task;


public interface TaskRepository extends JpaRepository<Task, Integer> {

	List<Task> findByEmpid(Integer id);
}
