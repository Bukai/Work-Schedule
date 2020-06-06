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
            <c:forEach var="order" items="${ordersList}">
                <h3>Details Id: ${order.id}</h3>
                <br>
                <h4>Customer:</h4>
                <c:forEach var="customer" items="${order.customers}">
                    ${customer.companyName}<br>
                    ${customer.address}<br>
                    ${customer.nip}<br>
                    ${customer.phone}
                </c:forEach>
                <br>
                <br>
                <h4>Parts:</h4>
                <a href="/user/order/details/parts/add/${order.id}">
                    <button type="button" class="btn btn-success">Add</button>
                </a>
                <br>
                <br>

                <table border="1" cellpadding="3">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Selling Cost</th>
                        <th>Cost Of Purchase</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                <c:forEach var="parts" items="${order.parts}">
                    <tr>
                            <td>${parts.id}</td>
                            <td>${parts.name}</td>
                            <td>${parts.quantity}</td>
                            <td>${parts.sellingCost}</td>
                            <td>${parts.costOfPurchase}</td>
                            <td>
                                <a href="/user/order/details/parts/delete/${parts.id}">
                                    <button type="button" class="btn btn-danger">Delete</button>
                                </a>
                            </td>
                    </tr>
                </c:forEach>
                </table>

                <br>
                <br>
                <h4>Employees:</h4>
                <a href="/user/order/details/employees/add/${order.id}">
                    <button type="button" class="btn btn-success">Add</button>
                </a>
                <br>
                <br>
                <table border="1" cellpadding="3">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>firstName</th>
                        <th>surname</th>
                        <th>rgb</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <c:forEach var="employees" items="${order.employees}">
                        <tr>
                            <td>${employees.id}</td>
                            <td>${employees.firstName}</td>
                            <td>${employees.surname}</td>
                            <td>${employees.rgb}</td>
                            <td>
                                <a href="/user/order/details/${employees.id}/delete">
                                    <button type="button" class="btn btn-danger">Delete</button>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:forEach>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/headers/footer.jspf" %>
</body>
</html>