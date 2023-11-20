package com.systex.angularCh3.repository;

import com.systex.angularCh3.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByOrderByIdAsc();
}
