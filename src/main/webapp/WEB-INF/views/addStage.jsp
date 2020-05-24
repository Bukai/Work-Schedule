<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<head>
    <%@ include file="/WEB-INF/headers/header.jspf" %>
</head>

<body>

<div class="d-flex" id="wrapper">
    <%@ include file="/WEB-INF/headers/naviLeft.jspf" %>
    <div id="page-content-wrapper">
        <%@ include file="/WEB-INF/headers/naviTop.jspf" %>
        <div class="container-fluid">
            <h3>Add Stage</h3>
            <br/><br/>
            <form:form modelAttribute="orderStage" action="/stage/add" method="post" >
                <div class="mb-3">
                    <form:label path="name">Nazwa:</form:label>
                    <form:input path="name"/>
                    <form:errors path="name" cssClass="errorMessage"/><br/>
                </div>

                <form:hidden path="id"/>

                <form:button class="btn btn-primary btn-lg"
                             type="submit">Dodaj</form:button>
            </form:form>
        </div>
    </div>



</div>
<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>

</html>