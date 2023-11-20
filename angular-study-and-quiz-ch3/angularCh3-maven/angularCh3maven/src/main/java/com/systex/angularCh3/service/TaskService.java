package com.systex.angularCh3.service;


import com.systex.angularCh3.model.Task;

import java.util.List;

public interface TaskService {

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
    void deleteTask(Long id);

    /**
     * 更新任務
     * @param task
     * @return
     */
    void updateTask(Task task);
}
