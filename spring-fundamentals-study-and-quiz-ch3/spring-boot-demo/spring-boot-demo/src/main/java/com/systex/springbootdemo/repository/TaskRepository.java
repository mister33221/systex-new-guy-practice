package com.systex.springbootdemo.repository;

import com.systex.springbootdemo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
