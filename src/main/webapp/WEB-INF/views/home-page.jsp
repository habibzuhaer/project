<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.1/css/bootstrap.css">
    <script src="/webjars/jquery/3.3.1-1/jquery.js"></script>
    <script src="/webjars/bootstrap/4.1.1/js/bootstrap.js"></script>
    <script src="/webjars/popper.js/1.14.1/umd/popper.js"></script>

    <link rel="stylesheet" href="/css/main.css"/>
</head>
<body>
<jsp:include page="fragments/main-menu.jsp"/>
<div class="container">

    <sec:authorize access="isAuthenticated()">
        <div class="row" style="margin-top: 40px; margin-bottom: 10px" align="center">
            <div class="col-1"></div>
            <div class="col-6"><h2>Dodaj ogłoszenie</h2></div>
            <div class="col-5"></div>
        </div>

        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <form method="post" action="/add-advert">
                    <div class="form-group">
                        <label for="title">Tytuł ogłoszenia:</label>
                        <input type="text" required name="title" id="title" class="form-control"
                               placeholder="Podaj tytuł ogłoszenia"/>
                    </div>
                    <div class="form-group">
                        <label for="description">Hasło</label>
                        <textarea name="description" id="description"
                                  class="form-control"
                                  placeholder="Uzupełnij opis ogłoszenia"></textarea>
                    </div>
                    <button class="btn btn-primary" type="submit">Dodaj</button>
                    <button class="btn btn-secondary" type="reset">Wyczyść dane</button>
                    <sec:csrfInput/>
                </form>
            </div>
            <div class="col-2"></div>
        </div>
    </sec:authorize>

    <div class="row" style="margin-top: 40px; margin-bottom: 10px">
        <div class="col-1"></div>
        <div class="col-6"><h2>Lista ogłoszeń</h2></div>
        <div class="col-5"></div>
    </div>

    <div class="row" style=" padding: 10px; border: 25px solid #f2f2f2; border-radius: 20px;">
        <div class="col-12" style="padding-bottom: 20px">
            <table>
                <tr>
                    <th>Lp.</th>
                    <th>Tytuł</th>
                    <th>Treść</th>
                    <th>Autor</th>
                    <th>Data dodania</th>
                </tr>
                <c:forEach items="${adverts}" var="advert" varStatus="stat">
                    <tr>
                        <td class="rtable">${stat.count}</td>
                        <td class="rtable"><b>${advert.title}</b></td>
                        <td class="rtable">${advert.description}</td>
                        <td class="rtable">${advert.owner.username}</td>
                        <td class="rtable">${advert.posted}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

</div>
</body>
</html>