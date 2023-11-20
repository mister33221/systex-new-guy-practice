package com.systex.angularCh3.service;


import com.systex.angularCh3.model.Task;
import com.systex.angularCh3.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

// https://betulsahinn.medium.com/why-is-autowired-annotation-not-recommended-4939c46da1f8
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    private static Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

    @Override
    @Transactional
    public List<Task> readAllTasks() {
        try {
            //select * from task order by id desc
            return taskRepository.findAllByOrderByIdAsc();
        } catch (Exception e) {
            logger.info("readAllTasks error :" + e.getMessage());
            return null;
        }
    }

    @Override
    @Transactional
    public void addTask(Task taskDao) {
        try {
            taskRepository.save(taskDao);
        } catch (Exception e) {
            // use slf4j
            logger.info("addTask error :", e);
        }
    }

    @Override
    @Transactional
    public void deleteTask(Long id) {
        try {
            taskRepository.deleteById(id);
        } catch (Exception e) {
            logger.info("deleteTask error :" + e);
        }
    }

    @Override
    public void updateTask(Task task) {
        try {
            taskRepository.save(task);
        } catch (Exception e) {
            logger.info("updateTask error :" + e);
        }
    }

}
