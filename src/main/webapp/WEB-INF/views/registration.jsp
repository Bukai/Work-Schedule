<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>

<body>

<div class="container">

    <form:form method="POST" modelAttribute="user" action="/registration">
        <div class="col-sm-9">
            <h2 class="text-center">Create your account</h2>
        </div>

        <spring:bind path="userName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <div class="col-sm-9">
                <form:input type="text" path="userName" class="form-control" placeholder="Username"
                            autofocus="true"></form:input>
                <form:errors path="userName"></form:errors>
                </div>
            </div>
        </spring:bind>

        <spring:bind path="email">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <div class="col-sm-9">
                <form:input type="email" path="email" class="form-control" placeholder="E-mail"
                            autofocus="true"></form:input>
                <form:errors path="email"></form:errors>
                </div>
            </div>
        </spring:bind>

        <spring:bind path="name">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <div class="col-sm-9">
                <form:input type="text" path="name" class="form-control" placeholder="Name"
                            autofocus="true"></form:input>
                <form:errors path="name"></form:errors>
                </div>
            </div>
        </spring:bind>

        <spring:bind path="lastName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <div class="col-sm-9">
                <form:input type="text" path="lastName" class="form-control" placeholder="lastName"
                            autofocus="true"></form:input>
                <form:errors path="lastName"></form:errors>
                </div>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <div class="col-sm-9">
                <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                <form:errors path="password"></form:errors>
                </div>
            </div>
        </spring:bind>

        <div class="form-group">
            <div class="col-sm-9">
                <button type="submit" class="btn btn-primary btn-block">Register User</button>
            </div>


        </div>
        <%
            if(null!=request.getAttribute("successMessage"))
            {
                out.println(request.getAttribute("successMessage"));
            }
        %>

        <div class="col-sm-9">
            <h4 class="text-center"><a href="${contextPath}/login">Log in</a></h4>
        </div>
    </form:form>

</div>

<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>
</html>