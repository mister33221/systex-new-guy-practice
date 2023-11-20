package com.systex.mvc.dao;

import com.systex.mvc.model.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TaskDAO {


    /**
     * 讀取所有任務
     * @return List<Task>
     */
    List<Task> readAllTasks();

    /**
     * 新增任務
     * @param taskDao
     * @return
     */
    void addTask(Task taskDao);

    /**
     * 刪除任務
     * @param id
     * @return
     */
    void deleteTask(Integer id);
}
