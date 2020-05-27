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
            <h3>Stage</h3>
            <a href="/stage/add">
                <button type="button" class="btn btn-success">Dodaj</button>
            </a>
            <br/><br/>
            <table border="1" cellpadding="10">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Action</th>
                </tr>
                </thead>
                <c:forEach var="stage" items="${listStage}">
                    <tr>
                        <td>${stage.id}</td>
                        <td>${stage.name}</td>
                        <td>
                            <a href="/stage/edit/${stage.id}">
                                <button type="button" class="btn btn-primary">Edit</button>
                            </a>
                            <a href="/stage/delete/${stage.id}">
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