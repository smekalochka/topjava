<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<html lang="ru">
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>

<table>
    <h3>
        <tr>
            <th>Date</th>
            <th>Description</th>
            <th>Calories</th>
        </tr>
        <c:forEach var="meal" items="${mealToList}">
            <c:if test="${meal.excess == true}">
                <tr bgcolor="red">
            </c:if>
            <c:if test="${meal.excess == false}">
                <tr bgcolor="green">
            </c:if>
            <td><p>${meal.dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:ss"))}</p></td>
            <td><p>${meal.description}</p></td>
            <td><p>${meal.calories}</p></td>
            </tr>
        </c:forEach>
    </h3>
</table>
</body>
</html>