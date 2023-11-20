package com.systex.quiz.ch4;


import com.systex.quiz.ch4.model.db.TaskTable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OperationUtil {

    // insert data to a table named "task_table"
    public static void insertData(Connection c, Statement stmt, String sql) throws SQLException {
        stmt.executeUpdate(sql);
        c.commit();
        System.out.println("Insert data successfully ( " + sql + " )");
    }

    // select data from a table named "task_table"
    public static List<TaskTable> selectData(Connection c, Statement stmt, String sql) throws SQLException {
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<TaskTable> taskTableList = new ArrayList<>();
        while (rs.next()) {
            TaskTable taskTable = new TaskTable();
            taskTable.setTaskSeq(Long.valueOf(rs.getString("task_seq")));
            taskTable.setTaskName(rs.getString("task_name"));
            taskTable.setDescription(rs.getString("description"));
            taskTableList.add(taskTable);
        }
        for (TaskTable taskTable : taskTableList) {
            System.out.println(taskTable.toString());
        }

        return taskTableList;
    }

    //update data to a table named "task_table"
    public static void updateData(Connection c, Statement stmt, String sql) throws SQLException {
        stmt.executeUpdate(sql);
        c.commit();
        System.out.println("Update data successfully ( " + sql + " )");
    }

    //delete data to a table named "task_table"
    public static void deleteData(Connection c, Statement stmt, String sql) throws SQLException {
        stmt.executeUpdate(sql);
        c.commit();
        System.out.println("Delete data successfully ( " + sql + " )");
    }

}
