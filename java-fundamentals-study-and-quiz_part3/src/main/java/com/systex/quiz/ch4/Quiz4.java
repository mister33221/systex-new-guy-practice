package com.systex.quiz.ch4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Quiz4 {

    private static String driver = "org.postgresql.Driver";

    private static String url = "jdbc:postgresql://localhost:5432/testdb";

    private static String user = "root";

    private static String password = "root";

    public static void main(String args[]) {
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
            System.out.println("Opened database successfully\n");

            // set schema
            c.setSchema("test-schema");
            // set auto commit to false
            c.setAutoCommit(false);
            // create a statement
            stmt = c.createStatement();

//            =============================================== insert =====================================================

//            sql = "INSERT INTO task_table (task_name,description) "
//                    + "VALUES ('task1', 'description1');";
//            OperationUtil.insertData(c, stmt, sql);

//            =============================================== select =====================================================
//            select data from a table named "task_table"
//            sql = "select * from task_table";
//            stmt = c.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            List<TaskTable> taskTableList = new ArrayList<>();
//            while (rs.next()) {
//                TaskTable taskTable = new TaskTable();
//                taskTable.setTaskSeq(Long.valueOf(rs.getString("task_seq")));
//                taskTable.setTaskName(rs.getString("task_name"));
//                taskTable.setDescription(rs.getString("description"));
//                taskTableList.add(taskTable);
//            }
//            for (TaskTable taskTable : taskTableList) {
//                System.out.println(taskTable.toString());
//            }
//            rs.close();
//            stmt.close();

//            sql = "SELECT * FROM task_table;";
//            OperationUtil.selectData(c, stmt, sql);

//            =============================================== update =====================================================
//            update data to a table named "task_table"
//            TaskTable taskTable = new TaskTable(3L, "task3", "description3");
//            sql = "update task_table set task_name = '" + taskTable.getTaskName() + "', description = '" + taskTable.getDescription() + "' where task_seq = " + taskTable.getTaskSeq();
//            stmt.executeUpdate(sql);
//            stmt.close();
//            c.commit();
//            c.close();
//            System.out.println("Update data successfully ( " + taskTable + " )");

//            sql = "UPDATE task_table SET task_name = 'task3', description = 'description3' WHERE task_seq = 3;";
//            OperationUtil.updateData(c, stmt, sql);

//            =============================================== delete =====================================================
//            delete data to a table named "task_table"
//            TaskTable taskTable = new TaskTable(3L, "task3", "description3");
//            sql = "delete from task_table where task_seq = " + taskTable.getTaskSeq();
//            stmt.executeUpdate(sql);
//            stmt.close();
//            c.commit();
//            c.close();
//            System.out.println("Delete data successfully ( " + taskTable + " )");

            sql = "DELETE FROM task_table WHERE task_seq = 3;";
            OperationUtil.deleteData(c, stmt, sql);

            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("\n\noperation done successfully");
    }


}
