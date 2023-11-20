package com.systex.mvc.controller;

//https://blog.csdn.net/weixin_43883917/article/details/126638356
import com.systex.mvc.model.Task;
import com.systex.mvc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class HelloController{


    private TaskService taskService;

    public HelloController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * 進入首頁 顯示所有任務
     * @return ModelAndView
     */
    @GetMapping("/")
    public ModelAndView init() {
        System.out.println("init");
        ModelAndView modelAndView = new ModelAndView("hello");
        List<Task> taskList = taskService.readAllTasks();
//      modelMap vs modelAndView  https://www.796t.com/content/1541936173.html
        modelAndView.addObject("taskList", taskList);
        return modelAndView;
    }

    /**
     * 新增任務
     * @param task
     * @param description
     * @param modelMap
     * @return String
     */
    @PostMapping("/addTask")
    public String addTask(@RequestParam("name") String task, @RequestParam("description") String description, ModelMap modelMap){
        System.out.println("addTask");
        Task taskDao = new Task(task, description);
        taskService.addTask(taskDao);
        List<Task> taskList  = taskService.readAllTasks();
        // 甚麼是ModelMap?
        // https://blog.csdn.net/qq_41855420/article/details/107201590
        modelMap.addAttribute("taskList", taskList);
        return "hello";
    }

    /**
     * 刪除任務
     * @param id
     * @param modelMap
     * @return String
     */
    @GetMapping("/deleteTask")
    public String deleteTask(@RequestParam("id") Integer id, ModelMap modelMap){
        System.out.println("deleteTask");
        taskService.deleteTask(id);
        List<Task> taskList = taskService.readAllTasks();
        modelMap.addAttribute("taskList", taskList);
        return "hello";
    }

}
