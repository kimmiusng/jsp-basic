package com.example.jspbasic;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet("/bookManagement")
public class BookMain extends HttpServlet {

    static ServletContext sc = null;
    private HashMap<Long, Book> bookList = new HashMap<Long, Book>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charSet=UTF-8");
        PrintWriter out = resp.getWriter();
        String op = String.valueOf(req.getParameter("op"));

        switch (op) {
            case "도서 등록":
                resp.sendRedirect("addBook.html");
                break;
            case "도서 목록 조회":
                resp.sendRedirect("printBook.html");
                break;
            case "도서 정보 수정":
                break;
            case "도서 삭제":
                break;
        }
    }
}








