
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>

<body>

<div class="container">

    <form method="POST" action="${contextPath}/login" class="form-signin">
        <h2 class="text-center">Log in</h2>

        <input type="text" id="user_name" name="user_name" placeholder="User Name"
               class="form-control"/> <br/>
        <input type="password"
               id="password" name="password" class="form-control" placeholder="Password"/> <br/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
        <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>

    </form>

</div>
<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>
</html>