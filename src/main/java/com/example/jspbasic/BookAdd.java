package com.example.jspbasic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;

@WebServlet("/book-add")
public class BookAdd extends HttpServlet {
    HashMap<Long, Book>hm = new HashMap<>();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charSet=UTF-8");
        PrintWriter out = resp.getWriter();

        String no = req.getParameter("no");
        String bookName = req.getParameter("name");
        String author = req.getParameter("author");
        String publishedDate = req.getParameter("publishedDate");

        hm.put(Long.parseLong(no),new Book(Long.parseLong(no), bookName, author, LocalDate.parse(publishedDate)));
        req.setAttribute("hm", hm);
        req.getRequestDispatcher("/printBook.jsp").forward(req,resp);
    }
}
