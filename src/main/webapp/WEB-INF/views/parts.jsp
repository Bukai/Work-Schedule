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
            <h3>Parts</h3>
            <a href="/parts/add">
                <button type="button" class="btn btn-success">Dodaj</button>
            </a>
            <br/><br/>
            <table border="1" cellpadding="10">
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
                <c:forEach var="parts" items="${partsList}">
                    <tr>
                        <td>${parts.id}</td>
                        <td>${parts.name}</td>
                        <td>${parts.quantity}</td>
                        <td>${parts.sellingCost}</td>
                        <td>${parts.costOfPurchase}</td>

                        <td>
                            <a href="/parts/edit/${parts.id}">
                                <button type="button" class="btn btn-primary">Edit</button>
                            </a>
                            <a href="/parts/delete/${parts.id}">
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