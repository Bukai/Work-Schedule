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
                <legend><h3>Add Order</h3></legend>
                <form:form modelAttribute="orders" action="/user/order/add" method="post" >
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
                        <form:errors path="customers" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <label>Employees:</label>
                        <select name="employees">
                            <option value="NONE" label="--- Employee ---"></option>
                            <c:forEach var="employee" items="${employees}">
                                <option value="${employee.id}">${employee.firstName}
                                ${employee.surname}</option>
                            </c:forEach>
                        </select>
                        <form:errors path="employees" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <label>Parts:</label>
                        <select name="parts">
                            <option value="NONE" label="--- Parts ---"></option>
                            <c:forEach var="parts" items="${parts}">
                                <option value="${parts.id}">${parts.name}</option>
                            </c:forEach>
                        </select>
                        <form:errors path="parts" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="cost">cost:</form:label>
                        <form:input path="cost"/>
                        <form:errors path="cost" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="profit">profit:</form:label>
                        <form:input path="profit"/>
                        <form:errors path="profit" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="createdOn">createdOn:</form:label>
                        <form:input path="createdOn"/>
                        <form:errors path="createdOn" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="endOn">endOn:</form:label>
                        <form:input path="endOn"/>
                        <form:errors path="endOn" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <label>orderStage:</label>
                        <select name="orderStage">
                            <option value="NONE" label="--- Stage ---"></option>
                            <c:forEach var="orderStage" items="${stages}">
                                <option value="${orderStage.id}">${orderStage.name}</option>
                            </c:forEach>
                        </select>
                        <form:errors path="orderStage" cssClass="errorMessage"/><br/>
                    </div>

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