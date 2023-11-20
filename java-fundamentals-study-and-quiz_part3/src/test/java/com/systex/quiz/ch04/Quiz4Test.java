package com.systex.quiz.ch04;

import com.systex.quiz.ch4.OperationUtil;
import com.systex.quiz.ch4.Quiz4;
import com.systex.quiz.ch4.model.db.TaskTable;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Quiz4Test {

    static OperationUtil operationUtil;

    static Quiz4 quiz4;

    static String driver = "org.postgresql.Driver";

    static String url = "jdbc:postgresql://localhost:5432/testdb";

    static String user = "root";

    static String password = "root";

    static String schema = "test-schema";

    @Test
    void testOperationUtilInsertDatat() {
        operationUtil = new OperationUtil();
        quiz4 = new Quiz4();
        OperationUtil operationUtil = new OperationUtil();
        Connection c = null;
        Statement stmt = null;
        String sql = "";
        try {
//            =============================================== conncet =====================================================
            Class.forName(driver);
            c = DriverManager
                    .getConnection(url,
                            user, password);

            // set schema
            c.setSchema(schema);
            // set auto commit to false
            c.setAutoCommit(false);
            // create a statement
            stmt = c.createStatement();
            // insert data
            sql = "INSERT INTO task_table (task_name,description) "
                    + "VALUES ('testInsertValue', 'testInsertValue');";
            operationUtil.insertData(c, stmt, sql);
            List<TaskTable> taskTableList = new ArrayList<>();
            // select data
            sql = "select * from task_table where task_name = 'testInsertValue'";
            taskTableList = operationUtil.selectData(c, stmt, sql);
            TaskTable taskTable = taskTableList.get(0);
            assert taskTable.getTaskName().equals("testInsertValue");
            // delete data
            sql = "delete from task_table where task_name = 'testInsertValue'";
            operationUtil.deleteData(c, stmt, sql);


            stmt.close();
            c.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void testOperationUtilSelectData() {
        operationUtil = new OperationUtil();
        quiz4 = new Quiz4();
        OperationUtil operationUtil = new OperationUtil();
        Connection c = null;
        Statement stmt = null;
        String sql = "";
        try {
//            =============================================== conncet =====================================================
            Class.forName(driver);
            c = DriverManager
                    .getConnection(url,
                            user, password);
            // set schema
            c.setSchema(schema);
            // set auto commit to false
            c.setAutoCommit(false);
            // create a statement
            stmt = c.createStatement();
            // insert data
            sql = "INSERT INTO task_table (task_name,description) "
                    + "VALUES ('testSelectValue', 'testSelectValue');";
            operationUtil.insertData(c, stmt, sql);
            List<TaskTable> taskTableList = new ArrayList<>();
            // select data
            sql = "select * from task_table where task_name = 'testSelectValue'";
            taskTableList = operationUtil.selectData(c, stmt, sql);
            TaskTable taskTable = taskTableList.get(0);
            assert taskTable.getTaskName().equals("testSelectValue");
            // delete data
            sql = "delete from task_table where task_name = 'testSelectValue'";
            operationUtil.deleteData(c, stmt, sql);

            stmt.close();
            c.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testOperationUtilUpdateData() {
        operationUtil = new OperationUtil();
        quiz4 = new Quiz4();
        OperationUtil operationUtil = new OperationUtil();
        Connection c = null;
        Statement stmt = null;
        String sql = "";
        try {
//            =============================================== conncet =====================================================
            Class.forName(driver);
            c = DriverManager
                    .getConnection(url,
                            user, password);
            // set schema
            c.setSchema(schema);
            // set auto commit to false
            c.setAutoCommit(false);
            // create a statement
            stmt = c.createStatement();
            // insert data
            sql = "INSERT INTO task_table (task_name,description) "
                    + "VALUES ('testUpdateValue1', 'testUpdateValue1');";
            operationUtil.insertData(c, stmt, sql);
            List<TaskTable> taskTableList = new ArrayList<>();
            // select data
            sql = "select * from task_table where task_name = 'testUpdateValue1'";
            taskTableList = operationUtil.selectData(c, stmt, sql);
            TaskTable taskTable = taskTableList.get(0);
            assert taskTable.getTaskName().equals("testUpdateValue1");
            // update data
            sql = "update task_table set task_name = 'testUpdateValue2' where task_name = 'testUpdateValue1'";
            operationUtil.updateData(c, stmt, sql);
            // select data
            sql = "select * from task_table where task_name = 'testUpdateValue2'";
            taskTableList = operationUtil.selectData(c, stmt, sql);
            taskTable = taskTableList.get(0);
            assert taskTable.getTaskName().equals("testUpdateValue2");
            // delete data
            sql = "delete from task_table where task_name = 'testUpdateValue2'";
            operationUtil.deleteData(c, stmt, sql);

            stmt.close();
            c.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testOperationUtilDeleteData() {
        operationUtil = new OperationUtil();
        quiz4 = new Quiz4();
        OperationUtil operationUtil = new OperationUtil();
        Connection c = null;
        Statement stmt = null;
        String sql = "";
        try {
//            =============================================== conncet =====================================================
            Class.forName(driver);
            c = DriverManager
                    .getConnection(url,
                            user, password);
            // set schema
            c.setSchema(schema);
            // set auto commit to false
            c.setAutoCommit(false);
            // create a statement
            stmt = c.createStatement();
            // insert data
            sql = "INSERT INTO task_table (task_name,description) "
                    + "VALUES ('testDeleteValue', 'testDeleteValue');";
            operationUtil.insertData(c, stmt, sql);
            List<TaskTable> taskTableList = new ArrayList<>();
            // select data
            sql = "select * from task_table where task_name = 'testDeleteValue'";
            taskTableList = operationUtil.selectData(c, stmt, sql);
            TaskTable taskTable = taskTableList.get(0);
            assert taskTable.getTaskName().equals("testDeleteValue");
            // delete data
            sql = "delete from task_table where task_name = 'testDeleteValue'";
            operationUtil.deleteData(c, stmt, sql);
            // select data
            sql = "select * from task_table where task_name = 'testDeleteValue'";
            taskTableList = operationUtil.selectData(c, stmt, sql);
            assert taskTableList.size() == 0;

            stmt.close();
            c.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
