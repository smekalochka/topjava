<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="ru">
<head>
    <title>Edit meal</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Edit meal</h2>

<form <%--method="post"--%> action="editMeal" name="frmAddMeal">
    DateTime : <input type="datetime-local" name="dateTime"
                      value="<c:out value="${meal.dateTime}" />"/> <br/>
    Description : <input type="text" name="description"
                         value="<c:out value="${meal.description}" />"/> <br/>
    Calories : <input type="text" name="calories"
                      value="<c:out value="${meal.calories}" />"/> <br/>
</form>
<p style="text-align: left">
    <button type="submit" formmethod="post">Save</button>
    <button>Cancel</button>
</body>
</html>