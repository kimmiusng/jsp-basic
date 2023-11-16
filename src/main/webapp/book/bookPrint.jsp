
<%@ page import="java.util.Set" %>
<%@ page import="com.example.jspbasic.book.Book" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    HashMap<Long, Book> book = (HashMap<Long, Book>) request.getAttribute("no");
    Set<Long> keys = book.keySet();
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
<h3> 도서 목록 </h3>
<div id="container">
    <% for(Long key : keys){ %>
    <div class="book">
        No. <%=book.get(key).getNo()%>
        [제목] <%=book.get(key).getName()%>
        [저자] <%=book.get(key).getAuthor()%>
        [출판일] <%=book.get(key).getPublishedDate()%> <a href="/book/bookUpdate">수정</a> <a href="/book/bookRemove">삭제</a></div>
    <% } %>
</div>
<form action="/book/bookMain.html" method="post">
    <div>
        <input type="submit" value="메인으로 돌아가기">
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
        border-style: groove;
    }
</style>
</html>