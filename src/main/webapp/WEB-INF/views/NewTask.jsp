<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="newtasks">
			Employee ID: <input id="id" type="text" name="empid"> <br><br>
			Task: <input id="task" type="text" name="taskname">  <br><br>
			Description: <input id="description" type="text" name="taskdescription">  <br><br>
			Deadline: <input id="deadline" type="text" name="taskdeadline">  <br><br>
			Owner: <input id="owner" type="text" name="taskowner">  <br><br>
			Status: <input id="status" type="text" name="taskcomplete">  <br><br>
			
			<a type="submit" class="btn btn-primary btn-lg" role="button">Add New Task</a>
			
			</form>
			<br>

</body>
</html>