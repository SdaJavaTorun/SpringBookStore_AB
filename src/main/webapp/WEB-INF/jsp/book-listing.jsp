<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pl">


<body>
<h1>Listing ksiazek</h1>
<p>Time: ${time}   </p>
<p> Total books:   ${listing.count}</p>
<p style="color: blue"> ${result}</p>
<table>
    <thead>
    <tr>
        <th>Tytul</th>
        <th>Autor</th>
        <th>Id</th>
    </tr>
    </thead>
    <tbody>
    <form action="/books/czas" method="post">
        <input type="text" name="titleFromDto"/>
        <input type="text" name="author"/>
        <input type="text" name="id"/>
        <input type="submit" value="Dodaj" />
    </form>
    <c:forEach items="${listing.books}" var="book">
        <tr>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td><c:out value="${book.id}"/></td>
            <td> <a href="/books/delete/${book.id}" onclick="return confirm('Are you sure?')">Delete</a>
                    </td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>