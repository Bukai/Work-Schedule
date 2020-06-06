<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                <legend><h3>Edit Order</h3></legend>
                <form:form modelAttribute="editOrder" action="/user/order/add" method="post" >
                    <div class="mb-3">
                        <form:label path="description">description:</form:label>
                        <form:input path="description"/>
                        <form:errors path="description" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <label>Customer:</label>
                        <select name="customers">
                            <option value="NONE" label="--- Customers ---"></option>
                            <c:forEach items="${customers}" var="customer">
                                <option value="${customer.id}">${customer.companyName} ${customer.nip}</option>
                            </c:forEach>
                        </select>
                        <a href="/user/customer/add">
                            <button type="button" class="btn btn-success">Dodaj</button>
                        </a>
                        <form:errors path="customers" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="createdOn">createdOn:</form:label>
                        <form:input type="date" path="createdOn"/>
                        <form:errors path="createdOn" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <label>orderStage:</label>
                        <select name="orderStage">
                            <c:forEach var="orderStage" items="${stages}">
                                <option value="${orderStage.id}">${orderStage.name}</option>
                            </c:forEach>
                        </select>
                        <form:errors path="orderStage" cssClass="errorMessage"/><br/>
                    </div>
                    <form:hidden path="parts"/>
                    <form:hidden path="employees"/>

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