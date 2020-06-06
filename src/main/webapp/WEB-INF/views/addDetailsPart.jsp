<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="FORM" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <%@ include file="/WEB-INF/headers/header.jspf" %>
</head>
<body>
<div class="d-flex" id="wrapper">
    <%@ include file="/WEB-INF/headers/naviLeft.jspf" %>
    <div id="page-content-wrapper">
        <%@ include file="/WEB-INF/headers/naviTop.jspf" %>
        <div class="container-fluid">
            <fieldset>
                <legend><h3>Add Parts</h3></legend>
                    <form:form modelAttribute="orders" action="/user/order/details/parts/add/${orders.id}" method="post" >
                        <div class="mb-3">
                            <label>Parts:</label>
                            <form:select path="parts" multiple="true" items="${detailsPart}" itemLabel="name" itemValue="id"/>
                            <form:errors path="parts"/>
                        </div>

                        <form:hidden path="employees"/>
                        <form:hidden path="description"/>
                        <form:hidden path="createdOn"/>
                        <form:hidden path="customers"/>
                        <form:hidden path="orderStage"/>

                        <form:hidden path="id"/>

                        <form:button class="btn btn-primary btn-lg"
                                     type="submit">Add</form:button>
                    </form:form>
            </fieldset>
        </div>
    </div>
</div>

<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>
</html>