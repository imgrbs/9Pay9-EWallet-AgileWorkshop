<%--
  Created by IntelliJ IDEA.
  User: Phachara
  Date: 11/12/2017 AD
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="components/head.jsp" %>
<body>
    <%@ include file="components/nav.jsp" %>
    <div class="container-fluid">
        <div class="container">
            <div class="row">
                <div class="col mt-3">
                    <h2>Banking Provider</h2>
                    <form action="">
                        <div class="form-group">
                            <select class="form-control" id="exampleFormControlSelect1">
                                <option>ธนาคารกสิกร xxx-xxx-xxx-xx</option>
                                <option>ธนาคารไทยภานิช xxx-xxx-xxx-xx</option>
                            </select>
                        </div>
                        <div class="row my-1">
                            <div class="col-3">Current Balance</div>
                            <div class="col">: 1300.00</div>
                        </div>
                        <div class="row my-1">
                            <div class="col-3">Deposit Limit</div>
                            <div class="col">: 5000.00</div>
                        </div>
                        <hr class="my-3"/>
                        <div class="row my-1">
                            <div class="col-3">Amount</div>
                            <div class="col">
                                <input class="form-control" type="number" placeholder="0" min="0" pattern="\d+">
                            </div>
                        </div>
                        <div class="row my-4">
                            <div class="col d-flex justify-content-end">
                                <button type="button" class="btn btn-danger mx-2">Cancel</button>
                                <button type="submit" class="btn btn-success mx-2">OK</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
