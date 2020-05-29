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
                <legend><h3>Edit Customer</h3></legend>
                <form:form modelAttribute="editCustomer" action="/user/customer/add" method="post" >
                    <div class="mb-3">
                        <form:label path="companyName">Company Name:</form:label>
                        <form:input path="companyName"/>
                        <form:errors path="companyName" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="firstName">Imie:</form:label>
                        <form:input path="firstName"/>
                        <form:errors path="firstName" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="surname">Nazwisko:</form:label>
                        <form:input path="surname"/>
                        <form:errors path="surname" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="address">Adres:</form:label>
                        <form:input path="address"/>
                        <form:errors path="address" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="nip">Nip:</form:label>
                        <form:input path="nip"/>
                        <form:errors path="nip" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="phone">Telefon:</form:label>
                        <form:input path="phone"/>
                        <form:errors path="phone" cssClass="errorMessage"/><br/>
                    </div>
                    <div class="mb-3">
                        <form:label path="email">E-mail:</form:label>
                        <form:input path="email"/>
                        <form:errors path="email" cssClass="errorMessage"/><br/>
                    </div>

                    <form:hidden path="id"/>

                    <form:button class="btn btn-primary btn-lg"
                                 type="submit">Edit</form:button>
                </form:form>
            </fieldset>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>
</html>