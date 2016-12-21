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
        <h1>Login</h1>
    </header>
    <form class="form-horizontal">
        <fieldset>
            <div class="control-group">
                <label class="control-label">Login</label>
                <div class="controls">
                    <div class="input-prepend">
                        <span class="add-on">@</span>
                        <input id="loginField" class="span3" type="text"/>
                    </div>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Password</label>
                <div class="controls">
                    <input id="passwordField" class="span3" type="password"/>
                </div>
            </div>
            <div class="form-actions">
                <button id="loginButton" class="btn btn-primary" type="submit">Login</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
