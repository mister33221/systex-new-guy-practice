<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h2>Hello, Hello Spring MVC Framework!?</h2>
</br>
<h3>Task List</h3>
<table style="border: black 1px solid">
    <tr style="border: black 1px solid">
        <th style="border: black 1px solid">Task ID</th>
        <th style="border: black 1px solid">Task Name</th>
        <th style="border: black 1px solid">Task Description</th>
        <th style="border: black 1px solid">Delete</th>
    </tr>
    <c:forEach items="${taskList}" var="task">
        <tr style="border: black 1px solid">
            <td style="border: black 1px solid">${task.id}</td>
            <td style="border: black 1px solid">${task.name}</td>
            <td style="border: black 1px solid">${task.description}</td>

            <form action="deleteTask" method="delete">
                <input type="hidden" name="id" value="${task.id}"/>
                <td style="border: black 1px solid"><input type="submit" value="Delete"/></td>
            </form>

        </tr>
    </c:forEach>
</table>
<%-- push a button and then add a task with parameters name and description into the dataList--%>
<h3>Add new task</h3>
<form action="addTask" method="post">
    <table >
        <tr>
            <td>Task Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Task Description</td>
            <td><input type="text" name="description"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add Task"/></td>
        </tr>
    </table>
</form>

</body>
</html>
