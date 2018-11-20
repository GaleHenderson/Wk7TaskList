<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${showtasklist}

<h1>Tasklist</h1>
<%-- 		<table class="table">
			<c:forEach var="t" items="${tasklist}">
				<tr>
					<!-- <tr> = table row <td> = table data -->
					<td>${t.taskid}</td>
					<td>${t.taskname}</td>
					<td>${t.taskdescription}</td>
					<td>${t.taskdeadline}</td>
					<td>${t.taskowner}</td>
					<td>${t.taskcomplete}</td>
					<td><a class="btn btn-primary" href="/update?personid=${p.id} ">Edit</a></td>
					<td><a class="btn btn-primary" href="/delete?personid=${p.id} ">Delete</a></td>
				</tr>
			</c:forEach>
		</table> --%>

<h4>Add New Task:</h4>
<form action="newtasks">
			ID ${empid}<input type="hidden" name="empid" value="${empid}"> <br>
			Task: <input id="task" type="text" name="taskname">  <br><br>
			Description: <input id="description" type="text" name="taskdescription">  <br><br>
			Deadline: <input id="deadline" type="text" name="taskdeadline">  <br><br>
			Owner: <input id="owner" type="text" name="taskowner">  <br><br>
			Status: <input id="status" type="text" name="taskcomplete">  <br><br>
			
			<a type="submit" class="btn btn-primary btn-lg" role="button">Add New Task</a>
			
			</form>

</body>
</html>