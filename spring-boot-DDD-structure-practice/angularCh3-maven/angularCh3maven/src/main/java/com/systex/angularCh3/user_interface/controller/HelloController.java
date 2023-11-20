package com.systex.angularCh3.user_interface.controller;

//https://blog.csdn.net/weixin_43883917/article/details/126638356


import com.systex.angularCh3.domain.aggregate.task.entity.Task;
import com.systex.angularCh3.application.domain_service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class HelloController {

    private TaskService taskService;

    public HelloController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * 進入首頁 顯示所有任務
     * @return ModelAndView
     */
    @GetMapping(value = "/tasks", produces = "application/json")

    public @ResponseBody List<Task> init() {
        System.out.println("init");
        List<Task> taskList = taskService.readAllTasks();

        return taskList;
    }

    /**
     * 新增任務
     * @param task
     * @return List<Task>
     */
    @PostMapping("/addTask")
    public List<Task> addTask(@RequestBody Task task) {
        System.out.println("addTask :" + task);
        Task taskDao = new Task(task);
        taskService.addTask(taskDao);
        return taskService.readAllTasks();
    }

    /**
     * 刪除任務
     *
     * @param id
     * @return List<Task>
     */
    @DeleteMapping("/deleteTask/{id}")
    public List<Task> deleteTask( @PathVariable("id") Long id) {
        System.out.println("deleteTask");
        taskService.deleteTask(id);
        return taskService.readAllTasks();
    }

    /**
     * 修改任務
     * @param task
     * @return List<Task>
     */
    @PutMapping("/updateTask")
    public List<Task> updateTask(@RequestBody Task task) {
        System.out.println("updateTask");
        taskService.updateTask(task);
        return taskService.readAllTasks();
    }

}
