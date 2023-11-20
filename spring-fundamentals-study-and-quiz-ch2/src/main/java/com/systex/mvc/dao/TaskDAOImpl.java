package com.systex.mvc.dao;


import com.systex.mvc.model.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO {

    private SessionFactory sessionFactory;

    public TaskDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Task> readAllTasks() {
        try {
            Session session = sessionFactory.getCurrentSession();
            // ?
            List<Task> taskList = session.createQuery("from Task").list();
            return taskList;
        } catch (Exception e) {
            return null;
        }
    }

    public void addTask(Task taskDao) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(taskDao);
        } catch (Exception e) {
            System.out.println("addTask error :" + e.getMessage());
        }
    }

    public void deleteTask(Integer id) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Task task = session.get(Task.class, new Long(id));
            session.delete(task);
        } catch (Exception e) {
            //建議
            e.printStackTrace();
        }
    }

}
