<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 자바 코드를 넣을 수 있음
    //request, response => 내장 객체

%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>도서 관리 프로그램</title>
</head>
<body>
<div id="container">
    <h3>도서관리 프로그램</h3>
    <form action="/bookMain" method="post">
        <div>
            <select name = "op">
                <option value="도서 등록">도서 등록</option>
                <option value="도서 목록 조회">도서 목록 조회</option>
                <option value="도서 정보 수정">도서 정보 수정</option>
                <option value="도서 삭제">도서 삭제</option>
            </select>
        </div>
        <div>
            <br>
            <input type="submit" value="이동하기">
        </div>

    </form>
</div>
</body>
<style>
    html {
        height: 100%;
    }
    body {
        box-sizing: border-box;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 60%;
    }
    h3 {
        margin-top: 0px;
        padding-top: 0px;
    }
    #container {
        border-style: solid;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width: 300px;
        height: 150px;
    }
    input[type="number"] {
        width: 50px;
        margin-bottom: 10px;
    }
</style>
</html>