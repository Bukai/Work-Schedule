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
            <h3>Customer</h3>
            <a href="/customer/add">
                <button type="button" class="btn btn-success">Dodaj</button>
            </a>
            <br/><br/>
            <table border="1" cellpadding="10">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>companyName</th>
                    <th>firstName</th>
                    <th>surname</th>
                    <th>address</th>
                    <th>nip</th>
                    <th>phone</th>
                    <th>email</th>
                    <th>Action</th>
                </tr>
                </thead>
                <c:forEach var="customer" items="${customerList}">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.companyName}</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.surname}</td>
                        <td>${customer.address}</td>
                        <td>${customer.nip}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.email}</td>

                        <td>
                            <a href="/customer/edit/${customer.id}">
                                <button type="button" class="btn btn-primary">Edit</button>
                            </a>
                            <a href="/customer/delete/${customer.id}">
                                <button type="button" class="btn btn-danger">Delete</button>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>
</html>