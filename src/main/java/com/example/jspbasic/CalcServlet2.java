package com.example.jspbasic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "calcServlet", value = "/calc")
public class CalcServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = 0;

        String op = req.getParameter("op");

        switch (op) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num1 / num2;
                break;
        }

        // 동적 HTML을 응답 : JSP한테 맡기기
        // forward로 넘겨줄 때, req/resp를 함께 넘겨 주어야 한다.
        // forward (전달) -> 분업화 된 다른 서블릿을 호출하고 싶을 때 사용
        RequestDispatcher rd = req.getRequestDispatcher("calc2.jsp");
        req.setAttribute("result", result);   //jsp에서는 내장객체 request.getAttribute로 호출하면 됨.

        rd.forward(req, resp);



    }
}
