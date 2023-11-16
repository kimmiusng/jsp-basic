package com.example.jspbasic.book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;

@WebServlet("/book/bookAdd")
public class BookAdd extends HttpServlet {
    HashMap<Long, Book> book = new HashMap<>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charSet=UTF-8");
        PrintWriter out = resp.getWriter();


        long no = Long.parseLong(req.getParameter("no"));
        String name = req.getParameter("name");
        String author = req.getParameter("author");
        LocalDate publishedDate = LocalDate.parse(req.getParameter("publishedDate"));

        book.put(no, new Book(no, name, author, publishedDate));
        req.setAttribute("no", book);

        req.getRequestDispatcher("/book/bookPrint.jsp").forward(req, resp);

    }
}