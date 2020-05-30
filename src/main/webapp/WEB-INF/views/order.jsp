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
            <h3>Order</h3>
            <a href="/user/order/add/">
                <button type="button" class="btn btn-success">Dodaj</button>
            </a>
            <br/><br/>
            <table border="1" cellpadding="10">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>description</th>
                    <th>customers</th>
                    <th>employees</th>
                    <th>parts</th>
                    <th>cost</th>
                    <th>profit</th>
                    <th>createdOn</th>
                    <th>endOn</th>
                    <th>orderStage</th>
                    <th>Action</th>
                </tr>
                </thead>
                <c:forEach var="order" items="${ordersList}">
                    <tr>
                        <td>${order.id}</td>
                        <td>${order.description}</td>
                        <td>${order.customers}</td>
                        <td>${order.employees}</td>
                        <td>${order.parts}</td>
                        <td>${order.cost}</td>
                        <td>${order.profit}</td>
                        <td>${order.createdOn}</td>
                        <td>${order.endOn}</td>
                        <td>${order.orderStage}</td>

                        <td>
                            <a href="/user/order/edit/${order.id}">
                                <button type="button" class="btn btn-primary">Edit</button>
                            </a>
                            <a href="/user/order/delete/${order.id}">
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