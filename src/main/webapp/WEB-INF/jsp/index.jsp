<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<%@ include file="components/head.jsp" %>
<body>
    <%@ include file="components/nav.jsp" %>
    <div class="container-fluid">
        <div class="container">
            <div class="row d-flex align-items-center justify-content-center mt-4">
                Hi! , ${user}
            </div>
        </div>
    </div>
</body>

</html>