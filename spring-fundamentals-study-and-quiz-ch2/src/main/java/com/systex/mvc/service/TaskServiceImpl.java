package com.systex.mvc.service;

import com.systex.mvc.dao.TaskDAO;
import com.systex.mvc.model.Task;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.logging.Logger;

// https://betulsahinn.medium.com/why-is-autowired-annotation-not-recommended-4939c46da1f8
@Service
public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO;

    public TaskServiceImpl(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    private static Logger logger = Logger.getLogger(TaskServiceImpl.class.getName());

    @Override
    @Transactional
    public List<Task> readAllTasks() {
        try {
            List<Task> taskList = taskDAO.readAllTasks();
            return taskList;
        } catch (Exception e) {
            logger.info("readAllTasks error :" + e.getMessage());
            return null;
        }
    }

    @Override
    @Transactional
    public void addTask(Task taskDao) {
        try {
            taskDAO.addTask(taskDao);
        } catch (Exception e) {
            logger.info("addTask error :" + e.getMessage());
        }
    }

    @Override
    @Transactional
    public void deleteTask(Integer id) {
        try {
            taskDAO.deleteTask(id);
        } catch (Exception e) {
            logger.info("deleteTask error :" + e);
        }
    }

}
