<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style.css"/>
</head>
<body>
<div class="container">
    <header>
        <h1>Courses</h1>
    </header>
    <table class="table table-striped table-bordered">
        <thead>
        <tr>
            <th class="span1">Id</th>
            <th>Course</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="courses" items="${courses}">
        <tr>
            <td>${courses.id}</td>
            <td>${courses.courseState}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
