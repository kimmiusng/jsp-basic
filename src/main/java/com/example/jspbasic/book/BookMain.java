package com.example.jspbasic.book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book/bookMain")
public class BookMain extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charSet=UTF-8");
        PrintWriter out = resp.getWriter();

        String op = req.getParameter("op");
        switch (op){
            case "도서 등록":
                resp.sendRedirect("/book/bookAdd.html");
                break;
            case "도서 목록":
                resp.sendRedirect("/book/bookPrint.html");
                break;
            case "도서 수정":
                resp.sendRedirect("/book/bookUpdate.html");
                break;
            case "도서 삭제":
                resp.sendRedirect("/book/bookRemove.html");
                break;
        }
    }
}
