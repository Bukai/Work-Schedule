<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <legend><h3>Add Part</h3></legend>
                <form:form modelAttribute="parts" action="/user/parts/add" method="post" >
                    <div class="mb-3">
                        <form:label path="name">Name:</form:label>
                        <form:input path="name"/>
                        <form:errors path="name" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="quantity">Quantity:</form:label>
                        <form:input path="quantity"/>
                        <form:errors path="quantity" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="sellingCost">Selling Cost:</form:label>
                        <form:input path="sellingCost"/>
                        <form:errors path="sellingCost" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="costOfPurchase">Cost Of Purchase:</form:label>
                        <form:input path="costOfPurchase"/>
                        <form:errors path="costOfPurchase" cssClass="errorMessage"/><br/>
                    </div>

                    <form:button class="btn btn-primary btn-lg"
                                 type="submit">Add</form:button>
                </form:form>
            </fieldset>
        </div>
</div>
<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>
</html>