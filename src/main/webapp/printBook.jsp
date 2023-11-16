<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.jspbasic.Book" %>
<%@ page import="java.util.Set" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HashMap<Long, Book> hm = (HashMap<Long, Book>) request.getAttribute("hm");
    Set<Long> keys = hm.keySet();
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>도서관리 프로그램</title>
</head>
<body>
<h3>도서관리 프로그램</h3>
<div id="container">
    <% for (Long b: keys) { %>
    <div class="book"> 번호: <%=hm.get(b).getno()%>
        제목 <%=hm.get(b).getName()%>
        저자 <%=hm.get(b).getAuthor()%>
        출판일 <%=hm.get(b).getPublishedDate()%>
        <a href="/book-update">수정</a> <a href="/book-delete">삭제</a></div>
    <% } %>
</div>
<form action="addBook.html" method="post">
    <div>
        <input type="submit" value="처음화면으로 돌아가기">
    </div>
</form>
</body>
<style>
    html {
        height: 100%;
    }
    body {
        box-sizing: border-box;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100%;
    }
    h3 {
        margin-top: 0px;
        padding-top: 0px;
        height: 10%;
    }
    #container {
        width: 50%;
        height: 70%;
    }
    form {
        height: 10%;
    }
    input[type="number"] {
        width: 50px;
        margin-bottom: 10px;
    }
    .book {
        padding: 3px 3px;
        border-style: solid;
    }
</style>
</html>